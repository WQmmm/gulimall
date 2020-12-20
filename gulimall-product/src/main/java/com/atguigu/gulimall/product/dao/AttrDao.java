package com.atguigu.gulimall.product.dao;

import com.atguigu.gulimall.product.entity.AttrEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 商品属性
 * 
 * @author ly
 * @email ly@gmail.com
 * @date 2020-12-20 13:53:41
 */
@Mapper
public interface AttrDao extends BaseMapper<AttrEntity> {
	
}
