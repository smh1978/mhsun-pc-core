package org.mhsun.pc.core.mapper;

import java.util.List;
import org.apache.ibatis.annotations.Param;
import org.mhsun.pc.core.model.MbgComputer;
import org.mhsun.pc.core.model.MbgComputerExample;

public interface MbgComputerMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table computer
     *
     * @mbg.generated Mon Aug 20 01:05:59 CST 2018
     */
    long countByExample(MbgComputerExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table computer
     *
     * @mbg.generated Mon Aug 20 01:05:59 CST 2018
     */
    int deleteByExample(MbgComputerExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table computer
     *
     * @mbg.generated Mon Aug 20 01:05:59 CST 2018
     */
    int deleteByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table computer
     *
     * @mbg.generated Mon Aug 20 01:05:59 CST 2018
     */
    int insert(MbgComputer record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table computer
     *
     * @mbg.generated Mon Aug 20 01:05:59 CST 2018
     */
    int insertSelective(MbgComputer record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table computer
     *
     * @mbg.generated Mon Aug 20 01:05:59 CST 2018
     */
    List<MbgComputer> selectByExample(MbgComputerExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table computer
     *
     * @mbg.generated Mon Aug 20 01:05:59 CST 2018
     */
    MbgComputer selectByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table computer
     *
     * @mbg.generated Mon Aug 20 01:05:59 CST 2018
     */
    int updateByExampleSelective(@Param("record") MbgComputer record, @Param("example") MbgComputerExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table computer
     *
     * @mbg.generated Mon Aug 20 01:05:59 CST 2018
     */
    int updateByExample(@Param("record") MbgComputer record, @Param("example") MbgComputerExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table computer
     *
     * @mbg.generated Mon Aug 20 01:05:59 CST 2018
     */
    int updateByPrimaryKeySelective(MbgComputer record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table computer
     *
     * @mbg.generated Mon Aug 20 01:05:59 CST 2018
     */
    int updateByPrimaryKey(MbgComputer record);
}