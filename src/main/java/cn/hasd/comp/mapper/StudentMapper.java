package cn.hasd.comp.mapper;

import cn.hasd.comp.entity.Student;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

/**
 * <p>
 * Mapper 接口
 * </p>
 *
 * @author hasd
 * @since 2022-10-19
 */
@Mapper
public interface StudentMapper extends BaseMapper<Student> {

    List<Student> compA();
}
