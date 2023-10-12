package n1exercici3;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class ThrowClassErrorTest {

	ThrowErrorClass a = new ThrowErrorClass();
	
	@Test
	void test() {
		
		assertThrows(ArrayIndexOutOfBoundsException.class, () -> a.throwError());
		
	}

}
