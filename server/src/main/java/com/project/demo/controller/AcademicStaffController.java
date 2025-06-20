package com.project.demo.controller;

import com.project.demo.entity.AcademicStaff;
import com.project.demo.service.AcademicStaffService;
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
 *教务人员：(AcademicStaff)表控制层
 *
 */
@RestController
@RequestMapping("/academic_staff")
public class AcademicStaffController extends BaseController<AcademicStaff,AcademicStaffService> {

    /**
     *教务人员对象
     */
    @Autowired
    public AcademicStaffController(AcademicStaffService service) {
        setService(service);
    }

    @PostMapping("/add")
    @Transactional
    public Map<String, Object> add(HttpServletRequest request) throws IOException {
        Map<String,Object> paramMap = service.readBody(request.getReader());
        Map<String, String> mapacademic_staff_no = new HashMap<>();
        mapacademic_staff_no.put("academic_staff_no",String.valueOf(paramMap.get("academic_staff_no")));
        List listacademic_staff_no = service.select(mapacademic_staff_no, new HashMap<>()).getResultList();
        if (listacademic_staff_no.size()>0){
            return error(30000, "字段教务员工号内容不能重复");
        }
        this.addMap(paramMap);
        return success(1);
    }

}
