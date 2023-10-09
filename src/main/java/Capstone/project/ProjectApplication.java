package Capstone.project;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@SpringBootApplication
public class ProjectApplication {
	@RequestMapping("/")
	String home() {
		return "spring_boot api test";
	}

	@RequestMapping("/api")
	String test_api() {
		return "{'team' : '탕후루'}";
	}
	public static void main(String[] args) {
		SpringApplication.run(ProjectApplication.class, args);
	}
}