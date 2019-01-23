package com.jonas.entity;

import lombok.Data;
import lombok.experimental.Accessors;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * 【 enter the class description 】
 *
 * @author shenjy 2019/01/23
 */
@Data
@Accessors(chain = true)
@Entity
@Table(name = "user")
public class User {

    @Id
    private Long id;

    @Column(name = "name")
    private String name;

    @Column(name = "age")
    private Integer age;

    @Column(name = "email")
    private String email;

    @Column(name = "ctime")
    private Long ctime;

    @Column(name = "utime")
    private Long utime;
}
