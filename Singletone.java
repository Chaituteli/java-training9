package com.vstl.singletone;

public class Singletone {
	
	private static Singletone App=null;
	
	public String strWhatsapp;
	private Singletone() {
		strWhatsapp="Hey ,I am using Whats app";
	}
	//singleton return get instance of that particular class
	public static Singletone getInstance() {
		if(App==null) 
			App =new Singletone();
			return  App;
	}
	}
