package org.exam;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cache.annotation.EnableCaching;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

/**
 * @author heshiyuan
 */
@SpringBootApplication
@MapperScan("org.exam.mapper")
//@EnableCaching
@EnableSwagger2
public class ExamServerApplication {

	public static void main(String[] args) {
		SpringApplication.run(ExamServerApplication.class, args);
	}
}
