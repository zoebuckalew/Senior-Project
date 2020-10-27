package com.seniorproject.maps;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.maps.MapObject;
import com.badlogic.gdx.math.Rectangle;
import com.seniorproject.components.MovementDirection;

public class StairsTrigger
{
	public static final String TAG = StairsTrigger.class.getSimpleName();
	
	private float x;
	private float y;
	private float width;
	private float height;
	private Rectangle bounds;
	
	private int yShift;
	private MovementDirection.Direction activateFromDirection;
	
	private String debugName;
	
	public StairsTrigger(MapObject object)
	{
		this.yShift = Integer.valueOf(object.getProperties().get("yShift", Integer.class));
		String direction = String.valueOf(object.getProperties().get("activateOnDirection", String.class));
		this.activateFromDirection = MovementDirection.Direction.valueOf(direction);
		
		this.x = object.getProperties().get("x", Float.class);
		this.x = x / 16;
		this.y = object.getProperties().get("y", Float.class);
		this.y = y / 16;
		this.width = object.getProperties().get("width", Float.class);
		this.width = width / 16;
		this.height = object.getProperties().get("height", Float.class);
		this.height = height / 16;
		
		this.debugName = object.getName();

		this.bounds = new Rectangle(x, y, width, height);
		
		Gdx.app.debug(TAG, "New StairsTrigger object " + object.getName() + " created with values: " + bounds.toString());
		Gdx.app.debug(TAG, "\tThis trigger activates when direction is " + direction);
	}
	
	public Rectangle getStairTriggerBounds()
	{
		return bounds;
	}
	
	public int getYShift()
	{
		return yShift;
	}
	
	public MovementDirection.Direction getActivationDirection()
	{
		return activateFromDirection;
	}
	
	public boolean checkTriggerActivation(Rectangle playerBoundingBox)
	{
		if(bounds.overlaps(playerBoundingBox))
		{
			return true;
		}
		
		return false;
	}
	
	public String getName()
	{
		return debugName;
	}
}
