package com.project.demo.entity;

import java.sql.Date;
import java.sql.Timestamp;
import com.project.demo.entity.base.BaseEntity;
import java.io.Serializable;
import lombok.*;
import javax.persistence.*;


/**
 *测评结果：(EvaluationResults)表实体类
 *
 */
@Setter
@Getter
@Entity(name = "EvaluationResults")
public class EvaluationResults implements Serializable {

    //EvaluationResults编号
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "evaluation_results_id")
    private Integer evaluation_results_id;
   // 课程编号
   @Basic
    private String course_number;
   // 课程名称
   @Basic
    private String course_name;
   // 任课老师
   @Basic
    private Integer teacher;
   // 测评名称
   @Basic
    private String evaluation_name;
   // 班级名称
   @Basic
    private String class_name;
   // 教学内容
   @Basic
    private String content_of_courses;
   // 教学水平
   @Basic
    private String teaching_level_;
   // 教学方法
   @Basic
    private String teaching_method;
   // 教学效果
   @Basic
    private String teaching_effectiveness;
   // 等级
   @Basic
    private String grade;
   // 学生建议
   @Basic
    private String student_suggestions;

    // 更新时间
    @Basic
    private Timestamp update_time;

    // 创建时间
    @Basic
    private Timestamp create_time;

}
