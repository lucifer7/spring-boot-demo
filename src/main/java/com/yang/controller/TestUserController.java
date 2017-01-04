package com.yang.controller;

import com.google.common.collect.Maps;
import com.yang.dao.TestUserRepository;
import com.yang.util.ChunkedResponseHandler;
import com.yang.vo.TestUser;
import lombok.extern.log4j.Log4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletResponse;
import java.util.Collection;
import java.util.Date;
import java.util.Map;

import static java.util.concurrent.TimeUnit.SECONDS;

/**
 * Created with IntelliJ IDEA.
 * User: Jingyi.Yang
 * Date: 2016/7/27
 * Time: 18:03
 **/
@Log4j
@RestController
@RequestMapping("/users")
public class TestUserController {
    @Autowired
    private TestUserRepository testUserRepository;

    @RequestMapping(value = "", method = RequestMethod.GET)
    public Collection<TestUser> getUserByName(@RequestParam(name = "name", required = true) String name) {
        return testUserRepository.findByQuery(name);
    }

    /* chunked transfer encoding test */
    @RequestMapping("/chunk")
    @ResponseBody
    @Deprecated
    public void chunk(HttpServletResponse response) {
        ChunkedResponseHandler responseHandler = ChunkedResponseHandler.newInstance(response);
        for (int i = 0; i < 7; i++) {
            try {
                SECONDS.sleep(2);
            } catch (InterruptedException e) {
                log.error("Response output interrupted.", e);
            }
            Map map = Maps.newHashMap();
            map.put("step", i);
            map.put("info", "program runs at " + new Date());
            responseHandler.chunkedResponse(map);
        }
        responseHandler.close();
    }


}
