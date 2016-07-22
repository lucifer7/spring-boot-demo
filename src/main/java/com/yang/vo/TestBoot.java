package com.yang.vo;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

/**
 * Created with IntelliJ IDEA.
 * User: Jingyi.Yang
 * Date: 2016/7/22
 * Time: 17:27
 **/
@Entity
@Data
public class TestBoot {
    @Id
    @GeneratedValue
    private Integer id;
    private String value;
}
