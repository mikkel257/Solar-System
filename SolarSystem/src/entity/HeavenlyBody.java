package entity;

import java.awt.Color;

public abstract class HeavenlyBody {
	
	//Instance variables
	protected String name;
	protected Vector position;
	protected Vector velocity;
	protected Color color;
	
	public HeavenlyBody(String name, Vector position, Vector velocity, Color color)
	{
		this.name = name;
		this.position = position;
		this.velocity = velocity;
		this.color = color;
	}
	
	public abstract void updateInformation(double timeStep);

}
