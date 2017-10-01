package com.wdy.deeplearn.ng;

import org.testng.asserts.Assertion;

public class FrameAssertion {
	

	public static void fail(String...message){
		LogUtil.error(message);
		new Assertion().fail(message[0]);
	}
	
	
	public static <T> void equals(T actual, T expect, String description) {
		if (actual.equals(expect)) {
			LogUtil.step("Actual Value '" + actual + "' equals Expect value '" + expect + "', Passed",
					"检查点: " + description);
		} else {
			fail("Actual value '" + actual + "' not equals Expect value '" + expect + "', Failed",
					"检查点: " + description);
		}
	
	}	
}
