package klapertart.lab.scheduler;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableScheduling;

@SpringBootApplication
@EnableScheduling
public class SampleSpringSchedulerApplication {

	public static void main(String[] args) {
		SpringApplication.run(SampleSpringSchedulerApplication.class, args);
	}

}
