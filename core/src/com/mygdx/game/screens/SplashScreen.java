package com.mygdx.game.screens;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.graphics.Texture;
import com.mygdx.game.Gra_testowa;

public class SplashScreen extends AbstractScreen {
	
	private Texture splashImg;
	
	
	
	public SplashScreen(Gra_testowa game){
		super(game);
		init();
		
	}


	private void init() {
		//TO DO better assets loading when game loads
		splashImg = new Texture(Gdx.files.internal("f1.jpg"));
		
	}
	public void render(float delta) {
		super.render(delta);
		
		sprite_batch.begin();
		
		sprite_batch.draw(splashImg,0,0);
		
		sprite_batch.end();
	}


	
	
}
