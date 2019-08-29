package com.hlh.cbms.service;

import com.hlh.cbms.domain.vo.CoffeeShopVo;
import com.hlh.cbms.utils.CateBean;

import java.util.ArrayList;


public interface IndexService {
 CateBean getHeader();

 ArrayList<CoffeeShopVo> findCoffeesShopVos();
}
