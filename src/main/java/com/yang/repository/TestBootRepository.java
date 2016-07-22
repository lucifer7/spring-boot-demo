package com.yang.repository;

import com.yang.entity.TestBoot;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import javax.persistence.criteria.CriteriaBuilder;

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
