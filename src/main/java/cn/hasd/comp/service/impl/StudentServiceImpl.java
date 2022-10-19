package cn.hasd.comp.service.impl;

import cn.hasd.comp.entity.Student;
import cn.hasd.comp.mapper.StudentMapper;
import cn.hasd.comp.service.IStudentService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 *  服务实现类
 * </p>
 *
 * @author hasd
 * @since 2022-10-19
 */
@Service
public class StudentServiceImpl extends ServiceImpl<StudentMapper, Student> implements IStudentService {

}
