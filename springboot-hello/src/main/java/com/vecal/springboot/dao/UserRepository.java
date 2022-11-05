package com.vecal.springboot.dao;

import com.vecal.springboot.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 * @author ZCH
 * @Description
 * @create 2022-11-05 22:42
 */
@Repository
public interface UserRepository extends JpaRepository<User, Integer> {

}
