package com.library.app;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.test.context.TestConfiguration;

@TestConfiguration(proxyBeanMethods = false)
public class TestLibraryManagementSystemApplication {

	public static void main(String[] args) {
		SpringApplication.from(LibraryManagementSystemApplication::main).with(TestLibraryManagementSystemApplication.class).run(args);
	}

}
