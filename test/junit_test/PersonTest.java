package junit_test;

import static org.junit.Assert.*;

import org.junit.Test;

public class PersonTest {

	@Test
	public void test() {
		Person man = new Person(3);
		assertEquals(3, man.age);
	}

}
