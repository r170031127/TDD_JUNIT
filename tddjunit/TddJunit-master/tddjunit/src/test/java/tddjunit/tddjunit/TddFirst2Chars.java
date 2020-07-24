package tddjunit.tddjunit;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
//import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Test;

class TddFirst2Chars {

	/* TODO List
	 * 1. 2 chars 
	 * 2. 1 char
	 * 3. n chars
	 * 4. empty
	 */
	CheckFirst2Chars check;
	
	@BeforeEach
	void init() {
		check=new CheckFirst2Chars();
	}
	
	@Test
	void test2chars() {
		assertEquals("B",check.checkFirst("AB"));
	}
	@Test
	void test1chars() {
		assertEquals("B",check.checkFirst("B"));
	}
	@Test
	void testnchars() {
		assertEquals("BBBC",check.checkFirst("BABBC"));
	}
	@Test
	void testemptychars() {
		assertEquals("",check.checkFirst(""));
	}
}
