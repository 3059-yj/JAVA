//객지프 Lab03 메쏘드매개변수와반환값

package deddeddw;

public class ConcatTester {
	public static void main(String[] args)
	{
		String animal1 = "quick brown fox";
		String animal2 = "lazy dog";
		String article = "the";
		String action = "jumps over";
		
		///////////////
		String resultString = "the ".concat(animal1).concat(" ").concat(action).concat(" ").concat(article).concat(" ").concat(animal2); 
		System.out.println(resultString);
		System.out.println("문자열 길이: " + resultString.length());
	}
}
