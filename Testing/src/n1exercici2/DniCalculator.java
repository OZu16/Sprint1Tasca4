package n1exercici2;

public class DniCalculator {
	
	public static char letterDni(int dniNum) {
		
		final char[] DNILETTERS = {'t','r','w','a','g','m','y','f','p','d','x','b','n','j','z','s','q','v','h','l','c','k','e'};
		int index  = dniNum % 23;
		
		return DNILETTERS[index];
		
	}

}
