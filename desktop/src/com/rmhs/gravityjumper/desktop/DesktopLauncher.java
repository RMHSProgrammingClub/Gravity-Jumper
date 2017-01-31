package com.rmhs.gravityjumper.desktop;

import com.badlogic.gdx.backends.lwjgl.LwjglApplication;
import com.badlogic.gdx.backends.lwjgl.LwjglApplicationConfiguration;
import com.rmhs.gravityjumper.GravityJumper;

public class DesktopLauncher {
	
	public static void main (String[] arg) {
		
		LwjglApplicationConfiguration config = new LwjglApplicationConfiguration();
		final LwjglApplication app = new LwjglApplication(new GravityJumper(), config);
		
	}
	
}
