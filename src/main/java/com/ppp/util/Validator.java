package com.ppp.util;

public class Validator {
	
	private static boolean isInputValid=false;
	
	public static boolean isEmailIdValid(String email) {
		isInputValid = false;

		if (null != email && email.length() > 0) {
			isInputValid = email
					.matches("\\b[A-Za-z0-9._%+-]+@[A-Za-z0-9.-]+\\.[A-Za-z]{1,4}\\b");
		} else
			isInputValid = true;

		return isInputValid;
	}
	
	public static boolean isPhoneNumberValid(String phoneNumber) {
		isInputValid = false;

		if (null != phoneNumber && phoneNumber.length() > 0) {
			isInputValid = phoneNumber
					.matches("^(\\(?(0|91)[1-9]{1}\\d{1,4}?\\)?\\d{2,4}\\d{3,4})$");		
		} else
			isInputValid = true;

		return isInputValid;
	}
	
	public static boolean isAddressValid(String address) {
		isInputValid = false;

		if (null != address && address.length() > 0) {
			isInputValid = address.matches("^[a-zA-Z0-9-_.,():'/&\\s]+$");
		} else {
			isInputValid = true;
		}

		return isInputValid;
	}
	
	public static boolean bothEqual(String input1, String input2){
			
			isInputValid = false;
	
			if (null != input1 && null != input2) {			
				isInputValid = input1.equals(input2);
			} 
			return isInputValid;
		}
	
	public static boolean isNameValid(String name) {
		isInputValid = false;

		if (null != name && name.length() > 0) {
			isInputValid = name
					.matches("^[a-zA-Z-.,():_'&/\\s]+$");
		} else
			isInputValid = true;

		return isInputValid;
	}
	public static boolean isNumberValid(String number) {
		isInputValid = false;

		if (null != number && number.length() > 0) {
			isInputValid = number
					.matches("^[0-9\\s]+$");
		} else
			isInputValid = true;

		return isInputValid;
	}

}
