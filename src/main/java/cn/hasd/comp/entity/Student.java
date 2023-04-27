package cn.hasd.comp.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Getter;
import lombok.Setter;

import java.io.Serializable;

/**
 * <p>
 *
 * </p>
 *
 * @author hasd
 * @since 2022-10-19
 */
@Getter
@Setter
@ApiModel(value = "Student对象", description = "")
public class Student implements Serializable {

    private static final long serialVersionUID = 1L;

    @TableId(value = "id", type = IdType.AUTO)
    private Integer id;

    @ApiModelProperty("姓名")
    private String name;

    @ApiModelProperty("学号")
    private String no;

    @ApiModelProperty("班级")
    private String grade;

    @ApiModelProperty("政治面貌")
    private String face;

    @ApiModelProperty("民族")
    private String people;

    @ApiModelProperty("班级职位")
    private String job;

    @ApiModelProperty("家庭住址")
    private String address;

    @ApiModelProperty("宿舍楼")
    private String flat;

    @ApiModelProperty("经济状况")
    private String ecomony;

    @ApiModelProperty("奖惩")
    private String reward;

    @ApiModelProperty("学习状况")
    private String study;

    @ApiModelProperty("兴趣爱好")
    private String hobby;

    @ApiModelProperty("职业倾向")
    private String target;

    @ApiModelProperty("导员姓名")
    private String instructor;
    @ApiModelProperty("性别")
    private String sex;

    private String major;
    private String friends;
    private String xi;
    private String future;


}
