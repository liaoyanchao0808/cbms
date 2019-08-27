package com.hlh.cbms.domain.vo;

import com.hlh.cbms.domain.entity.Address;
import com.hlh.cbms.domain.entity.Employee;
import com.hlh.cbms.domain.entity.Imgas;
import lombok.Data;

@Data
public class EmployeeVo extends Employee {

    Address address;

    Imgas imgas;
}
