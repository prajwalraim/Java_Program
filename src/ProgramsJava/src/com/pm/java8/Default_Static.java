package com.pm.java8;

interface A
{
	default void hello() {
		System.out.println("hello");
		helloStatic();
	}
	public static void helloStatic() {
		System.out.println("static");
	}
}
class Default_Static implements A
{public static void main(String[] args) {
	
	Default_Static DF = new Default_Static();
	DF.hello();
	A.helloStatic();
	heldloStatic();
	DF.testAccess();
	
	
	
}
static void heldloStatic() {
	System.out.println("static in class");
}
private void testAccess() {
	System.out.println("testAccess in class");
}

}


