package entity;

import java.awt.Color;

public class Planet extends HeavenlyBody {

	//Instance variables
	private Vector acceleration;

	public Planet(String name, Vector position, Vector velocity, Color color) 
	{
		super(name, position, velocity, color);
	}
	
	@Override
	public void updateMotion(double timeStep, Vector sunPosition)
	{
		updateAcceleration(timeStep, sunPosition);
		updatePosition(timeStep);
		updateVelocity(timeStep);
	}
	
	private void updateAcceleration(double timeStep, Vector sunPosition)
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
