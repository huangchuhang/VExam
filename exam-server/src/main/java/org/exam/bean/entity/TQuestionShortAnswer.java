package org.exam.bean.entity;

import java.util.Date;

/**
 * Database Table Remarks:
 *   简答题
 *
 * This class was generated by MyBatis Generator.
 * This class corresponds to the database table t_question_short_answer
 *
 * @mbg.generated do_not_delete_during_merge Mon Apr 29 20:20:44 CST 2019
 */
public class TQuestionShortAnswer {
    /**
     * Database Column Remarks:
     *   编号
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_question_short_answer.short_answer_id
     *
     * @mbg.generated Mon Apr 29 20:20:44 CST 2019
     */
    private Long shortAnswerId;

    /**
     * Database Column Remarks:
     *   名称
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_question_short_answer.short_answer_name
     *
     * @mbg.generated Mon Apr 29 20:20:44 CST 2019
     */
    private String shortAnswerName;

    /**
     * Database Column Remarks:
     *   答案
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_question_short_answer.answer
     *
     * @mbg.generated Mon Apr 29 20:20:44 CST 2019
     */
    private String answer;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_question_short_answer.course_id
     *
     * @mbg.generated Mon Apr 29 20:20:44 CST 2019
     */
    private Long courseId;

    /**
     * Database Column Remarks:
     *   删除标识
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_question_short_answer.is_del
     *
     * @mbg.generated Mon Apr 29 20:20:44 CST 2019
     */
    private Boolean isDel;

    /**
     * Database Column Remarks:
     *   创建时间
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_question_short_answer.create_time
     *
     * @mbg.generated Mon Apr 29 20:20:44 CST 2019
     */
    private Date createTime;

    /**
     * Database Column Remarks:
     *   更新时间
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_question_short_answer.update_time
     *
     * @mbg.generated Mon Apr 29 20:20:44 CST 2019
     */
    private Date updateTime;

    /**
     * Database Column Remarks:
     *   创建者
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_question_short_answer.creator
     *
     * @mbg.generated Mon Apr 29 20:20:44 CST 2019
     */
    private Long creator;

    /**
     * Database Column Remarks:
     *   更新者
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_question_short_answer.updater
     *
     * @mbg.generated Mon Apr 29 20:20:44 CST 2019
     */
    private Long updater;

    /**
     * Database Column Remarks:
     *   版本号，乐观锁专用
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_question_short_answer.version
     *
     * @mbg.generated Mon Apr 29 20:20:44 CST 2019
     */
    private Integer version;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_question_short_answer.short_answer_id
     *
     * @return the value of t_question_short_answer.short_answer_id
     *
     * @mbg.generated Mon Apr 29 20:20:44 CST 2019
     */
    public Long getShortAnswerId() {
        return shortAnswerId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_question_short_answer.short_answer_id
     *
     * @param shortAnswerId the value for t_question_short_answer.short_answer_id
     *
     * @mbg.generated Mon Apr 29 20:20:44 CST 2019
     */
    public void setShortAnswerId(Long shortAnswerId) {
        this.shortAnswerId = shortAnswerId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_question_short_answer.short_answer_name
     *
     * @return the value of t_question_short_answer.short_answer_name
     *
     * @mbg.generated Mon Apr 29 20:20:44 CST 2019
     */
    public String getShortAnswerName() {
        return shortAnswerName;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_question_short_answer.short_answer_name
     *
     * @param shortAnswerName the value for t_question_short_answer.short_answer_name
     *
     * @mbg.generated Mon Apr 29 20:20:44 CST 2019
     */
    public void setShortAnswerName(String shortAnswerName) {
        this.shortAnswerName = shortAnswerName == null ? null : shortAnswerName.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_question_short_answer.answer
     *
     * @return the value of t_question_short_answer.answer
     *
     * @mbg.generated Mon Apr 29 20:20:44 CST 2019
     */
    public String getAnswer() {
        return answer;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_question_short_answer.answer
     *
     * @param answer the value for t_question_short_answer.answer
     *
     * @mbg.generated Mon Apr 29 20:20:44 CST 2019
     */
    public void setAnswer(String answer) {
        this.answer = answer == null ? null : answer.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_question_short_answer.course_id
     *
     * @return the value of t_question_short_answer.course_id
     *
     * @mbg.generated Mon Apr 29 20:20:44 CST 2019
     */
    public Long getCourseId() {
        return courseId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_question_short_answer.course_id
     *
     * @param courseId the value for t_question_short_answer.course_id
     *
     * @mbg.generated Mon Apr 29 20:20:44 CST 2019
     */
    public void setCourseId(Long courseId) {
        this.courseId = courseId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_question_short_answer.is_del
     *
     * @return the value of t_question_short_answer.is_del
     *
     * @mbg.generated Mon Apr 29 20:20:44 CST 2019
     */
    public Boolean getIsDel() {
        return isDel;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_question_short_answer.is_del
     *
     * @param isDel the value for t_question_short_answer.is_del
     *
     * @mbg.generated Mon Apr 29 20:20:44 CST 2019
     */
    public void setIsDel(Boolean isDel) {
        this.isDel = isDel;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_question_short_answer.create_time
     *
     * @return the value of t_question_short_answer.create_time
     *
     * @mbg.generated Mon Apr 29 20:20:44 CST 2019
     */
    public Date getCreateTime() {
        return createTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_question_short_answer.create_time
     *
     * @param createTime the value for t_question_short_answer.create_time
     *
     * @mbg.generated Mon Apr 29 20:20:44 CST 2019
     */
    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_question_short_answer.update_time
     *
     * @return the value of t_question_short_answer.update_time
     *
     * @mbg.generated Mon Apr 29 20:20:44 CST 2019
     */
    public Date getUpdateTime() {
        return updateTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_question_short_answer.update_time
     *
     * @param updateTime the value for t_question_short_answer.update_time
     *
     * @mbg.generated Mon Apr 29 20:20:44 CST 2019
     */
    public void setUpdateTime(Date updateTime) {
        this.updateTime = updateTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_question_short_answer.creator
     *
     * @return the value of t_question_short_answer.creator
     *
     * @mbg.generated Mon Apr 29 20:20:44 CST 2019
     */
    public Long getCreator() {
        return creator;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_question_short_answer.creator
     *
     * @param creator the value for t_question_short_answer.creator
     *
     * @mbg.generated Mon Apr 29 20:20:44 CST 2019
     */
    public void setCreator(Long creator) {
        this.creator = creator;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_question_short_answer.updater
     *
     * @return the value of t_question_short_answer.updater
     *
     * @mbg.generated Mon Apr 29 20:20:44 CST 2019
     */
    public Long getUpdater() {
        return updater;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_question_short_answer.updater
     *
     * @param updater the value for t_question_short_answer.updater
     *
     * @mbg.generated Mon Apr 29 20:20:44 CST 2019
     */
    public void setUpdater(Long updater) {
        this.updater = updater;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_question_short_answer.version
     *
     * @return the value of t_question_short_answer.version
     *
     * @mbg.generated Mon Apr 29 20:20:44 CST 2019
     */
    public Integer getVersion() {
        return version;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_question_short_answer.version
     *
     * @param version the value for t_question_short_answer.version
     *
     * @mbg.generated Mon Apr 29 20:20:44 CST 2019
     */
    public void setVersion(Integer version) {
        this.version = version;
    }
}