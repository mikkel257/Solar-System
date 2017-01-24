package entity;

import java.awt.Color;

public class Planet extends HeavenlyBody {

	//Instance variables
	private Vector acceleration;

	public Planet(String name, Vector position, Vector velocity, Color color) 
	{
		super(name, position, velocity, color);
	}
	
	public void updateMotion(double timeStep)
	{
		updateAcceleration(timeStep);
		updatePosition(timeStep);
		updateVelocity(timeStep);
	}
	
	private void updateAcceleration(double timeStep)
	{
		
	}
	
	private void updatePosition(double timeStep)
	{
		this.position = this.position.add(this.velocity.scale(timeStep));
	}
	
	private void updateVelocity(double timeStep)
	{
		this.velocity = this.velocity.add(this.acceleration.scale(timeStep));
	}
	
	
}
