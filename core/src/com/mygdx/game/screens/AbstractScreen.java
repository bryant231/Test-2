package com.mygdx.game.screens;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.Screen;
import com.badlogic.gdx.graphics.GL20;
import com.badlogic.gdx.graphics.OrthographicCamera;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;
import com.badlogic.gdx.scenes.scene2d.Stage;
import com.badlogic.gdx.utils.viewport.StretchViewport;
import com.mygdx.game.Gra_testowa;

public abstract class AbstractScreen implements Screen {
	
	protected Gra_testowa game;
	//Dodanie sceny
	protected Stage stage;
	//Dodanie kamery
	private OrthographicCamera camera;
	
	protected SpriteBatch sprite_batch;
	
	public AbstractScreen(Gra_testowa game) {
		this.game = game;
		CreateCamera();
		stage = new Stage(new StretchViewport(Gra_testowa.WIDTH, Gra_testowa.HEIGHT,camera));
		sprite_batch = new SpriteBatch();
		Gdx.input.setInputProcessor(stage);
	}
	//Metoda tworz¹ca now¹ kamerê 
	private void CreateCamera() {
		camera = new OrthographicCamera();
		camera.setToOrtho(false,Gra_testowa.WIDTH,Gra_testowa.HEIGHT);
		camera.update();
	}
	@Override
	public void render(float delta) {
		
		clr_scr();
		camera.update();
		sprite_batch.setProjectionMatrix(camera.combined);
		
		
	}
	private void clr_scr() {
		Gdx.gl.glClearColor(255, 255, 255, 0);
		Gdx.gl.glClear(GL20.GL_COLOR_BUFFER_BIT);
		
	}
	public void show(){
		
	
	}
	public void resume(){
		game.setPaused(false);
	}
	public void pause(){
		game.setPaused(true);
	}
	
	public void hide(){
		
		
		
	}
	
	// dispose - to co sie dzieje po zamknieciu aplikacji
	public void dispose(){
		game.dispose();
		sprite_batch.dispose();
	}
	
	@Override
	public void resize(int width, int height) {
		
		
	}
}
