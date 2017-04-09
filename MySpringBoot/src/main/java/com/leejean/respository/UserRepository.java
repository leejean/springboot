package com.leejean.respository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.leejean.entitys.User;


/**
 * 
 * TODO 在此写上类的相关说明.<br>
 * @author Leejean <br>
 * @version 1.0.0 2017年4月9日 下午1:42:43<br>
 * @see 
 * @since JDK 1.7.0
 */
public interface UserRepository extends JpaRepository<User, Long> {

    User findByName(String name);

    User findByNameAndAge(String name, Integer age);

    @Query("from User u where u.name=:name")
    User findUser(@Param("name") String name);

    @Query("from User u where u.id=:id")
    User findUserById(@Param("id") Long id);

}
