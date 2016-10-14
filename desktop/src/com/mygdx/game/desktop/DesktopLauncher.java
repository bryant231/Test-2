package com.mygdx.game.desktop;

import com.badlogic.gdx.backends.lwjgl.LwjglApplication;
import com.badlogic.gdx.backends.lwjgl.LwjglApplicationConfiguration;
import com.mygdx.game.Gra_testowa;

public class DesktopLauncher {
	public static void main (String[] arg) {
		LwjglApplicationConfiguration config = new LwjglApplicationConfiguration();
		new LwjglApplication(new Gra_testowa(), config);
		
		//Ustawienie nazwy i rozdzielczoœci gry
		config.title = Gra_testowa.GAME_NAME;
		config.width = Gra_testowa.WIDTH;
		config.height = Gra_testowa.HEIGHT;
		config.resizable = false;
		
	}
}
