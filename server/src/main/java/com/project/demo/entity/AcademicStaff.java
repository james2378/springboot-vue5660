package com.project.demo.entity;

import java.sql.Date;
import java.sql.Timestamp;
import com.project.demo.entity.base.BaseEntity;
import java.io.Serializable;
import lombok.*;
import javax.persistence.*;


/**
 *教务人员：(AcademicStaff)表实体类
 *
 */
@Setter
@Getter
@Entity(name = "AcademicStaff")
public class AcademicStaff implements Serializable {

    //AcademicStaff编号
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "academic_staff_id")
    private Integer academic_staff_id;
   // 教务员工号
   @Basic
    private String academic_staff_no;
   // 教务员姓名
   @Basic
    private String name_of_academic_administrator;
    // 用户编号
    @Id
    @Column(name = "user_id")
    private Integer userId;

    // 更新时间
    @Basic
    private Timestamp update_time;

    // 创建时间
    @Basic
    private Timestamp create_time;

}
