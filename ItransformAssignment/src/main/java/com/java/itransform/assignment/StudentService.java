package com.java.itransform.assignment;

import com.java.itransform.assignment.exception.AgeNotWithinRangeException;

public class StudentService {

	public static boolean CheckAge(int Age) {
		try {
			if (Age < 15 || Age > 21)
				throw new AgeNotWithinRangeException("Select appropriate age");

			return true;
		} catch (AgeNotWithinRangeException e) {
			System.out.println(e.getMessage());
			return false;

		}

	}

	public static boolean CheckName(String name) {
		try {
			for (int i = 0; i < name.length(); i++) {
				char ch = name.charAt(i);
				if (!((ch >= 'a' && ch <= 'z') || (ch >= 'A' && ch <= 'Z')))
					throw new Exception("Enter alphabets only");
			}
			return true;
		} catch (Exception e) {
			System.out.println(e.getMessage());
			return false;

		}
	}

}
