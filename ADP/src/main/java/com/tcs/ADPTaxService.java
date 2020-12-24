package com.tcs;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.env.Environment;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ADPTaxService {    
	@Autowired
	private Environment environment;

	@GetMapping(path = "/taxcal/{eno}/{salary}")
	public ADPEmployee caltax( @PathVariable ("eno") Integer eno ,
			@PathVariable("salary")Integer salary) {
		
		int taxamount=(salary*30)/100;
		int netpay=salary-taxamount;
		
	ADPEmployee adpEmployee=new ADPEmployee();
	adpEmployee.setEno(eno);
	//adpEmployee.setName(name);
	adpEmployee.setSalary(salary);
	//adpEmployee.setTaxamount(taxamount);
	//adpEmployee.setNetpay(netpay);
	//adpEmployee.setAddress(address);
	return adpEmployee;
	}
}
