package com.ahut.service;

import com.ahut.pojo.Brand;
import com.ahut.pojo.PageBean;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface BrandService {

    void add(Brand brand);

    void deleteById(int id);

    void deleteByIds(@Param("ids") int[] ids);

    void update(Brand brand);

    List<Brand> selectAll();

    Brand selectById(Integer id);

    /**
     * 分页查询
     *
     * @param currentPage
     * @param pageSize
     * @return
     */
    PageBean<Brand> selectByPage(int currentPage, int pageSize);

    /**
     * 分页条件查询
     *
     * @param currentPage
     * @param pageSize
     * @param brand
     * @return
     */
    PageBean<Brand> selectByPageAndCondition(int currentPage, int pageSize, Brand brand);

}
