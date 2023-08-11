package com.ahut.mapper;

import com.ahut.pojo.Brand;
import org.apache.ibatis.annotations.*;

import java.util.List;

public interface BrandMapper {

    //  注释test
    //git_test：查询功能实现
    //git_test：登出功能实现

    @Insert("insert into tb_brand values (null,#{brandName},#{companyName},#{ordered},#{description},#{status});")
    void add(Brand brand);

    @Delete("delete from tb_brand where id=#{id};")
    void deleteById(int id);

    void deleteByIds(@Param("ids") int[] ids);

    @Update("update tb_brand set brand_name = #{brandName}, company_name =#{companyName},ordered =#{ordered}, description =#{description} , status =#{status} where id=#{id};")
    void update(Brand brand);

    @Select("select * from tb_brand;")
    @ResultMap("brandResultMap")
    List<Brand> selectAll();

    @Select("select * from tb_brand where id=#{id};")
    Brand selectById(Integer id);

    /**
     * 分页查询
     *
     * @param begin
     * @param size
     * @return
     */
    @Select("select * from tb_brand limit #{begin},#{size};")
    @ResultMap("brandResultMap")
    List<Brand> selectByPage(@Param("begin") int begin, @Param("size") int size);

    /**
     * 分页条件查询
     *
     * @param begin
     * @param size
     * @return
     */
    List<Brand> selectByPageAndCondition(@Param("begin") int begin, @Param("size") int size, @Param("brand") Brand brand);

    /**
     * 查询总记录数
     *
     * @return
     */
    @Select("select count(*) from tb_brand;")
    int selectTotalCount();

    /**
     * 根据条件查询总记录数
     *
     * @return
     */
    int selectTotalCountByCondition(Brand brand);
}
