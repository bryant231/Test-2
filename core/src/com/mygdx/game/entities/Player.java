package com.mygdx.game.entities;

import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.math.Interpolation;
import com.badlogic.gdx.math.MathUtils;
import com.badlogic.gdx.scenes.scene2d.Action;
import com.badlogic.gdx.scenes.scene2d.actions.Actions;
import com.badlogic.gdx.scenes.scene2d.ui.Image;

public class Player extends Image {
	private final static int WIDTH = 70;
	private final static int HEIGHT = 150;
	
	private final static int STARTING_X = 400;
	private final static int STARTING_Y = 300;

	public Player(){
		super(new Texture("player.png"));
	
		this.setOrigin(WIDTH/2, HEIGHT/2);
		this.setSize(WIDTH, HEIGHT);
		
		this.setPosition(STARTING_X, STARTING_Y);
	}

	public void reactOnClick() {
		Action up=Actions.moveBy(0, 10);
		this.addAction(up);
	}
}
