package com.conf;
// spring.xml =AppConfig

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.bean.Student;

@Configuration
public class AppConfig {

	/*
	 * <!-- bean definitions here --> <bean id="student" class="com.bean.Student">
	 * <property name="id" value="111"></property> <property name="name"
	 * value="Sachin"></property> <property name="marks" value="66.66"></property>
	 * </bean>
	 */
	@Bean
	public Student student() {
		Student student = new Student();
		student.setId(11);
		student.setName("Kalpesh");
		student.setMarks(66.66);
		return student;
	}
	/*
	 * <bean id="student1" class="com.bean.Student"> <constructor-arg name="id"
	 * value="123"></constructor-arg> <constructor-arg name="name"
	 * value="Ramesh"></constructor-arg> <constructor-arg name="marks"
	 * value="77.77"></constructor-arg> </bean>
	 */

	@Bean
	public Student student1() {
		Student student = new Student(12, "Kareena", 76.77);
		return student;
	}

}

/*
 * <?xml version="1.0" encoding="UTF-8"?> <beans
 * xmlns="http://www.springframework.org/schema/beans"
 * xmlns:xsi="http://www.w3.org/2001/XMLSchema-instance" xsi:schemaLocation="
 * http://www.springframework.org/schema/beans
 * http://www.springframework.org/schema/beans/spring-beans.xsd">
 * 
 * <!-- bean definitions here --> <bean id="student" class="com.bean.Student">
 * <property name="id" value="111"></property> <property name="name"
 * value="Sachin"></property> <property name="marks" value="66.66"></property>
 * </bean>
 * 
 * <bean id="student1" class="com.bean.Student"> <constructor-arg name="id"
 * value="123"></constructor-arg> <constructor-arg name="name"
 * value="Ramesh"></constructor-arg> <constructor-arg name="marks"
 * value="77.77"></constructor-arg>
 * 
 * </bean>
 * 
 * </beans>
 */
