package cn.hasd.comp.controller;

import cn.hasd.comp.entity.Student;
import cn.hasd.comp.mapper.StudentMapper;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
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

    @GetMapping("/all")
    public List<Student> SelectAll() {
        return studentMapper.selectAll();
    }

    @GetMapping("/compA/{instructor}")
    public List<Student> CompA(@PathVariable("instructor") String instructor) {
        return studentMapper.compA(instructor);
    }

    @GetMapping("/CompB/{instructor}")
    public List<Integer> CompB(@PathVariable("instructor") String instructor) {
        List<Integer> list1 = studentMapper.selectFourstudent(instructor);
        List<Integer> list2 = studentMapper.selectNotYoutStudent(instructor);
        for (Integer integer : list2) {
            list1.add(integer);
        }
        return list1;
    }
}
