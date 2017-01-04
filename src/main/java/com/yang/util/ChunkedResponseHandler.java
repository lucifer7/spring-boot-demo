package com.yang.util;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

/**
 * Provides chunked transfer encoding response, for chunked ajax progress bar and output
 * Created with IntelliJ IDEA.
 * User: Jingyi.Yang
 * Date: 2016/6/28
 * Time: 14:55
 **/
//todo move other package
public class ChunkedResponseHandler {
    private transient static Log log = LogFactory.getLog(ChunkedResponseHandler.class);
    private HttpServletResponse response;

    private ChunkedResponseHandler(HttpServletResponse response) {
        this.response = response;
    }

    public static ChunkedResponseHandler newInstance(HttpServletResponse response) {
        // 设置Content-Type:application/x-javascript 以适应Webkit的浏览器(chrome,safari)
        response.setHeader("Content-Type","application/x-javascript");
        response.setCharacterEncoding("UTF-8");
        return new ChunkedResponseHandler(response);
    }

    public void chunkedResponse(Object data) {
        String s = JsonUtil.toJson(data);

        try {
            PrintWriter printWriter = response.getWriter();
            printWriter.write(s);
            printWriter.flush();
        } catch (IOException e) {
            log.error("Chunked response output error", e);
        }
    }

    public void close() {
        try {
            response.getWriter().close();
        } catch (IOException e) {
            log.error("Chunked response close error", e);
        }
    }
}
