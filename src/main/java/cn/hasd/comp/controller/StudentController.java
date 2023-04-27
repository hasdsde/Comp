package cn.hasd.comp.controller;

import cn.hasd.comp.entity.Student;
import cn.hasd.comp.mapper.StudentMapper;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

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

    //后台，获取全部信息
    @GetMapping("/all")
    public List<Student> SelectAll() {
        return studentMapper.selectAll();
    }

    //比赛A，随机获取四个信息
    @GetMapping("/compA/{instructor}")
    public List<Student> CompA(@PathVariable("instructor") String instructor) {
        return studentMapper.compA(instructor);
    }

    //比赛B，随机获取八个信息
    @GetMapping("/CompB/{instructor}")
    public List<Student> CompB(@PathVariable("instructor") String instructor) {
        List<Student> list1 = studentMapper.selectFourstudent(instructor);
        List<Student> list2 = studentMapper.selectNotYoutStudent(instructor);
        for (Student integer : list2) {
            list1.add(integer);
        }
        return list1;
    }

    //获取数组，返回信息
    @PostMapping("/CompBList")
    public List<Student> CompBlist(@RequestBody Map<String, Object> map) {
        ArrayList<Integer> list = ArrayList.class.cast(map.get("ids"));
        ArrayList<Student> students = new ArrayList<>();
        for (Integer integer : list) {
            students.add(studentMapper.selectYi(integer.toString()));
        }
        return students;
    }
}
