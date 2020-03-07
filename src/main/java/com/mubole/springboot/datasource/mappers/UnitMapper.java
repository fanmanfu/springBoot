package com.mubole.springboot.datasource.mappers;

import com.mubole.springboot.datasource.entities.Unit;
import com.mubole.springboot.datasource.entities.UnitExample;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface UnitMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table jsh_unit
     *
     * @mbggenerated
     */
    int countByExample(UnitExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table jsh_unit
     *
     * @mbggenerated
     */
    int deleteByExample(UnitExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table jsh_unit
     *
     * @mbggenerated
     */
    int deleteByPrimaryKey(Long id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table jsh_unit
     *
     * @mbggenerated
     */
    int insert(Unit record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table jsh_unit
     *
     * @mbggenerated
     */
    int insertSelective(Unit record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table jsh_unit
     *
     * @mbggenerated
     */
    List<Unit> selectByExample(UnitExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table jsh_unit
     *
     * @mbggenerated
     */
    Unit selectByPrimaryKey(Long id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table jsh_unit
     *
     * @mbggenerated
     */
    int updateByExampleSelective(@Param("record") Unit record, @Param("example") UnitExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table jsh_unit
     *
     * @mbggenerated
     */
    int updateByExample(@Param("record") Unit record, @Param("example") UnitExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table jsh_unit
     *
     * @mbggenerated
     */
    int updateByPrimaryKeySelective(Unit record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table jsh_unit
     *
     * @mbggenerated
     */
    int updateByPrimaryKey(Unit record);
}