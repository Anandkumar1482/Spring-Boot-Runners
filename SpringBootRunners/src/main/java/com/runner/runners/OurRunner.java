package com.runner.runners;

import java.util.Arrays;

import org.springframework.boot.CommandLineRunner;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

@Component
@Order(201)
public class OurRunner implements CommandLineRunner {

	@Override
	public void run(String... args) throws Exception {
		/*
		 * System.out.println("all arguments " + args[0]);
		 * System.out.println("data is :" + Arrays.asList(args));
		 */

	}

}
