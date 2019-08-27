package com.hlh.cbms.service.impl;

import com.hlh.cbms.domain.entity.Admin;
import com.hlh.cbms.domain.vo.EmployeeVo;
import com.hlh.cbms.mapper.AdminMapper;
import com.hlh.cbms.mapper.EmployeeVoMapper;
import com.hlh.cbms.service.AdminService;
import com.hlh.cbms.utils.CateBean;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.ArrayList;

@Service
public class AdminServiceImpl implements AdminService {
    @Resource
    AdminMapper adminMapper;
    @Resource
    EmployeeVoMapper employeeVoMapper;


    @Override
    public CateBean getlogin(String aName,String password) {
        CateBean bean = new CateBean();
        Admin admin = adminMapper.loginName(aName, password);
        ArrayList<EmployeeVo> employeeVos = employeeVoMapper.findByEmployeeVos();

        bean.setAdmin(admin);
        bean.setEmployeeVos(employeeVos);
        return bean;

    }
}
