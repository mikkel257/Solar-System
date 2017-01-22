package entity;

public class HelpClass {

	/**
	 * Checks if two doubles are equal with the given precision.
	 * @param precision The given precision
	 * @param a One of the doubles to be compared
	 * @param b One of the doubles to be compared
	 * @return True if the doubles where equal to each other within the precision.
	 */
	public static boolean equals(double precision, double a, double b)
	{
		return precision > Math.abs(a - b);
	}
}
