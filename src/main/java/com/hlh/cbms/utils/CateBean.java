package com.hlh.cbms.utils;


import com.hlh.cbms.domain.entity.Admin;
import com.hlh.cbms.domain.vo.EmployeeVo;
import lombok.Data;

import java.io.Serializable;
import java.util.ArrayList;

@Data
public class CateBean implements Serializable {
     Admin admin;
    ArrayList<EmployeeVo> employeeVos;

}
