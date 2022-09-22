// 객지프 Lab03 객체,클래스와메쏘드
package deddeddw;

class LowerCaseTester {
	public static void main(String[] args) {
	
	String testString = "This is a Test";
	
	// replace with Lowercase
	String smallTestString = testString.toLowerCase();
	System.out.println(smallTestString);
	
	// replace with Uppercase
	String bigTestString = smallTestString.toUpperCase();
	System.out.println(bigTestString);
}
}
