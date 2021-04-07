package com.runner.runners;

import java.util.Arrays;
import java.util.List;
import java.util.Set;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

@Component
@Order(200)
public class AppRunner implements ApplicationRunner {

	@Value("${server.port}")
	String serverPort;

	@Value("${spring.application.name}")
	String appName;

	@Override
	public void run(ApplicationArguments args) throws Exception {

		System.out.println("application port " + serverPort);

		System.out.println("application Name " + appName);

		System.out.println("welcome to Runner");
		// 1. print all inputs (CL-Args)
		String[] input = args.getSourceArgs();
		// String Arry to List<String>
		System.out.println(Arrays.asList(input));
		System.out.println("-------------------------------------");
		List<String> l = args.getNonOptionArgs();
		System.out.println(l);

		Set<String> set = args.getOptionNames();
		System.out.println(set);

		System.out.println(args.getOptionValues("code"));

	}
}
