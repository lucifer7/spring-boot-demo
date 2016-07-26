package com.yang.controller;

import com.yang.dao.TestBootRepository;
import com.yang.vo.TestBoot;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

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

    @RequestMapping("/getStr") //2
    public String getStr(){
        return "personDao.getString()";
    }
}
