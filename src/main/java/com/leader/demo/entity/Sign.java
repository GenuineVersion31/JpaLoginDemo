package com.leader.demo.entity;


import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.sql.Date;

/**
 * @author create by 李若阳
 * @description: com.leader.demo.entity
 * Created on 2020/9/11-10:53 下午
 */
@Entity
public class Sign {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    int id;
    String userid;
    Date month_date;
    int continue_sign_month;
}
