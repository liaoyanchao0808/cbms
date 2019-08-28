package com.hlh.cbms.service.impl;

import com.hlh.cbms.domain.vo.CoffeeShopVo;
import com.hlh.cbms.mapper.CoffeeShopVoMapper;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.ArrayList;

@Service
public class indexServiceImpl {

    @Resource
    CoffeeShopVoMapper coffeeShopVoMapper;

    public ArrayList<CoffeeShopVo> getContent(){
        return coffeeShopVoMapper.findByCoffeeShopVos();
    }
}
