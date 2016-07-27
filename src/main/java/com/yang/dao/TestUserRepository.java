package com.yang.dao;

import com.yang.vo.TestUser;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import java.util.List;

/**
 * Created with IntelliJ IDEA.
 * User: Jingyi.Yang
 * Date: 2016/7/27
 * Time: 11:28
 * 自动生成REST API和分页排序
 **/
@RepositoryRestResource(path = "users")
public interface TestUserRepository extends PagingAndSortingRepository<TestUser, Integer> {
    @Query("select u from TestUser u where u.name like ?1")
    public List<TestUser> findByQuery(String name);
}

/* test GET: http://127.0.0.1:8080/testUsers */
/* test PUT: http://127.0.0.1:8080/testUsers/1 use json */