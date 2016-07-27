package com.yang.controller;

import com.google.common.collect.Maps;
import com.yang.dao.TestBootRepository;
import com.yang.vo.TestBoot;
import org.json.JSONObject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletRequest;
import java.util.Map;

/**
 * Created with IntelliJ IDEA.
 * User: Jingyi.Yang
 * Date: 2016/7/26
 * Time: 15:51
 **/
@RestController
@RequestMapping("/test-boot")
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

    @RequestMapping(value = "/{id}", method = RequestMethod.PUT, produces = {MediaType.APPLICATION_JSON_UTF8_VALUE}) /* PUT failed */
    public Map<String, Object> updateTestBoot(@PathVariable Integer id,  TestBoot testBoot) {
        testBoot.setId(id);
        testBoot = testBootRepository.save(testBoot);

        Map<String, Object> result = Maps.newHashMap();
        result.put("message", "TestBoot updated successfully.");
        result.put("data", testBoot);
        return result;
    }

    @RequestMapping(value = "/session", method = RequestMethod.GET)
    public String getSession(HttpServletRequest request) {
        return  request.getSession().getId();
    }
}
