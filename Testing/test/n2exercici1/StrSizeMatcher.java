package n2exercici1;

import org.hamcrest.Matcher;
import org.hamcrest.FeatureMatcher;

public class StrSizeMatcher extends FeatureMatcher {
	
	
	public StrSizeMatcher(Matcher subMatcher, String featureDescription, String featureName) {
		super(subMatcher, featureDescription, featureName);
	}

	@Override
	protected Object featureValueOf(Object actual) {
		
		return null;
	}
}
