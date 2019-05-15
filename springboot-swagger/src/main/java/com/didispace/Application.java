package com.didispace;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 *
 * @author 程序猿DD
 * @version 1.0.0
 * @blog http://blog.didispace.com
 *
 */
@SpringBootApplication
public class Application {
	public void test1() {
		System.out.println("test1");
	}
	public static void main(String[] args) {

		SpringApplication.run(Application.class, args);

	}

}
