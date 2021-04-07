package com.constructor.object;

class P {
	public P() {
		System.out.println(this.hashCode());
	}
}

class C extends P {
	public C() {
		System.out.println(this.hashCode());
	}
}

public class Test {
	public static void main(String[] args) {
		C c = new C();
		System.out.println(c.hashCode());
	}
}
