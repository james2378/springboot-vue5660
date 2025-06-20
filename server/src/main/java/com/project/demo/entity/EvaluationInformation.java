package com.project.demo.entity;

import java.sql.Date;
import java.sql.Timestamp;
import com.project.demo.entity.base.BaseEntity;
import java.io.Serializable;
import lombok.*;
import javax.persistence.*;


/**
 *测评信息：(EvaluationInformation)表实体类
 *
 */
@Setter
@Getter
@Entity(name = "EvaluationInformation")
public class EvaluationInformation implements Serializable {

    //EvaluationInformation编号
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "evaluation_information_id")
    private Integer evaluation_information_id;
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
   // 测评开始时间
   @Basic
    private Timestamp evaluation_start_time;
   // 测评结束时间
   @Basic
    private Timestamp evaluation_end_time;

    // 更新时间
    @Basic
    private Timestamp update_time;

    // 创建时间
    @Basic
    private Timestamp create_time;

}
