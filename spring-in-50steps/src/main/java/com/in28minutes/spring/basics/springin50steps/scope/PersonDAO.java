package com.in28minutes.spring.basics.springin50steps.scope;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.config.ConfigurableBeanFactory;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
//@Scope(ConfigurableBeanFactory.SCOPE_PROTOTYPE)
public class PersonDAO {
	
	@Autowired
	JdbcConnection jdbcConection;

	public JdbcConnection getJdbcConection() {
		return jdbcConection;
	}

	public void setJdbcConection(JdbcConnection jdbcConection) {
		this.jdbcConection = jdbcConection;
	}

	
	
}
