package com.dlh.zambas.facade.pattern;

import java.util.HashMap;
import java.util.Map;

public class ABMain {
	public static void main(String[] args) throws Exception {
		A a = new B();
		a.a();

		A a1 = new A();
		a1.a();

		B b = new B();
		b.a();
		b.b();	
		

	}

	public void a(){
		Map<Integer,Integer> m = new HashMap<Integer,Integer>();
	}
	

}
