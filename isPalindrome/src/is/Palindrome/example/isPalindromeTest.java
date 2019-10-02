package is.Palindrome.example;

import static org.junit.Assert.assertEquals;
import org.junit.jupiter.api.Test;



class isPalindromeTest {

	@Test
	void test() {
		boolean resultTest1 = isPalindromeClass.isPalindrome("madam");
		assertEquals(true, resultTest1);
	}
	
	@Test
	void test1() {
		boolean resultTest2 = isPalindromeClass.isPalindrome("racecar");
		assertEquals(true, resultTest2);
	}
	
	@Test
	void test3() {
		boolean resultTest3 = isPalindromeClass.isPalindrome("LeeCasey");
		assertEquals(false, resultTest3);
	}

}
