package com.hlh.cbms.service;

import com.hlh.cbms.domain.vo.EmployeeVo;
import com.hlh.cbms.utils.CateBean;
import org.apache.ibatis.annotations.Param;

import java.util.ArrayList;

public interface EmployeeVoService {

    //ArrayList<EmployeeVo> findEmployeeVos();

    int findSave(EmployeeVo employeeVo);

    int findUpdate(EmployeeVo employeeVo);

    int findDelete(String eid);
}
