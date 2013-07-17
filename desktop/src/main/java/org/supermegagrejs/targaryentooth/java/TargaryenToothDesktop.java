package org.supermegagrejs.targaryentooth.java;

import com.badlogic.gdx.backends.lwjgl.LwjglApplication;
import com.badlogic.gdx.backends.lwjgl.LwjglApplicationConfiguration;

import org.supermegagrejs.targaryentooth.core.TargaryenTooth;

public class TargaryenToothDesktop {
	public static void main (String[] args) {
		LwjglApplicationConfiguration config = new LwjglApplicationConfiguration();
		config.useGL20 = true;
		new LwjglApplication(new TargaryenTooth(), config);
	}
}
