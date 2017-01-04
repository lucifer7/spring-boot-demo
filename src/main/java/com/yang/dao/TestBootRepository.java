package com.yang.dao;

import com.yang.vo.TestBoot;
import org.springframework.cache.annotation.CacheConfig;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

/**
 * Created with IntelliJ IDEA.
 * User: Jingyi.Yang
 * Date: 2016/7/22
 * Time: 17:31
 **/
@Repository
@CacheConfig(cacheNames = "boots")
public interface TestBootRepository extends CrudRepository<TestBoot, Integer> {
    @Cacheable
    TestBoot findTestBootByValue(String value);
}
