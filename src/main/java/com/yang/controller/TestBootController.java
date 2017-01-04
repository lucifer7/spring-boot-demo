package com.yang.controller;

import com.google.common.collect.Maps;
import com.yang.dao.TestBootRepository;
import com.yang.vo.TestBoot;
import com.yang.vo.TestUser;
import lombok.extern.log4j.Log4j;
import org.json.JSONObject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletRequest;
import java.util.Collection;
import java.util.Map;

/**
 * Created with IntelliJ IDEA.
 * User: Jingyi.Yang
 * Date: 2016/7/26
 * Time: 15:51
 **/
@RestController
@RequestMapping("/test-boot")
@Log4j
public class TestBootController {
    @Autowired
    private TestBootRepository testBootRepository;

    @RequestMapping(method = RequestMethod.GET)
    public Iterable<TestBoot> getAllTestBoots() {
        return testBootRepository.findAll();
    }

    @RequestMapping(value = "/{id}", method = RequestMethod.GET)
    public Map<String, Object> getTestBoot(@PathVariable Integer id) {
        TestBoot testBoot = testBootRepository.findOne(id);

        Map<String, Object> result = Maps.newHashMap();
        result.put("message", "Get testBoot with id=" + id);
        result.put("data", testBoot);
        return result;
    }

    @RequestMapping(method = RequestMethod.POST, produces = {MediaType.APPLICATION_JSON_UTF8_VALUE})    /* 新增使用POST, 非幂等操作 */
    public Map<String, Object> addTestBoot(TestBoot testBoot) {
        testBoot = testBootRepository.save(testBoot);

        Map<String, Object> result = Maps.newHashMap();
        result.put("message", "TestBoot saved successfully.");
        result.put("data", testBoot);
        return result;
    }

    //@RequestMapping(value = "/{id}", method = RequestMethod.PUT, produces = {MediaType.APPLICATION_JSON_UTF8_VALUE}) /* PUT failed */
    // 注意测试时传参
    /* {
    "id": 2,
    "value": "value from put"
}       http://127.0.0.1:8090/test-boot/
*/
    // MIND: 不要在URL中传参，注意URL
    //@RequestMapping(value = "/put", method = RequestMethod.PUT)
    @RequestMapping(value = "/", method = RequestMethod.PUT)
    public @ResponseBody Map<String, Object> updateTestBoot(@RequestBody TestBoot testBoot) {
        //testBoot.setId(id);
        log.info(testBoot.toString());
        //testBoot = testBootRepository.save(testBoot);

        Map<String, Object> result = Maps.newHashMap();
        result.put("message", "TestBoot updated successfully.");
        result.put("data", testBoot);
        return result;
    }

    // http://127.0.0.1:8090/test-boot/?value=test171   // using cache
    @RequestMapping(value = "/", method = RequestMethod.GET)
    public TestBoot getUserByName(@RequestParam(name = "value") String value) {
        return testBootRepository.findTestBootByValue(value);
    }


    @RequestMapping(value = "/session", method = RequestMethod.GET)
    public String getSession(HttpServletRequest request) {
        return  request.getSession().getId();
    }
}
