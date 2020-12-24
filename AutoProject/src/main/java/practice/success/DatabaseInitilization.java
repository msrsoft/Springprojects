package practice.success;

import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;
@Component
public class DatabaseInitilization implements CommandLineRunner{

	@Override
	public void run(String... args) throws Exception {
		System.out.println("object is avalible");
		for (String string : args) {
			System.out.println(string);
			
		}
	}

}
