package n1exercici1;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class MonthsTest {
	
	Months a = new Months();	
	
	@Test
	void test() {
			

		assertAll(
				()-> assertNotNull(a.monthListAdd()),
				()-> assertEquals(12, a.monthListAdd().size()),
				()-> assertEquals("agost", a.monthListAdd().get(7))
				);
		
	}

}

