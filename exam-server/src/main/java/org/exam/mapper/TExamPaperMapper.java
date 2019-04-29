package org.exam.mapper;

import java.util.List;
import org.apache.ibatis.annotations.Param;
import org.exam.bean.entity.TExamPaper;
import org.exam.bean.entity.TExamPaperExample;

public interface TExamPaperMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_exam_paper
     *
     * @mbg.generated Mon Apr 29 20:14:43 CST 2019
     */
    long countByExample(TExamPaperExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_exam_paper
     *
     * @mbg.generated Mon Apr 29 20:14:43 CST 2019
     */
    int deleteByExample(TExamPaperExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_exam_paper
     *
     * @mbg.generated Mon Apr 29 20:14:43 CST 2019
     */
    int deleteByPrimaryKey(Long paperId);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_exam_paper
     *
     * @mbg.generated Mon Apr 29 20:14:43 CST 2019
     */
    int insert(TExamPaper record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_exam_paper
     *
     * @mbg.generated Mon Apr 29 20:14:43 CST 2019
     */
    int insertSelective(TExamPaper record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_exam_paper
     *
     * @mbg.generated Mon Apr 29 20:14:43 CST 2019
     */
    List<TExamPaper> selectByExample(TExamPaperExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_exam_paper
     *
     * @mbg.generated Mon Apr 29 20:14:43 CST 2019
     */
    TExamPaper selectByPrimaryKey(Long paperId);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_exam_paper
     *
     * @mbg.generated Mon Apr 29 20:14:43 CST 2019
     */
    int updateByExampleSelective(@Param("record") TExamPaper record, @Param("example") TExamPaperExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_exam_paper
     *
     * @mbg.generated Mon Apr 29 20:14:43 CST 2019
     */
    int updateByExample(@Param("record") TExamPaper record, @Param("example") TExamPaperExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_exam_paper
     *
     * @mbg.generated Mon Apr 29 20:14:43 CST 2019
     */
    int updateByPrimaryKeySelective(TExamPaper record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_exam_paper
     *
     * @mbg.generated Mon Apr 29 20:14:43 CST 2019
     */
    int updateByPrimaryKey(TExamPaper record);
}