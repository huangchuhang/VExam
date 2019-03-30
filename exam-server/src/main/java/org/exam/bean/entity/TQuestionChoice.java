package org.exam.bean.entity;

import java.util.Date;

/**
 * Database Table Remarks:
 *   选择题
 *
 * This class was generated by MyBatis Generator.
 * This class corresponds to the database table t_question_choice
 *
 * @mbg.generated do_not_delete_during_merge Sat Mar 30 15:26:07 CST 2019
 */
public class TQuestionChoice {
    /**
     * Database Column Remarks:
     *   主键
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_question_choice.id
     *
     * @mbg.generated Sat Mar 30 15:26:07 CST 2019
     */
    private Long id;

    /**
     * Database Column Remarks:
     *   编号
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_question_choice.choice_no
     *
     * @mbg.generated Sat Mar 30 15:26:07 CST 2019
     */
    private Long choiceNo;

    /**
     * Database Column Remarks:
     *   名称
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_question_choice.choice_name
     *
     * @mbg.generated Sat Mar 30 15:26:07 CST 2019
     */
    private String choiceName;

    /**
     * Database Column Remarks:
     *   是否是单选，默认单选
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_question_choice.choice_type
     *
     * @mbg.generated Sat Mar 30 15:26:07 CST 2019
     */
    private Boolean choiceType;

    /**
     * Database Column Remarks:
     *   A选项
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_question_choice.option_a
     *
     * @mbg.generated Sat Mar 30 15:26:07 CST 2019
     */
    private String optionA;

    /**
     * Database Column Remarks:
     *   B选项
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_question_choice.option_b
     *
     * @mbg.generated Sat Mar 30 15:26:07 CST 2019
     */
    private String optionB;

    /**
     * Database Column Remarks:
     *   C选项
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_question_choice.option_c
     *
     * @mbg.generated Sat Mar 30 15:26:07 CST 2019
     */
    private String optionC;

    /**
     * Database Column Remarks:
     *   D选项
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_question_choice.option_d
     *
     * @mbg.generated Sat Mar 30 15:26:07 CST 2019
     */
    private String optionD;

    /**
     * Database Column Remarks:
     *   单选答案
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_question_choice.single_answer
     *
     * @mbg.generated Sat Mar 30 15:26:07 CST 2019
     */
    private String singleAnswer;

    /**
     * Database Column Remarks:
     *   多选答案
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_question_choice.multi_answer
     *
     * @mbg.generated Sat Mar 30 15:26:07 CST 2019
     */
    private String multiAnswer;

    /**
     * Database Column Remarks:
     *   删除标识：0-未删除；1-已删除
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_question_choice.is_del
     *
     * @mbg.generated Sat Mar 30 15:26:07 CST 2019
     */
    private Boolean isDel;

    /**
     * Database Column Remarks:
     *   创建时间
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_question_choice.create_time
     *
     * @mbg.generated Sat Mar 30 15:26:07 CST 2019
     */
    private Date createTime;

    /**
     * Database Column Remarks:
     *   更新时间
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_question_choice.update_time
     *
     * @mbg.generated Sat Mar 30 15:26:07 CST 2019
     */
    private Date updateTime;

    /**
     * Database Column Remarks:
     *   创建者
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_question_choice.creator
     *
     * @mbg.generated Sat Mar 30 15:26:07 CST 2019
     */
    private Integer creator;

    /**
     * Database Column Remarks:
     *   更新者
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_question_choice.updater
     *
     * @mbg.generated Sat Mar 30 15:26:07 CST 2019
     */
    private Integer updater;

