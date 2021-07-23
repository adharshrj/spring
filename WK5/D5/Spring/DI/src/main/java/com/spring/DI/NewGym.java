package com.spring.DI;

public class NewGym implements InterfaceGym {
	private InterfaceDI ExampleDI;
	
	public void setExampleDI(InterfaceDI ExampleDI){
		this.ExampleDI = ExampleDI;
		System.out.println("Dependency Injection Setter");
	}
	
	public String workout() {
		return "2 hr per day";
	}
	
	public String ImpExample() {
		return ExampleDI.ExampleDI();
	}

}
