package com.yang.vo;

import lombok.Data;

import javax.persistence.*;
import java.sql.Date;

/**
 * Created with IntelliJ IDEA.
 * User: Jingyi.Yang
 * Date: 2016/7/27
 * Time: 11:26
 **/
@Entity
@Data
public class TestUser {
    @Id
    @GeneratedValue
    private Integer id;
    private String name;
    private Integer age;
    //@Temporal(TemporalType.TIMESTAMP)
    private Date createTime;
}
