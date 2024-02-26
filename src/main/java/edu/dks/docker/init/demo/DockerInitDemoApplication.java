package edu.dks.docker.init.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
@RequestMapping("/service")
public class DockerInitDemoApplication {

	@GetMapping("")
	public String service(){
		return "<h1>Successfully lunched docker-init-demo....!!</h1>";
	}

	@GetMapping("/data")
	public String data(){
		return "<h1>DATA - Successfully lunched docker-init-demo....!!</h1>";
	}

	public static void main(String[] args) {
		SpringApplication.run(DockerInitDemoApplication.class, args);
	}

}
