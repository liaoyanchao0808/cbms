package com.hlh.cbms.domain.entity;

import java.math.BigDecimal;
import java.util.Date;
import lombok.Data;

@Data
public class Employee {
    /**
    * 用户ID
    */
    private String eid;

    private String username;

    /**
    * 手机号码
    */
    private String eMobile;

    /**
    * 工资
    */
    private BigDecimal salary;

    /**
    * 入职时间
    */
    private Date jionDate;

    /**
    * 员工职位
    */
    private String eLevel;

    /**
    * 员工等级
    */
    private Byte isSupper;

    /**
    * 1 表示 在职 0 表示离职
    */
    private Byte status;
}