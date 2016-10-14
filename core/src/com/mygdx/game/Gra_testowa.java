package com.mygdx.game;

import com.badlogic.gdx.Game;
import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.graphics.GL20;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;
import com.mygdx.game.screens.SplashScreen;

public class Gra_testowa extends Game {
	
	public final static String GAME_NAME="Pixel F1"; 
	
	public final static int WIDTH=800;
	public final static int HEIGHT=600;
	
	private boolean paused;
	
	//SpriteBatch batch;
	//Texture img;
	
	@Override
	public void create () {
		this.setScreen(new SplashScreen(this));
	}

	//@Override
	//public void render () {
	//	Gdx.gl.glClearColor(1, 0, 0, 1);
	//	Gdx.gl.glClear(GL20.GL_COLOR_BUFFER_BIT);
	//	batch.begin();
	//	batch.draw(img, 0, 0);
	//	batch.end();
	//}
	
	//@Override
	//public void dispose () {
	//	batch.dispose();
	//	img.dispose();
	//}
	/*
	
	getters and setters
	
	*/
	public boolean isPaused() {
		return paused;
	}

	public void setPaused(boolean paused) {
		this.paused = paused;
	}
}
