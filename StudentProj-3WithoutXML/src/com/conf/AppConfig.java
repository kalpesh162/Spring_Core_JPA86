package com.conf;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan(basePackages = "com")
public class AppConfig {
	// @ComponentScan(basePackages = "com") =<context:component-scan
	// base-package="com"></context:component-scan>
	// defn

}
