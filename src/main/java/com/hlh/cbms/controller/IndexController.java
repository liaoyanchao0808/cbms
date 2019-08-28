package com.hlh.cbms.controller;

import com.hlh.cbms.domain.vo.CoffeeShopVo;
import com.hlh.cbms.service.IndexService;
import com.hlh.cbms.utils.Result;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.ArrayList;

@RestController
@Slf4j
@RequestMapping("/api/v1")
public class IndexController {

   @Resource
    IndexService indexService;
    public Result getHeaderData(){
        return null;
    }



    //分类商品信息

    @RequestMapping("/index")
    public Result getContentData(){
        try {
            ArrayList<CoffeeShopVo> coffeesShopVos = indexService.findCoffeesShopVos();
            return Result.success(coffeesShopVos);
        } catch (Exception e) {
            log.debug(e.getMessage());
            return Result.error();
        }
    }
}
