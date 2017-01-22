
public class Vector {

	//Instance variables
	private double[] elements;
	
	/**
	 * Constructs a vector with n elements.
	 * @param elements The n elements
	 */
	public Vector(double[] elements)
	{
		this.elements = elements;
	}
	
	/**
	 * Constructs a vector with three element.
	 * @param x The first element.
	 * @param y The second element.
	 * @param z The third element.
	 */
	public Vector(double x, double y, double z)
	{
		elements = new double[3]; 
		elements[0] = x;
		elements[1] = y;
		elements[2] = z;
	}
	
	/**
	 * Returns the element at position i.
	 * @param positionI The position of the wanted element.
	 * @return The element at position i.
	 */
	public double getElement(int positionI)
	{
		return elements[positionI];
	}
	
	/**
	 * Calculates the euclidean norm of the vector. The euclidean norm is the length of the vector.
	 * @return The euclidean norm as a double.
	 */
	public double getEuclideanNorm()
	{
		final int SQUARED = 2;
		double sum = 0;
		for(int i = 0; i < elements.length; i++)
		{
			sum = sum + Math.pow(elements[i], SQUARED);
		}
		return Math.sqrt(sum);
	}
	
	/**
	 * Returns the amount of elements in the vector.
	 * @return The amount of elements in the vector.
	 */
	public int length()
	{
		return elements.length;
	}
	
	/**
	 * Adds the given vector to this vector if they have the same dimension.
	 * @param v The given vector.
	 */
	public void add(Vector v)
	{
		if (this.length() == v.length())
		{
			for(int i = 0; i < this.length(); i++)
			{
				elements[i] = elements[i] + v.getElement(i);
			}
		}
		else
		{
			System.out.println("The dimension of the vectors does not match!");
		}
	}
	
	/**
	 * Subtracts the given vector from this vector if they have the same dimension.
	 * @param v The given vector.
	 */
	public void subtract(Vector v)
	{
		if (this.length() == v.length())
		{
			for(int i = 0; i < this.length(); i++)
			{
				elements[i] = elements[i] - v.getElement(i);
			}
		}
		else
		{
			System.out.println("The dimension of the vectors does not match!");
		}
	}
	
	/**
	 * Checks if this vector equals the given vector within the given precision.
	 * @param v The given vector.
	 * @return True if this vector equals the given vector, false otherwise.
	 */
	public boolean equals(Vector v)
	{
		// e stands for epsilon and expresses how precise you want the calculation to be.
		double e = 1e-12;
		boolean truthValue = true;
		if (this.length() == v.length())
		{
			for(int i = 0; i < this.length(); i++)
			{
				truthValue = equals(e, elements[i], v.getElement(i));
				if(!truthValue)
				{
					break;
				}
			}
		}
		return truthValue;
	}
	
	/**
	 * Checks if two doubles are equal with the given precision.
	 * @param precision The given precision
	 * @param a One of the doubles to be compared
	 * @param b One of the doubles to be compared
	 * @return True if the doubles where equal to each other within the precision.
	 */
	private boolean equals(double precision, double a, double b)
	{
		return precision > Math.abs(a - b);
	}
}
