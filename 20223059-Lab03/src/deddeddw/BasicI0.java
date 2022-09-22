//객지프 Lab03 기본적인입력및출력
package deddeddw;

import java.util.*;

//An exploration of basic input and output.
class BasicIO {
	
//Reads and processes string input.
public static void main(String[] args) {

Scanner stdin = new Scanner(System.in);

// get first input
System.out.print("Enter your name: ");
String name = stdin.nextLine();

// display output on console_1
System.out.println("your name is " + name);

// get seonde input
System.out.print("Enter your years: ");
int years = stdin.nextInt();

// display output on console_2
System.out.println(name + years);

// display output on console_3
System.out.println("years*365 = " + years * 365);

// get third input
System.out.print("Enter your height: ");
int height = stdin.nextInt();

System.out.printf("2022년 09월 21일 현재 %s(%d)의 키는 %dcm 입니다.%n" ,name,years,height);


}  // method main

}  // class BasicIO