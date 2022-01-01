package com.ronit.job;

import java.util.Calendar;
import java.util.Date;
import org.springframework.context.annotation.Scope;
import org.springframework.scheduling.annotation.Async;
import org.springframework.scheduling.annotation.Scheduled;
//import org.springframework.stereotype.Component;
//
//@Component
//public class CouponExpirationDailyIob implements Readable{
//	private Thread thread;
//	@Autowired
//	private CouponRepository couponRepository;
//	private static final long TWENTY_FOUR_HOURS = 1000 * 60 * 60 * 24;

// ************ cron  ************
//	@Scheduled(cron = "*/5 * * * * ?")
//	public void Scheduled_Usages2() {
//		System.out.println("Method executed at every 5 seconds. Current time is :" + new Date());
//	}
//	
//	
//	@Scheduled(cron = "*/5 * * * * ?")
//	public void doSomthing() {
//		System.out.println(Calendar.getInstance().getTime() + "starting job doSomthing");
//		try {
//			Thread.sleep(1000*8);
//		} catch(Exception e) {
//			e.printStackTrace();
//		}
//		System.out.println(Calendar.getInstance().getTime() + "finished job doSomthing");
//	}

// ************ fixedDelay ************
//
//	@Scheduled(fixedDelay = 30000)
//	public void Scheduled_Usages0() {
//		System.out.println("Method executed at every 5 seconds. Current time is: " + new Date());
//	}
//	

//	@Scheduled(fixedDelay = 1000, initialDelay = 1000)
//	public void scheduleFixedRateWithInitialDelayTask() {
//
//		long now = System.currentTimeMillis() / 1000;
//		System.out.println("Fixed rate task with one second initial delay - " + now);
//	}
	
	//fixedDelay = milliseconds
	// 1000=0ne second *60 = one minute *2 = 2 minutes
//	@Scheduled(fixedDelay = 1000 * 10)
////	@Async
//	public void doSomething() {
//		for(int i = 1; i <=10; i++) {
//			System.out.println("text" + i);
//			try {
//				thread.sleep(2000);
//			} catch (Exception e) {
//				e.printStackTrace();
//			}
//		}
//	}
//	
//	@Scheduled(fixedDelay = 1000 * 10)
////	@Async
//	public void doSomething2() {
//		for(int i = 1; i <=10; i++) {
//			System.out.println("fdfdfd" + i);
//			try {
//				thread.sleep(2000);
//			} catch (Exception e) {
//				e.printStackTrace();
//			}
//		}
//	}


// ************ fixedRate ************
//		@Scheduled(fixedRate = 30000)
//		public void Scheduled_Usages1() {
//			System.out.println("Method executed at every 5 seconds. Current time is: " + new Date());
//	
//		}
//
//	public void run() {
//		System.out.println(">>> " + Thread.currentThread().getName() + "  started");
//		while (true) {
//			try {
////				TimeUnit.HOURS.sleep(24); // for production
//				TimeUnit.SECONDS.sleep(5); // for testing
//			} catch (InterruptedException e) {
//				break;
//			}
//			System.out.println(">>> " + Thread.currentThread().getName() + "  is now deleting expired coupons");
////			couponRepository.deleteExpiredCoupons();
//		}
//		System.out.println(">>> " + Thread.currentThread().getName() + "  stop");
//	}
//
//	@PostConstruct
//	public void startTheThread() {
//		this.thread = new Thread(this, "CouponExpirationDailyIob");
//		this.thread.start();
//	}
//
//	@PreDestroy
//	public void stopTheThread() {
//		this.thread.interrupt();
//	}

//}
