package org.supermegagrejs.targaryentooth.html;

import org.supermegagrejs.targaryentooth.core.TargaryenTooth;

import com.badlogic.gdx.ApplicationListener;
import com.badlogic.gdx.backends.gwt.GwtApplication;
import com.badlogic.gdx.backends.gwt.GwtApplicationConfiguration;

public class TargaryenToothHtml extends GwtApplication {
	@Override
	public ApplicationListener getApplicationListener () {
		return new TargaryenTooth();
	}
	
	@Override
	public GwtApplicationConfiguration getConfig () {
		return new GwtApplicationConfiguration(480, 320);
	}
}
