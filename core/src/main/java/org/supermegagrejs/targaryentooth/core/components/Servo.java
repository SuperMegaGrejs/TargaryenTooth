package org.supermegagrejs.targaryentooth.core.components;

import org.supermegagrejs.targaryentooth.core.controllers.Controller;
import org.supermegagrejs.targaryentooth.core.parameters.PListener;
import org.supermegagrejs.targaryentooth.core.parameters.Parameter;


public class Servo extends Component {
	private Parameter<Float> servoAngle = new Parameter<Float>(new PListener<Float>() {
		@Override
		public void onChange(Parameter<Float> parameter) {
			driver.setAngle(getId(), parameter.getValue());
		}
	});
	
	private ServoDriver driver;
	
	public Servo(String id, ServoDriver driver) {
		super(id);
		this.driver = driver;
	}
	
	public Parameter<Float> getServoAngle() {
		return servoAngle;
	}

	@Override
	protected void onConnect(Controller<?> controller) {
		servoAngle.setValue(1F); //TODO Some configuration is maybe needed for initial value
	}
}
