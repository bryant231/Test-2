package com.mygdx.game.screens;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.graphics.Color;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.BitmapFont;
import com.badlogic.gdx.utils.Timer;
import com.badlogic.gdx.utils.Timer.Task;
import com.mygdx.game.Gra_testowa;

public class SplashScreen extends AbstractScreen {
	
	private Texture splashImg;
	private BitmapFont font;
	
	
	
	
	public SplashScreen(final Gra_testowa game){
		super(game);
		init();
		Timer.schedule(new Task(){
			public void run(){
				System.out.println("3 sekunda");
				game.setScreen(new GameplayScreen(game));
			}
		},3);
	}


	protected void init() {
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
