package com.mygdx.game.screens;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.Input;
import com.mygdx.game.Gra_testowa;
import com.mygdx.game.entities.Player;
import com.badlogic.gdx.scenes.scene2d.InputEvent;
import com.badlogic.gdx.scenes.scene2d.ui.Button;
import com.badlogic.gdx.scenes.scene2d.ui.Button.ButtonStyle;
import com.badlogic.gdx.scenes.scene2d.utils.ClickListener;


public class GameplayScreen extends AbstractScreen {

	private Player player;
	private Button Up_Button;
	
	public GameplayScreen(Gra_testowa game) {
		super(game);
		init();
	}

	protected void init() {
		initPlayer();
		initUp_Button();
	}

	private void initUp_Button() {
		Up_Button = new Button(new ButtonStyle());
		Up_Button.setWidth(20);
		Up_Button.setHeight(20);
		Up_Button.setX(40);
		Up_Button.setY(10);
		Up_Button.setDebug(true);
		
		stage.addActor(Up_Button);
		
		Up_Button.addListener(new ClickListener(){
			
		public boolean touchDown(InputEvent event, float x, float y,
								int pointer, int button) {
			
			player.reactOnClick();
			
			return super.touchDown(event, x, y, pointer, button);
			
		}
		});
	}
	
	

	private void initPlayer() {
		player = new Player();
		stage.addActor(player);
	}
	public void render(float delta){
		super.render(delta);
		update();
	    
		sprite_batch.begin();
		
		stage.draw();
		
		sprite_batch.end();
	}

	private void update() {
		stage.act();
		
	}

}
