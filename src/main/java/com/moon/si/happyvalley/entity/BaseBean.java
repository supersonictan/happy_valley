package com.moon.si.happyvalley.entity;

import java.io.Serializable;

/**
 * Created by ZeYu
 * Date: 2017/2/7.
 * Time: 15:47.
 * DESC: say something
 */
public class BaseBean implements Serializable {

    private Integer page;

    /**每页条数**/
    private Integer pageSize = 10;

    /**偏移量**/
    private Integer offset;


    public int getPage() {
        return page;
    }

    public void setPage(int page) {
        this.page = page;
    }

    public int getPageSize() {
        return pageSize;
    }

    public void setPageSize(int pageSize) {
        this.pageSize = pageSize;
    }

    public Integer getOffset() {
        return offset;
    }

    public void setOffset(Integer offset) {
        this.offset = offset;
    }
}
