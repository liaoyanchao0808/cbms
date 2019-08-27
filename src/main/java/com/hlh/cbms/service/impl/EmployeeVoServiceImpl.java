package com.hlh.cbms.service.impl;

import com.hlh.cbms.domain.vo.EmployeeVo;
import com.hlh.cbms.mapper.EmployeeVoMapper;
import com.hlh.cbms.service.EmployeeVoService;
import com.hlh.cbms.utils.CateBean;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

@Service
public class EmployeeVoServiceImpl implements EmployeeVoService {
    @Resource
    EmployeeVoMapper employeeVoMapper;
    CateBean bean = new CateBean();

    @Override
    public int findSave(EmployeeVo employeeVo) {
        return employeeVoMapper.findBySave(employeeVo);
    }

    @Override
    public int findUpdate(EmployeeVo employeeVo) {
        return employeeVoMapper.findByUpdate(employeeVo);
    }

    @Override
    public int findDelete(String eid) {
        return employeeVoMapper.findByDelete(eid);
    }
}
