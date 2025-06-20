package com.project.demo.entity;

import java.sql.Date;
import java.sql.Timestamp;
import com.project.demo.entity.base.BaseEntity;
import java.io.Serializable;
import lombok.*;
import javax.persistence.*;


/**
 *学生评分：(StudentRating)表实体类
 *
 */
@Setter
@Getter
@Entity(name = "StudentRating")
public class StudentRating implements Serializable {

    //StudentRating编号
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "student_rating_id")
    private Integer student_rating_id;
   // 课程编号
   @Basic
    private String course_number;
   // 课程名称
   @Basic
    private String course_name;
   // 任课老师
   @Basic
    private Integer teacher;
   // 班级名称
   @Basic
    private String class_name;
   // 测评名称
   @Basic
    private String evaluation_name;
   // 教学内容
   @Basic
    private Integer content_of_courses;
   // 教学水平
   @Basic
    private Integer teaching_level_;
   // 教学方法
   @Basic
    private Integer teaching_method;
   // 教学效果
   @Basic
    private Integer teaching_effectiveness;
   // 总分
   @Basic
    private String total_score;
   // 学号
   @Basic
    private Integer student_number;
   // 学生姓名
   @Basic
    private String student_name;
   // 教学建议
   @Basic
    private String teaching_suggestions;

    // 更新时间
    @Basic
    private Timestamp update_time;

    // 创建时间
    @Basic
    private Timestamp create_time;

}
