package com.project.demo.controller;

import com.project.demo.entity.StudentRating;
import com.project.demo.service.StudentRatingService;
import com.project.demo.controller.base.BaseController;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.*;

import javax.persistence.Query;
import javax.servlet.http.HttpServletRequest;
import java.io.IOException;
import java.util.HashMap;
import java.util.List;
import java.util.Map;


/**
 *学生评分：(StudentRating)表控制层
 *
 */
@RestController
@RequestMapping("/student_rating")
public class StudentRatingController extends BaseController<StudentRating,StudentRatingService> {

    /**
     *学生评分对象
     */
    @Autowired
    public StudentRatingController(StudentRatingService service) {
        setService(service);
    }

    @PostMapping("/add")
    @Transactional
    public Map<String, Object> add(HttpServletRequest request) throws IOException {
        Map<String,Object> paramMap = service.readBody(request.getReader());
        this.addMap(paramMap);
        return success(1);
    }

}
