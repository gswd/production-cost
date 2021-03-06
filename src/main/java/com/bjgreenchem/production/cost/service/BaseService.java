package com.bjgreenchem.production.cost.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import tk.mybatis.mapper.common.Mapper;

@Service
public abstract class BaseService<T> {

    @Autowired
    protected Mapper<T> mapper;

    public int save(T entity){
        return mapper.insert(entity);
    }

    public int delete(T entity){
        return mapper.deleteByPrimaryKey(entity);
    }
    

//    /**
//     * 单表分页查询
//     * 
//     * @param pageNum
//     * @param pageSize
//     * @return
//     */
//    public List<T> selectPage(int pageNum,int pageSize){
//        PageHelper.startPage(pageNum, pageSize);
//        //Spring4支持泛型注入
//        return mapper.select(null);
//    }
}