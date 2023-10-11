package n1exercici2;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;


class DniCalculatorTest {

	DniCalculator dni = new DniCalculator();
	
	@Test
	void test() {
				
		assertAll(
				()-> assertEquals('d', dni.letterDni(21780848)),
				()-> assertEquals('p', dni.letterDni(21589464)),
				()-> assertEquals('y', dni.letterDni(21597834)),
				()-> assertEquals('k', dni.letterDni(21648564)),
				()-> assertEquals('w', dni.letterDni(21780864)),
				()-> assertEquals('d', dni.letterDni(21545489)),
				()-> assertEquals('c', dni.letterDni(64852154)),
				()-> assertEquals('w', dni.letterDni(96369887)),
				()-> assertEquals('b', dni.letterDni(78985231)),
				()-> assertEquals('r', dni.letterDni(21783324))
				);
	}

}
