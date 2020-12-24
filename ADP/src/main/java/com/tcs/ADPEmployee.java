package com.tcs;

import org.springframework.context.annotation.Configuration;

@Configuration
public class ADPEmployee {

	private Integer eno;
	private Integer salary;

	public Integer getEno() {
		return eno;
	}

	public void setEno(Integer eno) {
		this.eno = eno;
	}

	public Integer getSalary() {
		return salary;
	}

	public void setSalary(Integer salary) {
		this.salary = salary;
	}

}
