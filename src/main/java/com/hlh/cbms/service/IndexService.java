package com.hlh.cbms.service;

import com.hlh.cbms.domain.vo.CoffeeShopVo;
import com.hlh.cbms.mapper.CoffeeShopVoMapper;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.ArrayList;


public interface IndexService {

 ArrayList<CoffeeShopVo> findCoffeesShopVos();
}
