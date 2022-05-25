package com.vstl.polymorphisam;

public class BMWCar extends MethodOverridingCar {
	@Override
	public void Model() {
		super.Model();
		System.out.println("BMW car model 2012");
	}
	@Override
    public void ColourofCar() {
		super.ColourofCar();
    	System.out.println("colour is White");
    }

}
