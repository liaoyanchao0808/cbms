package com.hlh.cbms.controller;

import com.hlh.cbms.service.AdminService;
import com.hlh.cbms.utils.CateBean;
import com.hlh.cbms.utils.Result;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

@RestController
@Slf4j
@RequestMapping("/api/v1")
//    /api/v1/login
public class AdminController {

    @Resource
    AdminService adminService;

    @GetMapping("/login")
    public Result login(String aName,String password){
        try {
            CateBean cateBean = adminService.getlogin(aName,password);
            return Result.success(cateBean);
        } catch (Exception e) {
            log.debug(e.getMessage());
            return Result.error();
        }
    }
}
