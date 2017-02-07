package com.moon.si.happyvalley.dao;

import java.io.Serializable;
import java.util.List;

/**
 * Created by ZeYu
 * Date: 2017/2/7.
 * Time: 14:20.
 * DESC: Mapper.java 实现的接口，定义了增删改查
 */
public interface BaseMapper<T extends Serializable> {

    /**增加**/
    public Integer insert(T entity);

    /**根据id更新数据**/
    public Integer update(T entity);

    /**批量删除**/
    public Integer deleteByIds(List<Integer> ids);

    /**批量查询**/
    public List<T> findList(T param);

    /**查找总量**/
    public Integer findCount(T param);

}
