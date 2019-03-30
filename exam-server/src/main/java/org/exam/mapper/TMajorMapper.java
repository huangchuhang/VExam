package org.exam.mapper;

import java.util.List;
import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.ResultMap;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;
import org.exam.bean.entity.TMajor;
import org.exam.bean.entity.TMajorExample;

public interface TMajorMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_major
     *
     * @mbg.generated Sat Mar 30 15:17:40 CST 2019
     */
    long countByExample(TMajorExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_major
     *
     * @mbg.generated Sat Mar 30 15:17:40 CST 2019
     */
    int deleteByExample(TMajorExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_major
     *
     * @mbg.generated Sat Mar 30 15:17:40 CST 2019
     */
    @Delete({
        "delete from t_major",
        "where id = #{id,jdbcType=BIGINT}"
    })
    int deleteByPrimaryKey(Long id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_major
     *
     * @mbg.generated Sat Mar 30 15:17:40 CST 2019
     */
    @Insert({
        "insert into t_major (id, major_no, ",
        "major_name, academy_id, ",
        "is_del, create_time, ",
        "update_time, creator, ",
        "updater, version)",
        "values (#{id,jdbcType=BIGINT}, #{majorNo,jdbcType=BIGINT}, ",
        "#{majorName,jdbcType=VARCHAR}, #{academyId,jdbcType=BIGINT}, ",
        "#{isDel,jdbcType=BIT}, #{createTime,jdbcType=TIMESTAMP}, ",
        "#{updateTime,jdbcType=TIMESTAMP}, #{creator,jdbcType=INTEGER}, ",
        "#{updater,jdbcType=INTEGER}, #{version,jdbcType=INTEGER})"
    })
    int insert(TMajor record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_major
     *
     * @mbg.generated Sat Mar 30 15:17:40 CST 2019
     */
    int insertSelective(TMajor record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_major
     *
     * @mbg.generated Sat Mar 30 15:17:40 CST 2019
     */
    List<TMajor> selectByExample(TMajorExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_major
     *
     * @mbg.generated Sat Mar 30 15:17:40 CST 2019
     */
    @Select({
        "select",
        "id, major_no, major_name, academy_id, is_del, create_time, update_time, creator, ",
        "updater, version",
        "from t_major",
        "where id = #{id,jdbcType=BIGINT}"
    })
    @ResultMap("org.exam.mapper.TMajorMapper.BaseResultMap")
    TMajor selectByPrimaryKey(Long id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_major
     *
     * @mbg.generated Sat Mar 30 15:17:40 CST 2019
     */
    int updateByExampleSelective(@Param("record") TMajor record, @Param("example") TMajorExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_major
     *
     * @mbg.generated Sat Mar 30 15:17:40 CST 2019
     */
    int updateByExample(@Param("record") TMajor record, @Param("example") TMajorExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_major
     *
     * @mbg.generated Sat Mar 30 15:17:40 CST 2019
     */
    int updateByPrimaryKeySelective(TMajor record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_major
     *
     * @mbg.generated Sat Mar 30 15:17:40 CST 2019
     */
    @Update({
        "update t_major",
        "set major_no = #{majorNo,jdbcType=BIGINT},",
          "major_name = #{majorName,jdbcType=VARCHAR},",
          "academy_id = #{academyId,jdbcType=BIGINT},",
          "is_del = #{isDel,jdbcType=BIT},",
          "create_time = #{createTime,jdbcType=TIMESTAMP},",
          "update_time = #{updateTime,jdbcType=TIMESTAMP},",
          "creator = #{creator,jdbcType=INTEGER},",
          "updater = #{updater,jdbcType=INTEGER},",
          "version = #{version,jdbcType=INTEGER}",
        "where id = #{id,jdbcType=BIGINT}"
    })
    int updateByPrimaryKey(TMajor record);
}