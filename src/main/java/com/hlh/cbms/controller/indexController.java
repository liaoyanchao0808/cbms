package com.hlh.cbms.controller;

import com.hlh.cbms.domain.vo.EmployeeVo;
import com.hlh.cbms.service.EmployeeVoService;
import com.hlh.cbms.utils.Result;
import lombok.extern.slf4j.Slf4j;
import org.apache.ibatis.annotations.Param;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

@RestController
@Slf4j
@RequestMapping("/api/v1")
public class indexController {
    @Resource
    EmployeeVoService employeeVoService;

    @RequestMapping("/insert")
    public Result insert(EmployeeVo employeeVo){
        try {
            int rows = employeeVoService.findSave(employeeVo);
            return Result.success(rows);
        } catch (Exception e) {
            log.debug(e.getMessage());
            return Result.error();
        }

    }

    @RequestMapping("/update")
    public Result update(EmployeeVo employeeVo){
        try {
            int rows = employeeVoService.findUpdate(employeeVo);
            return Result.success(rows);
        } catch (Exception e) {
            log.debug(e.getMessage());
            return Result.error();
        }

    }

    @RequestMapping("/delete")
    public Result delete(String eid){
        try {
            int rows = employeeVoService.findDelete(eid);
            return Result.success(rows);
        } catch (Exception e) {
            log.debug(e.getMessage());
            return Result.error();
        }

    }
}
