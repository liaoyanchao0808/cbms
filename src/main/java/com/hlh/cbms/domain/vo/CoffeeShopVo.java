package com.hlh.cbms.domain.vo;

import com.hlh.cbms.domain.entity.Coffee;
import com.hlh.cbms.domain.entity.CoffeeShop;
import com.hlh.cbms.domain.entity.Ice;
import com.hlh.cbms.domain.entity.Ielse;
import lombok.Data;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.Stack;

@Data
@Repository
public class CoffeeShopVo extends CoffeeShop {

    ArrayList<Coffee> coffees;

    ArrayList<Ice> ices;

    ArrayList<Ielse> ielses;

    ArrayList<Stack> stacks;
}
