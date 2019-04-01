package org.exam.bean.entity;

import java.util.Date;

/**
 *
 * This class was generated by MyBatis Generator.
 * This class corresponds to the database table t_dic
 *
 * @mbg.generated do_not_delete_during_merge Mon Apr 01 09:36:14 CST 2019
 */
public class TDic {
    /**
     * Database Column Remarks:
     *   分布式id
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_dic.dic_id
     *
     * @mbg.generated Mon Apr 01 09:36:14 CST 2019
     */
    private Long dicId;

    /**
     * Database Column Remarks:
     *   字典-键
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_dic.dic_key
     *
     * @mbg.generated Mon Apr 01 09:36:14 CST 2019
     */
    private String dicKey;

    /**
     * Database Column Remarks:
     *   字典-值
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_dic.dic_value
     *
     * @mbg.generated Mon Apr 01 09:36:14 CST 2019
     */
    private String dicValue;

    /**
     * Database Column Remarks:
     *   字典类型
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_dic.dic_type_id
     *
     * @mbg.generated Mon Apr 01 09:36:14 CST 2019
     */
    private String dicTypeId;

    /**
     * Database Column Remarks:
     *   删除标识：0-未删除；1-已删除
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_dic.is_del
     *
     * @mbg.generated Mon Apr 01 09:36:14 CST 2019
     */
    private Boolean isDel;

    /**
     * Database Column Remarks:
     *   创建时间
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_dic.create_time
     *
     * @mbg.generated Mon Apr 01 09:36:14 CST 2019
     */
    private Date createTime;

    /**
     * Database Column Remarks:
     *   更新时间
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_dic.update_time
     *
     * @mbg.generated Mon Apr 01 09:36:14 CST 2019
     */
    private Date updateTime;

    /**
     * Database Column Remarks:
     *   创建者
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_dic.creator
     *
     * @mbg.generated Mon Apr 01 09:36:14 CST 2019
     */
    private Long creator;

    /**
     * Database Column Remarks:
     *   更新者
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_dic.updater
     *
     * @mbg.generated Mon Apr 01 09:36:14 CST 2019
     */
    private Long updater;

    /**
     * Database Column Remarks:
     *   版本号，乐观锁专用
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_dic.version
     *
     * @mbg.generated Mon Apr 01 09:36:14 CST 2019
     */
    private Integer version;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_dic.dic_id
     *
     * @return the value of t_dic.dic_id
     *
     * @mbg.generated Mon Apr 01 09:36:14 CST 2019
     */
    public Long getDicId() {
        return dicId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_dic.dic_id
     *
     * @param dicId the value for t_dic.dic_id
     *
     * @mbg.generated Mon Apr 01 09:36:14 CST 2019
     */
    public void setDicId(Long dicId) {
        this.dicId = dicId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_dic.dic_key
     *
     * @return the value of t_dic.dic_key
     *
     * @mbg.generated Mon Apr 01 09:36:14 CST 2019
     */
    public String getDicKey() {
        return dicKey;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_dic.dic_key
     *
     * @param dicKey the value for t_dic.dic_key
     *
     * @mbg.generated Mon Apr 01 09:36:14 CST 2019
     */
    public void setDicKey(String dicKey) {
        this.dicKey = dicKey == null ? null : dicKey.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_dic.dic_value
     *
     * @return the value of t_dic.dic_value
     *
     * @mbg.generated Mon Apr 01 09:36:14 CST 2019
     */
    public String getDicValue() {
        return dicValue;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_dic.dic_value
     *
     * @param dicValue the value for t_dic.dic_value
     *
     * @mbg.generated Mon Apr 01 09:36:14 CST 2019
     */
    public void setDicValue(String dicValue) {
        this.dicValue = dicValue == null ? null : dicValue.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_dic.dic_type_id
     *
     * @return the value of t_dic.dic_type_id
     *
     * @mbg.generated Mon Apr 01 09:36:14 CST 2019
     */
    public String getDicTypeId() {
        return dicTypeId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_dic.dic_type_id
     *
     * @param dicTypeId the value for t_dic.dic_type_id
     *
     * @mbg.generated Mon Apr 01 09:36:14 CST 2019
     */
    public void setDicTypeId(String dicTypeId) {
        this.dicTypeId = dicTypeId == null ? null : dicTypeId.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_dic.is_del
     *
     * @return the value of t_dic.is_del
     *
     * @mbg.generated Mon Apr 01 09:36:14 CST 2019
     */
    public Boolean getIsDel() {
        return isDel;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_dic.is_del
     *
     * @param isDel the value for t_dic.is_del
     *
     * @mbg.generated Mon Apr 01 09:36:14 CST 2019
     */
    public void setIsDel(Boolean isDel) {
        this.isDel = isDel;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_dic.create_time
     *
     * @return the value of t_dic.create_time
     *
     * @mbg.generated Mon Apr 01 09:36:14 CST 2019
     */
    public Date getCreateTime() {
        return createTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_dic.create_time
     *
     * @param createTime the value for t_dic.create_time
     *
     * @mbg.generated Mon Apr 01 09:36:14 CST 2019
     */
    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_dic.update_time
     *
     * @return the value of t_dic.update_time
     *
     * @mbg.generated Mon Apr 01 09:36:14 CST 2019
     */
    public Date getUpdateTime() {
        return updateTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_dic.update_time
     *
     * @param updateTime the value for t_dic.update_time
     *
     * @mbg.generated Mon Apr 01 09:36:14 CST 2019
     */
    public void setUpdateTime(Date updateTime) {
        this.updateTime = updateTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_dic.creator
     *
     * @return the value of t_dic.creator
     *
     * @mbg.generated Mon Apr 01 09:36:14 CST 2019
     */
    public Long getCreator() {
        return creator;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_dic.creator
     *
     * @param creator the value for t_dic.creator
     *
     * @mbg.generated Mon Apr 01 09:36:14 CST 2019
     */
    public void setCreator(Long creator) {
        this.creator = creator;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_dic.updater
     *
     * @return the value of t_dic.updater
     *
     * @mbg.generated Mon Apr 01 09:36:14 CST 2019
     */
    public Long getUpdater() {
        return updater;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_dic.updater
     *
     * @param updater the value for t_dic.updater
     *
     * @mbg.generated Mon Apr 01 09:36:14 CST 2019
     */
    public void setUpdater(Long updater) {
        this.updater = updater;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_dic.version
     *
     * @return the value of t_dic.version
     *
     * @mbg.generated Mon Apr 01 09:36:14 CST 2019
     */
    public Integer getVersion() {
        return version;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_dic.version
     *
     * @param version the value for t_dic.version
     *
     * @mbg.generated Mon Apr 01 09:36:14 CST 2019
     */
    public void setVersion(Integer version) {
        this.version = version;
    }
}