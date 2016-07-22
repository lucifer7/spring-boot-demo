package com.yang.dao;

import com.yang.vo.TestBoot;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

/**
 * Created with IntelliJ IDEA.
 * User: Jingyi.Yang
 * Date: 2016/7/22
 * Time: 17:31
 **/
@Repository
public interface TestBootRepository extends CrudRepository<TestBoot, Integer> {
    TestBoot findTestBootByValue(String value);
}
