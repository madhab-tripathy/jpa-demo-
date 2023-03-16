package com.programmer.jpaDemo;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="user_info")
public class User {
    @Id // primary key
    @Column(name="id") // change column name
    int rollNo;
    String name;
    int age;
    String mobile;

    public User(){

    }
    public User(int rollNo, String name, int age, String mobile) {
        this.rollNo = rollNo;
        this.name = name;
        this.age = age;
        this.mobile = mobile;
    }

    public int getRollNo() {
        return rollNo;
    }

    public void setRollNo(int rollNo) {
        this.rollNo = rollNo;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getMobile() {
        return mobile;
    }

    public void setMobile(String mobile) {
        this.mobile = mobile;
    }
}
