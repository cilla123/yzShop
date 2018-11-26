package com.ben.yzshop.sellergoods.service.impl;

import com.alibaba.dubbo.config.annotation.Service;
import com.ben.yzshop.mapper.TbBrandMapper;
import com.ben.yzshop.pojo.TbBrand;
import com.ben.yzshop.sellergoods.service.BrandService;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

@Service
public class BrandServiceImpl implements BrandService {

    @Autowired
    private TbBrandMapper tbBrandMapper;

    @Override
    public List<TbBrand> findAll() {
        return tbBrandMapper.selectByExample(null);
    }

}
