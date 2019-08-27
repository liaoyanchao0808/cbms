package com.hlh.cbms.mapper;

import com.hlh.cbms.domain.vo.EmployeeVo;
import org.apache.ibatis.annotations.Param;

import java.util.ArrayList;

public interface EmployeeVoMapper {

    ArrayList<EmployeeVo> findByEmployeeVos();

    int findBySave(@Param("employeeVo") EmployeeVo employeeVo);

    int findByUpdate(@Param("employeeVo") EmployeeVo employeeVo);

    int findByDelete(@Param("eid") String eid);
}
