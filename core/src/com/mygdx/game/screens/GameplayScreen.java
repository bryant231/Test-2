package com.mygdx.game.screens;

import com.mygdx.game.Gra_testowa;
import com.mygdx.game.entities.Player;

public class GameplayScreen extends AbstractScreen {

	private Player player;
	
	public GameplayScreen(Gra_testowa game) {
		super(game);
		init();
	}

	private void init() {
		initPlayer();
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
