package practice.success;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class AppApplication {
	Person per=new Person();
	
	public static void main(String[] args) {
		SpringApplication.run(AppApplication.class, args);
	}


}
