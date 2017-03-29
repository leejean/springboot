package com.didispace.domain;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;
/**
 * @author 程序猿DD
 * @version 1.0.0
 * @date 16/3/21 下午3:35.
 * @blog http://blog.didispace.com
 */
@Entity
@Table(name="t_user")
public class User {

	@Id
    @GeneratedValue
    private Long id;

    @Column(nullable = false)
    private String name;

    @Column(nullable = false,columnDefinition="int(11) NOT NULL DEFAULT '0'")
    private Integer age;
    
    @Column(columnDefinition="decimal(15,2) NOT NULL DEFAULT '0.00'")
    private Double height;
    
    @Column(columnDefinition = "timestamp NULL COMMENT '生日'")
    private Date birthday;
    
    @Column(name = "create_time",columnDefinition = "timestamp NULL DEFAULT CURRENT_TIMESTAMP COMMENT '创建时间'")
    private Date createTime; 
    
    @Column(name = "update_time",columnDefinition = "timestamp NULL DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP COMMENT '修改时间'")
    private Date updateTime;

    public User(){}

    public User(String name, Integer age, Double height) {
        this.name = name;
        this.age = age;
        this.height = height;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

}
