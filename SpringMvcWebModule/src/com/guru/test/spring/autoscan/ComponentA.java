package com.guru.test.spring.autoscan;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class ComponentA {
	
	@Autowired
	IComponentB componentB;

	public IComponentB getComponentB() {
		return componentB;
	}

	public void setComponentB(IComponentB componentB) {
		this.componentB = componentB;
	}
	

}
