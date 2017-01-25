package entity;

import java.awt.Color;

public class Sun extends HeavenlyBody {

	public Sun(String name, Vector position, Vector velocity, Color color)
	{
		super(name, position, velocity, color);
	}
	
	@Override
	public void updateMotion(double timeStep)
	{
		updatePosition(timeStep);
	}
	
	private void updatePosition(double timeStep)
	{
		this.position = this.position.add(this.velocity.scale(timeStep));
	}
}
