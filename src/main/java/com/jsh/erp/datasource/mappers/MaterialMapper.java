package com.jsh.erp.datasource.mappers;

import com.jsh.erp.datasource.entities.Material;
import com.jsh.erp.datasource.entities.MaterialExample;
import java.util.List;

import com.jsh.erp.datasource.entities.MaterialVo4Unit;
import org.apache.ibatis.annotations.Param;

public interface MaterialMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table jsh_material
     *
     * @mbggenerated
     */
    int countByExample(MaterialExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table jsh_material
     *
     * @mbggenerated
     */
    int deleteByExample(MaterialExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table jsh_material
     *
     * @mbggenerated
     */
    int deleteByPrimaryKey(Long id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table jsh_material
     *
     * @mbggenerated
     */
    int insert(Material record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table jsh_material
     *
     * @mbggenerated
     */
    int insertSelective(Material record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table jsh_material
     *
     * @mbggenerated
     */
    List<Material> selectByExample(MaterialExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table jsh_material
     *
     * @mbggenerated
     */
    Material selectByPrimaryKey(Long id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table jsh_material
     *
     * @mbggenerated
     */
    int updateByExampleSelective(@Param("record") Material record, @Param("example") MaterialExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table jsh_material
     *
     * @mbggenerated
     */
    int updateByExample(@Param("record") Material record, @Param("example") MaterialExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table jsh_material
     *
     * @mbggenerated
     */
    int updateByPrimaryKeySelective(Material record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table jsh_material
     *
     * @mbggenerated
     */
    int updateByPrimaryKey(Material record);

    List<Material> selectByConditionMaterial(
            @Param("name") String name,
            @Param("model") String model,
            @Param("offset") Integer offset,
            @Param("rows") Integer rows);

    int countsByMaterial(
            @Param("name") String name,
            @Param("model") String model);

    String findUnitName(@Param("mId") Long mId);

    List<MaterialVo4Unit> findById(@Param("id") Long id);

    List<MaterialVo4Unit> findBySelect();

}