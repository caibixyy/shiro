package com.mmall.demo2;

import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;

/**
 * 此类相当于web.xml,配置应用的servlet，监听器，编码等
 * 使用嵌入式Servlet容器:
 *  　　　　优点:   简单,便携
 * 　　　　 缺点:   默认不支持jsp,优化定制比较复杂
 * 使用外置Servlet容器的步骤:
 * 　　1  必须创建war项目,需要建好web项目的目录结构
 * 　　2  嵌入式Tomcat依赖scope指定provided
 * 　　3  编写SpringBootServletInitializer类子类,并重写configure方法
 */
public class ServletInitializer extends SpringBootServletInitializer {

	@Override
	protected SpringApplicationBuilder configure(SpringApplicationBuilder application) {
		System.out.println("------------------------------------ServletInitializer---------------------------------------");
		return application.sources(Demo2Application.class);
	}
}
