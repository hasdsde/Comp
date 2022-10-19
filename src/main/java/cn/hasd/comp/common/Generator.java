package cn.hasd.comp.common;



import com.baomidou.mybatisplus.generator.FastAutoGenerator;
import com.baomidou.mybatisplus.generator.config.OutputFile;
import com.baomidou.mybatisplus.generator.engine.FreemarkerTemplateEngine;

import java.util.Collections;

public class Generator {
    public static void main(String[] args) {
        FastAutoGenerator.create(
                        "jdbc:mysql://hasdsd.cn:3307/comp",
                        "root",
                        "123456")
                .globalConfig(builder -> {
                    builder.author("hasd") // 设置作者
                            .fileOverride() // 覆盖已生成文件
                            .enableSwagger() // 开启 swagger 模式
                            // 指定输出目录
                            //直接右键复制项目根目录的绝对路径
                            .outputDir("D:/CODE/comp/src/main/java/");
                })
                .packageConfig(builder -> {
                    builder.parent("cn.hasd.comp") // 设置父包名
                            // 设置mapperXml生成路径
                            //直接右键复制项目mapper文件夹的绝对路径
                            .pathInfo(Collections.singletonMap(OutputFile.xml, "D:/CODE/comp/src/main/resources/mapper"));
                })
                .strategyConfig(builder -> {
                    builder.addInclude("student")//设置表名
                            .entityBuilder()    //entity前置，才能用lombok
                            .enableLombok();  //使用lombok
                })
                .templateEngine(new FreemarkerTemplateEngine()) // 使用Freemarker引擎模板，默认的是Velocity引擎模板
                .execute();
    }
}
