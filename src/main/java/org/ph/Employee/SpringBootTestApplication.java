package org.ph.Employee;

import java.util.Properties;

import org.apache.ibatis.plugin.Interceptor;
import org.mybatis.spring.SqlSessionFactoryBean;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.transaction.annotation.EnableTransactionManagement;

import com.github.pagehelper.PageHelper;

@SpringBootApplication
@EnableTransactionManagement//开启事物管理
@MapperScan("org.ph..Employee.mapper")
public class SpringBootTestApplication {

	public static void main(String[] args) {

		SpringApplication.run(SpringBootTestApplication.class, args);
	}

	
	
	
}
