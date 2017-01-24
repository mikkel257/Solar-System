package entity;

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
	 * Returns the element at position i. 0-indexed
	 * @param positionI The position of the wanted element.
	 * @return The element at position i.
	 */
	public double getElement(int positionI)
	{
		return elements[positionI];
	}
	
	/**
	 * Returns all the elements of the vector.
	 * @return All the elements of the vector as a double array.
	 */
	public double[] getElements(){
		return elements;
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
	public Vector add(Vector v)
	{
		double[] newVector = new double[this.length()];
		if (this.length() == v.length())
		{
			for(int i = 0; i < this.length(); i++)
			{
				newVector[i] = elements[i] + v.getElement(i);
			}
		}
		else
		{
			System.out.println("The dimension of the vectors does not match!");
		}
		return new Vector(newVector);
	}
	
	/**
	 * Subtracts the given vector from this vector if they have the same dimension.
	 * @param v The given vector.
	 */
	public Vector subtract(Vector v)
	{
		double[] newVector = new double[this.length()];
		if (this.length() == v.length())
		{
			for(int i = 0; i < this.length(); i++)
			{
				newVector[i] = elements[i] - v.getElement(i);
			}
		}
		else
		{
			System.out.println("The dimension of the vectors does not match!");
		}
		return new Vector(newVector);
	}
	
	/**
	 * Scales this vector with the given scalar.
	 * @param scalar The given scalar.
	 * @return The scaled vector.
	 */
	public Vector scale(double scalar)
	{
		double[] newVector = new double[this.length()];
		for(int i = 0; i < this.length(); i++)
		{
			newVector[i] = scalar * elements[i];
		}
		return new Vector(newVector);
	}
	
	/**
	 * Checks if this vector equals the given vector within the given precision if both vectors have the same dimension.
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
				truthValue = HelpClass.equals(e, elements[i], v.getElement(i));
				if(!truthValue)
				{
					break;
				}
			}
		}
		else
		{
			truthValue = false;
		}
		return truthValue;
	}
}
