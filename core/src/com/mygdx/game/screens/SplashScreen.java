package com.mygdx.game.screens;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.graphics.Color;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.BitmapFont;
import com.mygdx.game.Gra_testowa;

public class SplashScreen extends AbstractScreen {
	
	private Texture splashImg;
	private BitmapFont font;
	
	
	
	
	public SplashScreen(Gra_testowa game){
		super(game);
		init();
		
	}


	private void init() {
		//TO DO better assets loading when game loads
		splashImg = new Texture(Gdx.files.internal("f1.jpg"));
		font = new BitmapFont();
		font.setColor(Color.BLACK);
	}
	public void render(float delta) {
		super.render(delta);
		
		sprite_batch.begin();
		
		sprite_batch.draw(splashImg,0,0);
		
		font.draw(sprite_batch, "Pixel F1", 400, 560);
		
		sprite_batch.end();
	}

}
