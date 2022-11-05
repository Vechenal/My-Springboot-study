package com.vecal.springboot.entity;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * @author ZCH
 * @Description
 * @create 2022-11-05 22:40
 */
@Data
@Entity
@Table(name = "tb_user")
public class User {

    @Id
    private int userId;

    private String userName;
}
