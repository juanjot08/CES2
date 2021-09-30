package net.SoftwareDos.BackendJava;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import net.SoftwareDos.BackendJava.Controllers.UserController;

@SpringBootApplication
public class BackendJavaApplication {

	public static void main(String[] args) {
		SpringApplication.run(BackendJavaApplication.class, args);
		new UserController();
		System.out.println("Bonsoir");
	}

}
