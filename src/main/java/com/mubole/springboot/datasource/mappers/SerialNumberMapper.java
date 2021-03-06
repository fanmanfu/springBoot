package com.mubole.springboot.datasource.mappers;

import com.mubole.springboot.datasource.entities.SerialNumber;
import com.mubole.springboot.datasource.entities.SerialNumberExample;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface SerialNumberMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table jsh_serial_number
     *
     * @mbggenerated
     */
    int countByExample(SerialNumberExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table jsh_serial_number
     *
     * @mbggenerated
     */
    int deleteByExample(SerialNumberExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table jsh_serial_number
     *
     * @mbggenerated
     */
    int deleteByPrimaryKey(Long id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table jsh_serial_number
     *
     * @mbggenerated
     */
    int insert(SerialNumber record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table jsh_serial_number
     *
     * @mbggenerated
     */
    int insertSelective(SerialNumber record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table jsh_serial_number
     *
     * @mbggenerated
     */
    List<SerialNumber> selectByExample(SerialNumberExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table jsh_serial_number
     *
     * @mbggenerated
     */
    SerialNumber selectByPrimaryKey(Long id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table jsh_serial_number
     *
     * @mbggenerated
     */
    int updateByExampleSelective(@Param("record") SerialNumber record, @Param("example") SerialNumberExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table jsh_serial_number
     *
     * @mbggenerated
     */
    int updateByExample(@Param("record") SerialNumber record, @Param("example") SerialNumberExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table jsh_serial_number
     *
     * @mbggenerated
     */
    int updateByPrimaryKeySelective(SerialNumber record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table jsh_serial_number
     *
     * @mbggenerated
     */
    int updateByPrimaryKey(SerialNumber record);
}