package cn.hasd.comp.controller;

import cn.hasd.comp.entity.Student;
import cn.hasd.comp.mapper.StudentMapper;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

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
@RestController
@RequestMapping("/student")
public class StudentController {
    @Resource
    StudentMapper studentMapper;

    @GetMapping("/comp1")
    public List<Student> CompA() {
        return studentMapper.compA();
    }
}
