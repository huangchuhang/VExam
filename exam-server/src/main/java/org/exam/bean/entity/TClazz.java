package org.exam.bean.entity;

import java.util.Date;

/**
 * Database Table Remarks:
 *   班级表
 *
 * This class was generated by MyBatis Generator.
 * This class corresponds to the database table t_clazz
 *
 * @mbg.generated do_not_delete_during_merge Wed Apr 03 11:50:58 CST 2019
 */
public class TClazz {
    /**
     * Database Column Remarks:
     *   班级编号
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_clazz.clazz_id
     *
     * @mbg.generated Wed Apr 03 11:50:58 CST 2019
     */
    private Long clazzId;

    /**
     * Database Column Remarks:
     *   班级名称
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_clazz.class_name
     *
     * @mbg.generated Wed Apr 03 11:50:58 CST 2019
     */
    private String className;

    /**
     * Database Column Remarks:
     *   专业id
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_clazz.major_id
     *
     * @mbg.generated Wed Apr 03 11:50:58 CST 2019
     */
    private Long majorId;

    /**
     * Database Column Remarks:
     *   创建者
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_clazz.creator
     *
     * @mbg.generated Wed Apr 03 11:50:58 CST 2019
     */
    private Long creator;

    /**
     * Database Column Remarks:
     *   更新者
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_clazz.updater
     *
     * @mbg.generated Wed Apr 03 11:50:58 CST 2019
     */
    private Long updater;

    /**
     * Database Column Remarks:
     *   版本号，乐观锁专用
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_clazz.version
     *
     * @mbg.generated Wed Apr 03 11:50:58 CST 2019
     */
    private Integer version;

    /**
     * Database Column Remarks:
     *   是否删除
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_clazz.is_del
     *
     * @mbg.generated Wed Apr 03 11:50:58 CST 2019
     */
    private Boolean isDel;

    /**
     * Database Column Remarks:
     *   创建时间
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_clazz.create_time
     *
     * @mbg.generated Wed Apr 03 11:50:58 CST 2019
     */
    private Date createTime;

    /**
     * Database Column Remarks:
     *   更新时间
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_clazz.update_time
     *
     * @mbg.generated Wed Apr 03 11:50:58 CST 2019
     */
    private Date updateTime;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_clazz.clazz_id
     *
     * @return the value of t_clazz.clazz_id
     *
     * @mbg.generated Wed Apr 03 11:50:58 CST 2019
     */
    public Long getClazzId() {
        return clazzId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_clazz.clazz_id
     *
     * @param clazzId the value for t_clazz.clazz_id
     *
     * @mbg.generated Wed Apr 03 11:50:58 CST 2019
     */
    public void setClazzId(Long clazzId) {
        this.clazzId = clazzId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_clazz.class_name
     *
     * @return the value of t_clazz.class_name
     *
     * @mbg.generated Wed Apr 03 11:50:58 CST 2019
     */
    public String getClassName() {
        return className;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_clazz.class_name
     *
     * @param className the value for t_clazz.class_name
     *
     * @mbg.generated Wed Apr 03 11:50:58 CST 2019
     */
    public void setClassName(String className) {
        this.className = className == null ? null : className.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_clazz.major_id
     *
     * @return the value of t_clazz.major_id
     *
     * @mbg.generated Wed Apr 03 11:50:58 CST 2019
     */
    public Long getMajorId() {
        return majorId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_clazz.major_id
     *
     * @param majorId the value for t_clazz.major_id
     *
     * @mbg.generated Wed Apr 03 11:50:58 CST 2019
     */
    public void setMajorId(Long majorId) {
        this.majorId = majorId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_clazz.creator
     *
     * @return the value of t_clazz.creator
     *
     * @mbg.generated Wed Apr 03 11:50:58 CST 2019
     */
    public Long getCreator() {
        return creator;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_clazz.creator
     *
     * @param creator the value for t_clazz.creator
     *
     * @mbg.generated Wed Apr 03 11:50:58 CST 2019
     */
    public void setCreator(Long creator) {
        this.creator = creator;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_clazz.updater
     *
     * @return the value of t_clazz.updater
     *
     * @mbg.generated Wed Apr 03 11:50:58 CST 2019
     */
    public Long getUpdater() {
        return updater;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_clazz.updater
     *
     * @param updater the value for t_clazz.updater
     *
     * @mbg.generated Wed Apr 03 11:50:58 CST 2019
     */
    public void setUpdater(Long updater) {
        this.updater = updater;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_clazz.version
     *
     * @return the value of t_clazz.version
     *
     * @mbg.generated Wed Apr 03 11:50:58 CST 2019
     */
    public Integer getVersion() {
        return version;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_clazz.version
     *
     * @param version the value for t_clazz.version
     *
     * @mbg.generated Wed Apr 03 11:50:58 CST 2019
     */
    public void setVersion(Integer version) {
        this.version = version;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_clazz.is_del
     *
     * @return the value of t_clazz.is_del
     *
     * @mbg.generated Wed Apr 03 11:50:58 CST 2019
     */
    public Boolean getIsDel() {
        return isDel;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_clazz.is_del
     *
     * @param isDel the value for t_clazz.is_del
     *
     * @mbg.generated Wed Apr 03 11:50:58 CST 2019
     */
    public void setIsDel(Boolean isDel) {
        this.isDel = isDel;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_clazz.create_time
     *
     * @return the value of t_clazz.create_time
     *
     * @mbg.generated Wed Apr 03 11:50:58 CST 2019
     */
    public Date getCreateTime() {
        return createTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_clazz.create_time
     *
     * @param createTime the value for t_clazz.create_time
     *
     * @mbg.generated Wed Apr 03 11:50:58 CST 2019
     */
    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_clazz.update_time
     *
     * @return the value of t_clazz.update_time
     *
     * @mbg.generated Wed Apr 03 11:50:58 CST 2019
     */
    public Date getUpdateTime() {
        return updateTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_clazz.update_time
     *
     * @param updateTime the value for t_clazz.update_time
     *
     * @mbg.generated Wed Apr 03 11:50:58 CST 2019
     */
    public void setUpdateTime(Date updateTime) {
        this.updateTime = updateTime;
    }
}