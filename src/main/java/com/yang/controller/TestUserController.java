package com.yang.controller;

import com.yang.dao.TestUserRepository;
import com.yang.vo.TestUser;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.Collection;

/**
 * Created with IntelliJ IDEA.
 * User: Jingyi.Yang
 * Date: 2016/7/27
 * Time: 18:03
 **/
@RestController
@RequestMapping("/users")
public class TestUserController {
    @Autowired
    private TestUserRepository testUserRepository;
/*
    @RequestMapping(value = "", method = RequestMethod.GET)
    public Collection<TestUser> getUserByName(@RequestParam(name = "name", required = true) String name) {
        return testUserRepository.findByQuery(name);
    }*/
}
