package org.mhsun.pc.core.mapper;

import java.util.List;
import org.apache.ibatis.annotations.Param;
import org.mhsun.pc.core.model.MbgComment;
import org.mhsun.pc.core.model.MbgCommentExample;

public interface MbgCommentMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table pc_comment
     *
     * @mbg.generated Mon Aug 20 01:05:59 CST 2018
     */
    long countByExample(MbgCommentExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table pc_comment
     *
     * @mbg.generated Mon Aug 20 01:05:59 CST 2018
     */
    int deleteByExample(MbgCommentExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table pc_comment
     *
     * @mbg.generated Mon Aug 20 01:05:59 CST 2018
     */
    int deleteByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table pc_comment
     *
     * @mbg.generated Mon Aug 20 01:05:59 CST 2018
     */
    int insert(MbgComment record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table pc_comment
     *
     * @mbg.generated Mon Aug 20 01:05:59 CST 2018
     */
    int insertSelective(MbgComment record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table pc_comment
     *
     * @mbg.generated Mon Aug 20 01:05:59 CST 2018
     */
    List<MbgComment> selectByExample(MbgCommentExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table pc_comment
     *
     * @mbg.generated Mon Aug 20 01:05:59 CST 2018
     */
    MbgComment selectByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table pc_comment
     *
     * @mbg.generated Mon Aug 20 01:05:59 CST 2018
     */
    int updateByExampleSelective(@Param("record") MbgComment record, @Param("example") MbgCommentExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table pc_comment
     *
     * @mbg.generated Mon Aug 20 01:05:59 CST 2018
     */
    int updateByExample(@Param("record") MbgComment record, @Param("example") MbgCommentExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table pc_comment
     *
     * @mbg.generated Mon Aug 20 01:05:59 CST 2018
     */
    int updateByPrimaryKeySelective(MbgComment record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table pc_comment
     *
     * @mbg.generated Mon Aug 20 01:05:59 CST 2018
     */
    int updateByPrimaryKey(MbgComment record);
}