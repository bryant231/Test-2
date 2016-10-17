package com.mygdx.game.entities;

import com.badlogic.gdx.scenes.scene2d.ui.Image;

public class Player extends Image {
	private final static int WIDTH = 25;
	private final static int HEIGHT = 50;
	
	private final static int STARTING_X = 400;
	private final static int STARTING_Y = 300;

	public Player(){
		super(new Texture(""));
	
	}
}
