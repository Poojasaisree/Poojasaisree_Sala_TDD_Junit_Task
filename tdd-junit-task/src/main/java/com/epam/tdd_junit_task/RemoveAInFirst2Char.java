package com.epam.tdd_junit_task;

public class RemoveAInFirst2Char {

	public String remove(String string) {
		int stringLength = string.length();
		String result = "";
		if(stringLength > 1) {
			if(string.charAt(0) == 'A' && string.charAt(1) == 'A') {
				result =  string.substring(2,stringLength);
			} else if(string.charAt(0) == 'A') {
				result =  string.substring(1,stringLength);
			} else if(string.charAt(1) == 'A') {
				result += string.charAt(0);
				result += string.substring(2,stringLength);
			} else {
				result = string;
			}
		} else {
			if(stringLength == 1 && string.charAt(0) == 'A') {
				result = "";
			} else {
				result = string;
			}
		}
		return result;
	}

}
