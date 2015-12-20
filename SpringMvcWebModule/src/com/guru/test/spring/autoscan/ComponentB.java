package com.guru.test.spring.autoscan;
import org.springframework.stereotype.Component;

@Component
public class ComponentB implements IComponentB {

	public String getMessage() {
		return "Auto wiring is success";
	}
}
