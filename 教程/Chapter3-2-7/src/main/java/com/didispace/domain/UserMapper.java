package com.didispace.domain;

import org.apache.ibatis.annotations.*;

@Mapper
public interface UserMapper {

    @Select("SELECT * FROM t_user WHERE name = #{name}")
    User findByName(@Param("name") String name);

    @Insert("INSERT INTO t_user(name, age) VALUES(#{name}, #{age})")
    int insert(@Param("name") String name, @Param("age") Integer age);

}