package com.vstl.singletone;

public class TestSingletone {

	public static void main(String[] args) {
		Singletone objSingletone=Singletone.getInstance();
		Singletone objSingletone1=Singletone.getInstance();
		Singletone objSingletone2=Singletone.getInstance();
		
		
		objSingletone.strWhatsapp=(objSingletone.strWhatsapp).toUpperCase();
		System.out.println(objSingletone.strWhatsapp);
		System.out.println(objSingletone1.strWhatsapp);
		System.out.println(objSingletone2.strWhatsapp);
		
		
		objSingletone2.strWhatsapp=(objSingletone.strWhatsapp).toLowerCase();
		System.out.println(objSingletone.strWhatsapp);
		
		
	}

}
