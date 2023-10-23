package n2exercici1;

import static org.hamcrest.MatcherAssert.assertThat;
import org.hamcrest.FeatureMatcher;
import org.hamcrest.Matcher;
import org.junit.jupiter.api.Test;
import static org.hamcrest.CoreMatchers.*;

class StringClassTest {

	String str = StringExample.getSTR();
	int num = 11;
	
	@Test
	void test() {
		assertThat(str, length(is(num)));
		}

	public static Matcher<String> length(Matcher<? super Integer> matcher) {

		return new FeatureMatcher<String, Integer>(matcher, "the lenght of string that ", "length") {
			protected Integer featureValueOf(String actual) {
				return actual.length();
			}
		};
	}

}
