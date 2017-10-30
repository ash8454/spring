package com.in28minutes.spring.basics.componentscan;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.config.ConfigurableBeanFactory;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
//@Scope(ConfigurableBeanFactory.SCOPE_PROTOTYPE)
public class ComponentDAO {
	
	@Autowired
	ComponentJdbcConnection jdbcConection;

	public ComponentJdbcConnection getJdbcConection() {
		return jdbcConection;
	}

	public void setJdbcConection(ComponentJdbcConnection jdbcConection) {
		this.jdbcConection = jdbcConection;
	}

	
	
}
