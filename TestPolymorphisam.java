package com.vstl.polymorphisam;

public class TestPolymorphisam {

	public static void main(String[] args) {
		//Method overloading
		Methodoverloading objMethodoverloading=new Methodoverloading();
		objMethodoverloading.string();
		objMethodoverloading.string(140,45);
		objMethodoverloading.string(34,23.89);
		objMethodoverloading.string(true);
            
		
		//Method overriding
		
		MethodOverridingCar objMethodOverridingCar=new BMWCar();
		objMethodOverridingCar.Model();
		objMethodOverridingCar.ColourofCar();
		
		
		
	}

}
