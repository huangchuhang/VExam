package org.exam.bean.vo;

import lombok.Data;
/**
 * Database Table Remarks:
 *   课程表
 *
 * This class was generated by MyBatis Generator.
 * This class corresponds to the database table t_course
 *
 * @mbg.generated do_not_delete_during_merge Wed Apr 03 11:58:19 CST 2019
 */
@Data
public class CourseVo {
    /**
     * Database Column Remarks:
     *   课程编号
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_course.course_id
     *
     * @mbg.generated Wed Apr 03 11:58:19 CST 2019
     */
    private Long courseId;

    /**
     * Database Column Remarks:
     *   课程名称
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_course.course_name
     *
     * @mbg.generated Wed Apr 03 11:58:19 CST 2019
     */
    private String courseName;

    /**
     * Database Column Remarks:
     *   课程所属专业
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_course.major_id
     *
     * @mbg.generated Wed Apr 03 11:58:19 CST 2019
     */
    private Long majorId;
}