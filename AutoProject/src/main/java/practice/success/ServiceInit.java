package practice.success;

import java.util.List;

import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.annotation.Order;
@Configuration
@Order(value = 1)

public class ServiceInit implements ApplicationRunner{

	@Override
	public void run(ApplicationArguments args) throws Exception {
		System.out.println("Service Init");

		List<String> nonOptionArgs = args.getNonOptionArgs();
		nonOptionArgs.forEach(data -> System.out.println(data));
	}

}
