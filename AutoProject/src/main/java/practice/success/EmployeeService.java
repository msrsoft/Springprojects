package practice.success;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class EmployeeService {
	@Autowired
	private DataSource dataSource;
	public void display() {
		System.out.println("dispaly the data");
	}

}
