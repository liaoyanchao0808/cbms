package com.hlh.cbms.mapper;

import com.hlh.cbms.domain.entity.Coffee;
import com.hlh.cbms.domain.entity.Ice;
import com.hlh.cbms.domain.entity.Ielse;
import com.hlh.cbms.domain.vo.CoffeeShopVo;

import java.util.ArrayList;
import java.util.Stack;

public interface CoffeeShopVoMapper {

    ArrayList<CoffeeShopVo> findByCoffeeShopVos();

    /*ArrayList<Coffee> findByCoffees();

    ArrayList<Ice> findByIces();

    ArrayList<Ielse> findByIelses();

    ArrayList<Stack> findByStacks();*/
}
