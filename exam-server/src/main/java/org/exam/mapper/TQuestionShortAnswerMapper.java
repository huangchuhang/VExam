package org.exam.mapper;

import java.util.List;
import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.ResultMap;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;
import org.exam.bean.entity.TQuestionShortAnswer;
import org.exam.bean.entity.TQuestionShortAnswerExample;

public interface TQuestionShortAnswerMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_question_short_answer
     *
     * @mbg.generated Thu Apr 04 09:19:47 CST 2019
     */
    long countByExample(TQuestionShortAnswerExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_question_short_answer
     *
     * @mbg.generated Thu Apr 04 09:19:47 CST 2019
     */
    int deleteByExample(TQuestionShortAnswerExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_question_short_answer
     *
     * @mbg.generated Thu Apr 04 09:19:47 CST 2019
     */
    @Delete({
        "delete from t_question_short_answer",
        "where short_answer_id = #{shortAnswerId,jdbcType=BIGINT}"
    })
    int deleteByPrimaryKey(Long shortAnswerId);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_question_short_answer
     *
     * @mbg.generated Thu Apr 04 09:19:47 CST 2019
     */
    @Insert({
        "insert into t_question_short_answer (short_answer_id, short_answer_name, ",
        "answer, course_id, ",
        "is_del, create_time, ",
        "update_time, creator, ",
        "updater, version)",
        "values (#{shortAnswerId,jdbcType=BIGINT}, #{shortAnswerName,jdbcType=VARCHAR}, ",
        "#{answer,jdbcType=VARCHAR}, #{courseId,jdbcType=BIGINT}, ",
        "#{isDel,jdbcType=BIT}, #{createTime,jdbcType=TIMESTAMP}, ",
        "#{updateTime,jdbcType=TIMESTAMP}, #{creator,jdbcType=INTEGER}, ",
        "#{updater,jdbcType=INTEGER}, #{version,jdbcType=INTEGER})"
    })
    int insert(TQuestionShortAnswer record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_question_short_answer
     *
     * @mbg.generated Thu Apr 04 09:19:47 CST 2019
     */
    int insertSelective(TQuestionShortAnswer record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_question_short_answer
     *
     * @mbg.generated Thu Apr 04 09:19:47 CST 2019
     */
    List<TQuestionShortAnswer> selectByExample(TQuestionShortAnswerExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_question_short_answer
     *
     * @mbg.generated Thu Apr 04 09:19:47 CST 2019
     */
    @Select({
        "select",
        "short_answer_id, short_answer_name, answer, course_id, is_del, create_time, ",
        "update_time, creator, updater, version",
        "from t_question_short_answer",
        "where short_answer_id = #{shortAnswerId,jdbcType=BIGINT}"
    })
    @ResultMap("org.exam.mapper.TQuestionShortAnswerMapper.BaseResultMap")
    TQuestionShortAnswer selectByPrimaryKey(Long shortAnswerId);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_question_short_answer
     *
     * @mbg.generated Thu Apr 04 09:19:47 CST 2019
     */
    int updateByExampleSelective(@Param("record") TQuestionShortAnswer record, @Param("example") TQuestionShortAnswerExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_question_short_answer
     *
     * @mbg.generated Thu Apr 04 09:19:47 CST 2019
     */
    int updateByExample(@Param("record") TQuestionShortAnswer record, @Param("example") TQuestionShortAnswerExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_question_short_answer
     *
     * @mbg.generated Thu Apr 04 09:19:47 CST 2019
     */
    int updateByPrimaryKeySelective(TQuestionShortAnswer record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_question_short_answer
     *
     * @mbg.generated Thu Apr 04 09:19:47 CST 2019
     */
    @Update({
        "update t_question_short_answer",
        "set short_answer_name = #{shortAnswerName,jdbcType=VARCHAR},",
          "answer = #{answer,jdbcType=VARCHAR},",
          "course_id = #{courseId,jdbcType=BIGINT},",
          "is_del = #{isDel,jdbcType=BIT},",
          "create_time = #{createTime,jdbcType=TIMESTAMP},",
          "update_time = #{updateTime,jdbcType=TIMESTAMP},",
          "creator = #{creator,jdbcType=INTEGER},",
          "updater = #{updater,jdbcType=INTEGER},",
          "version = #{version,jdbcType=INTEGER}",
        "where short_answer_id = #{shortAnswerId,jdbcType=BIGINT}"
    })
    int updateByPrimaryKey(TQuestionShortAnswer record);
}