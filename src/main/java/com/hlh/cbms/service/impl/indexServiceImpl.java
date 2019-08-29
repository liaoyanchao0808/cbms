package com.hlh.cbms.service.impl;

import com.hlh.cbms.domain.entity.Navigation;
import com.hlh.cbms.domain.vo.CoffeeShopVo;
import com.hlh.cbms.domain.vo.DirectoryVo;
import com.hlh.cbms.mapper.CoffeeShopMapper;
import com.hlh.cbms.mapper.DirectoryMapper;
import com.hlh.cbms.mapper.NavigationMapper;
import com.hlh.cbms.service.IndexService;
import com.hlh.cbms.utils.CateBean;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.ArrayList;

@Service
public class indexServiceImpl implements IndexService {

    @Resource
    CoffeeShopMapper coffeeShopVoMapper;
    @Resource
    NavigationMapper navigationMapper;
    @Resource
    DirectoryMapper directoryMapper;




    @Override
    public CateBean getHeader() {
        CateBean bean = new CateBean();
        ArrayList<Navigation> navigations = navigationMapper.findNavigations();
        ArrayList<DirectoryVo> directoryVos = directoryMapper.findDirectoryVos();
        bean.setNavigations(navigations);
        bean.setDirectoryVos(directoryVos);
        return bean;
    }

    @Override
    public ArrayList<CoffeeShopVo> findCoffeesShopVos() {

        return coffeeShopVoMapper.findByCoffeeShopVos();
    }
}
