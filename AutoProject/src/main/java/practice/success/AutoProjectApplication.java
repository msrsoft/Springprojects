package practice.success;

import javax.annotation.PostConstruct;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class AutoProjectApplication {
	@Autowired
	private DataSource dataSource;

	@PostConstruct
	public void init() {
		System.out.println(dataSource);
	}

	public static void main(String[] args) {
		SpringApplication.run(AutoProjectApplication.class, args);
	}

}
