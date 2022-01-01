package com.ronit;


import java.sql.Date;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

import org.hibernate.internal.build.AllowSysOut;
import org.springframework.scheduling.annotation.EnableScheduling;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

@Component
@EnableScheduling
public class Task {
	
	@PostConstruct
	public void start() {
		System.out.println("==== TASK STARTED");
	}

	@PostConstruct
	@Scheduled(fixedRate = 2000)
	public void y() {
		System.out.println("==== HELLO WORLD" + new Date(System.currentTimeMillis()));
		
	}
	
	@PreDestroy
	public void x() {
		System.out.println("==== TASK STOPPED");
	}

}
