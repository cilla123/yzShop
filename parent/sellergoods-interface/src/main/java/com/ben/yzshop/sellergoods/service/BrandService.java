package com.ben.yzshop.sellergoods.service;

import com.ben.yzshop.pojo.TbBrand;

import java.util.List;

/**
 * 品牌接口
 */
public interface BrandService {

    /**
     * 返回全部列表
     * @return
     */
    public List<TbBrand> findAll();

}
