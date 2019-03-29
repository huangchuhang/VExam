package org.exam.mapper;

import java.util.List;
import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.ResultMap;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;
import org.exam.bean.entity.TAcademy;
import org.exam.bean.entity.TAcademyExample;

public interface TAcademyMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_academy
     *
     * @mbg.generated Fri Mar 29 23:04:33 CST 2019
     */
    long countByExample(TAcademyExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_academy
     *
     * @mbg.generated Fri Mar 29 23:04:33 CST 2019
     */
    int deleteByExample(TAcademyExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_academy
     *
     * @mbg.generated Fri Mar 29 23:04:33 CST 2019
     */
    @Delete({
        "delete from t_academy",
        "where id = #{id,jdbcType=BIGINT}"
    })
    int deleteByPrimaryKey(Long id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_academy
     *
     * @mbg.generated Fri Mar 29 23:04:33 CST 2019
     */
    @Insert({
        "insert into t_academy (id, academy_no, ",
        "academy_name, is_del, ",
        "create_time, update_time, ",
        "creater, updater, ",
        "version)",
        "values (#{id,jdbcType=BIGINT}, #{academyNo,jdbcType=BIGINT}, ",
        "#{academyName,jdbcType=VARCHAR}, #{isDel,jdbcType=BIT}, ",
        "#{createTime,jdbcType=BIGINT}, #{updateTime,jdbcType=BIGINT}, ",
        "#{creater,jdbcType=INTEGER}, #{updater,jdbcType=INTEGER}, ",
        "#{version,jdbcType=INTEGER})"
    })
    int insert(TAcademy record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_academy
     *
     * @mbg.generated Fri Mar 29 23:04:33 CST 2019
     */
    int insertSelective(TAcademy record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_academy
     *
     * @mbg.generated Fri Mar 29 23:04:33 CST 2019
     */
    List<TAcademy> selectByExample(TAcademyExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_academy
     *
     * @mbg.generated Fri Mar 29 23:04:33 CST 2019
     */
    @Select({
        "select",
        "id, academy_no, academy_name, is_del, create_time, update_time, creater, updater, ",
        "version",
        "from t_academy",
        "where id = #{id,jdbcType=BIGINT}"
    })
    @ResultMap("org.exam.mapper.TAcademyMapper.BaseResultMap")
    TAcademy selectByPrimaryKey(Long id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_academy
     *
     * @mbg.generated Fri Mar 29 23:04:33 CST 2019
     */
    int updateByExampleSelective(@Param("record") TAcademy record, @Param("example") TAcademyExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_academy
     *
     * @mbg.generated Fri Mar 29 23:04:33 CST 2019
     */
    int updateByExample(@Param("record") TAcademy record, @Param("example") TAcademyExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_academy
     *
     * @mbg.generated Fri Mar 29 23:04:33 CST 2019
     */
    int updateByPrimaryKeySelective(TAcademy record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_academy
     *
     * @mbg.generated Fri Mar 29 23:04:33 CST 2019
     */
    @Update({
        "update t_academy",
        "set academy_no = #{academyNo,jdbcType=BIGINT},",
          "academy_name = #{academyName,jdbcType=VARCHAR},",
          "is_del = #{isDel,jdbcType=BIT},",
          "create_time = #{createTime,jdbcType=BIGINT},",
          "update_time = #{updateTime,jdbcType=BIGINT},",
          "creater = #{creater,jdbcType=INTEGER},",
          "updater = #{updater,jdbcType=INTEGER},",
          "version = #{version,jdbcType=INTEGER}",
        "where id = #{id,jdbcType=BIGINT}"
    })
    int updateByPrimaryKey(TAcademy record);
}