    /**
     * Database Column Remarks:
     *   版本号，乐观锁专用
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_question_choice.version
     *
     * @mbg.generated Sat Mar 30 15:26:07 CST 2019
     */
    private Integer version;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_question_choice.id
     *
     * @return the value of t_question_choice.id
     *
     * @mbg.generated Sat Mar 30 15:26:07 CST 2019
     */
    public Long getId() {
        return id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_question_choice.id
     *
     * @param id the value for t_question_choice.id
     *
     * @mbg.generated Sat Mar 30 15:26:07 CST 2019
     */
    public void setId(Long id) {
        this.id = id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_question_choice.choice_no
     *
     * @return the value of t_question_choice.choice_no
     *
     * @mbg.generated Sat Mar 30 15:26:07 CST 2019
     */
    public Long getChoiceNo() {
        return choiceNo;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_question_choice.choice_no
     *
     * @param choiceNo the value for t_question_choice.choice_no
     *
     * @mbg.generated Sat Mar 30 15:26:07 CST 2019
     */
    public void setChoiceNo(Long choiceNo) {
        this.choiceNo = choiceNo;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_question_choice.choice_name
     *
     * @return the value of t_question_choice.choice_name
     *
     * @mbg.generated Sat Mar 30 15:26:07 CST 2019
     */
    public String getChoiceName() {
        return choiceName;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_question_choice.choice_name
     *
     * @param choiceName the value for t_question_choice.choice_name
     *
     * @mbg.generated Sat Mar 30 15:26:07 CST 2019
     */
    public void setChoiceName(String choiceName) {
        this.choiceName = choiceName == null ? null : choiceName.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_question_choice.choice_type
     *
     * @return the value of t_question_choice.choice_type
     *
     * @mbg.generated Sat Mar 30 15:26:07 CST 2019
     */
    public Boolean getChoiceType() {
        return choiceType;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_question_choice.choice_type
     *
     * @param choiceType the value for t_question_choice.choice_type
     *
     * @mbg.generated Sat Mar 30 15:26:07 CST 2019
     */
    public void setChoiceType(Boolean choiceType) {
        this.choiceType = choiceType;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_question_choice.option_a
     *
     * @return the value of t_question_choice.option_a
     *
     * @mbg.generated Sat Mar 30 15:26:07 CST 2019
     */
    public String getOptionA() {
        return optionA;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_question_choice.option_a
     *
     * @param optionA the value for t_question_choice.option_a
     *
     * @mbg.generated Sat Mar 30 15:26:07 CST 2019
     */
    public void setOptionA(String optionA) {
        this.optionA = optionA == null ? null : optionA.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_question_choice.option_b
     *
     * @return the value of t_question_choice.option_b
     *
     * @mbg.generated Sat Mar 30 15:26:07 CST 2019
     */
    public String getOptionB() {
        return optionB;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_question_choice.option_b
     *
     * @param optionB the value for t_question_choice.option_b
     *
     * @mbg.generated Sat Mar 30 15:26:07 CST 2019
     */
    public void setOptionB(String optionB) {
        this.optionB = optionB == null ? null : optionB.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_question_choice.option_c
     *
     * @return the value of t_question_choice.option_c
     *
     * @mbg.generated Sat Mar 30 15:26:07 CST 2019
     */
    public String getOptionC() {
        return optionC;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_question_choice.option_c
     *
     * @param optionC the value for t_question_choice.option_c
     *
     * @mbg.generated Sat Mar 30 15:26:07 CST 2019
     */
    public void setOptionC(String optionC) {
        this.optionC = optionC == null ? null : optionC.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_question_choice.option_d
     *
     * @return the value of t_question_choice.option_d
     *
     * @mbg.generated Sat Mar 30 15:26:07 CST 2019
     */
    public String getOptionD() {
        return optionD;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_question_choice.option_d
     *
     * @param optionD the value for t_question_choice.option_d
     *
     * @mbg.generated Sat Mar 30 15:26:07 CST 2019
     */
    public void setOptionD(String optionD) {
        this.optionD = optionD == null ? null : optionD.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_question_choice.single_answer
     *
     * @return the value of t_question_choice.single_answer
     *
     * @mbg.generated Sat Mar 30 15:26:07 CST 2019
     */
    public String getSingleAnswer() {
        return singleAnswer;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_question_choice.single_answer
     *
     * @param singleAnswer the value for t_question_choice.single_answer
     *
     * @mbg.generated Sat Mar 30 15:26:07 CST 2019
     */
    public void setSingleAnswer(String singleAnswer) {
        this.singleAnswer = singleAnswer == null ? null : singleAnswer.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_question_choice.multi_answer
     *
     * @return the value of t_question_choice.multi_answer
     *
     * @mbg.generated Sat Mar 30 15:26:07 CST 2019
     */
    public String getMultiAnswer() {
        return multiAnswer;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_question_choice.multi_answer
     *
     * @param multiAnswer the value for t_question_choice.multi_answer
     *
     * @mbg.generated Sat Mar 30 15:26:07 CST 2019
     */
    public void setMultiAnswer(String multiAnswer) {
        this.multiAnswer = multiAnswer == null ? null : multiAnswer.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_question_choice.is_del
     *
     * @return the value of t_question_choice.is_del
     *
     * @mbg.generated Sat Mar 30 15:26:07 CST 2019
     */
    public Boolean getIsDel() {
        return isDel;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_question_choice.is_del
     *
     * @param isDel the value for t_question_choice.is_del
     *
     * @mbg.generated Sat Mar 30 15:26:07 CST 2019
     */
    public void setIsDel(Boolean isDel) {
        this.isDel = isDel;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_question_choice.create_time
     *
     * @return the value of t_question_choice.create_time
     *
     * @mbg.generated Sat Mar 30 15:26:07 CST 2019
     */
    public Date getCreateTime() {
        return createTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_question_choice.create_time
     *
     * @param createTime the value for t_question_choice.create_time
     *
     * @mbg.generated Sat Mar 30 15:26:07 CST 2019
     */
    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_question_choice.update_time
     *
     * @return the value of t_question_choice.update_time
     *
     * @mbg.generated Sat Mar 30 15:26:07 CST 2019
     */
    public Date getUpdateTime() {
        return updateTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_question_choice.update_time
     *
     * @param updateTime the value for t_question_choice.update_time
     *
     * @mbg.generated Sat Mar 30 15:26:07 CST 2019
     */
    public void setUpdateTime(Date updateTime) {
        this.updateTime = updateTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_question_choice.creator
     *
     * @return the value of t_question_choice.creator
     *
     * @mbg.generated Sat Mar 30 15:26:07 CST 2019
     */
    public Integer getCreator() {
        return creator;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_question_choice.creator
     *
     * @param creator the value for t_question_choice.creator
     *
     * @mbg.generated Sat Mar 30 15:26:07 CST 2019
     */
    public void setCreator(Integer creator) {
        this.creator = creator;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_question_choice.updater
     *
     * @return the value of t_question_choice.updater
     *
     * @mbg.generated Sat Mar 30 15:26:07 CST 2019
     */
    public Integer getUpdater() {
        return updater;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_question_choice.updater
     *
     * @param updater the value for t_question_choice.updater
     *
     * @mbg.generated Sat Mar 30 15:26:07 CST 2019
     */
    public void setUpdater(Integer updater) {
        this.updater = updater;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_question_choice.version
     *
     * @return the value of t_question_choice.version
     *
     * @mbg.generated Sat Mar 30 15:26:07 CST 2019
     */
    public Integer getVersion() {
        return version;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_question_choice.version
     *
     * @param version the value for t_question_choice.version
     *
     * @mbg.generated Sat Mar 30 15:26:07 CST 2019
     */
    public void setVersion(Integer version) {
        this.version = version;
    }
}