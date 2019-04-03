package org.exam.mapper;

import java.util.List;
import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.ResultMap;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;
import org.exam.bean.entity.TCourse;
import org.exam.bean.entity.TCourseExample;

public interface TCourseMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_course
     *
     * @mbg.generated Wed Apr 03 11:58:19 CST 2019
     */
    long countByExample(TCourseExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_course
     *
     * @mbg.generated Wed Apr 03 11:58:19 CST 2019
     */
    int deleteByExample(TCourseExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_course
     *
     * @mbg.generated Wed Apr 03 11:58:19 CST 2019
     */
    @Delete({
        "delete from t_course",
        "where course_id = #{courseId,jdbcType=BIGINT}"
    })
    int deleteByPrimaryKey(Long courseId);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_course
     *
     * @mbg.generated Wed Apr 03 11:58:19 CST 2019
     */
    @Insert({
        "insert into t_course (course_id, course_name, ",
        "major_id, creator, ",
        "updater, version, ",
        "is_del, create_time, ",
        "update_time)",
        "values (#{courseId,jdbcType=BIGINT}, #{courseName,jdbcType=VARCHAR}, ",
        "#{majorId,jdbcType=BIGINT}, #{creator,jdbcType=BIGINT}, ",
        "#{updater,jdbcType=BIGINT}, #{version,jdbcType=INTEGER}, ",
        "#{isDel,jdbcType=BIT}, #{createTime,jdbcType=TIMESTAMP}, ",
        "#{updateTime,jdbcType=TIMESTAMP})"
    })
    int insert(TCourse record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_course
     *
     * @mbg.generated Wed Apr 03 11:58:19 CST 2019
     */
    int insertSelective(TCourse record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_course
     *
     * @mbg.generated Wed Apr 03 11:58:19 CST 2019
     */
    List<TCourse> selectByExample(TCourseExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_course
     *
     * @mbg.generated Wed Apr 03 11:58:19 CST 2019
     */
    @Select({
        "select",
        "course_id, course_name, major_id, creator, updater, version, is_del, create_time, ",
        "update_time",
        "from t_course",
        "where course_id = #{courseId,jdbcType=BIGINT}"
    })
    @ResultMap("org.exam.mapper.TCourseMapper.BaseResultMap")
    TCourse selectByPrimaryKey(Long courseId);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_course
     *
     * @mbg.generated Wed Apr 03 11:58:19 CST 2019
     */
    int updateByExampleSelective(@Param("record") TCourse record, @Param("example") TCourseExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_course
     *
     * @mbg.generated Wed Apr 03 11:58:19 CST 2019
     */
    int updateByExample(@Param("record") TCourse record, @Param("example") TCourseExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_course
     *
     * @mbg.generated Wed Apr 03 11:58:19 CST 2019
     */
    int updateByPrimaryKeySelective(TCourse record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_course
     *
     * @mbg.generated Wed Apr 03 11:58:19 CST 2019
     */
    @Update({
        "update t_course",
        "set course_name = #{courseName,jdbcType=VARCHAR},",
          "major_id = #{majorId,jdbcType=BIGINT},",
          "creator = #{creator,jdbcType=BIGINT},",
          "updater = #{updater,jdbcType=BIGINT},",
          "version = #{version,jdbcType=INTEGER},",
          "is_del = #{isDel,jdbcType=BIT},",
          "create_time = #{createTime,jdbcType=TIMESTAMP},",
          "update_time = #{updateTime,jdbcType=TIMESTAMP}",
        "where course_id = #{courseId,jdbcType=BIGINT}"
    })
    int updateByPrimaryKey(TCourse record);
}