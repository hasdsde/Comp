package cn.hasd.comp.controller;

import cn.hasd.comp.entity.Student;
import cn.hasd.comp.mapper.StudentMapper;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.annotation.Resource;
import java.util.List;

/**
 * <p>
 * 前端控制器
 * </p>
 *
 * @author hasd
 * @since 2022-10-19
 */
@Controller
@RequestMapping("/student")
public class StudentController {
    @Resource
    StudentMapper studentMapper;

    @GetMapping("/comp1")
    public List<Student> CompA() {
        return studentMapper.compA();
    }
}
