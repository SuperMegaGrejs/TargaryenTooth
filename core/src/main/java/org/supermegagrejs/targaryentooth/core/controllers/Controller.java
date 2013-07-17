package org.supermegagrejs.targaryentooth.core.controllers;

import java.util.ArrayList;
import java.util.List;

import org.supermegagrejs.targaryentooth.core.parameters.PListener;
import org.supermegagrejs.targaryentooth.core.parameters.Parameter;


public class Controller<T> {
	private class ParameterRegister<F> {
		Parameter<F> parameter;
		Transformer<T, F> transformer;
		public void onChange(T change) {
			parameter.setValue(transformer.transform(change));
		}
	}
	
	
	private Parameter<T> controllParameter = new Parameter<T>(new PListener<T>() {
		@Override
		public void onChange(Parameter<T> parameter) {
			for(ParameterRegister<?> register : parameters) {
				register.onChange(parameter.getValue());
			}
		}
	});
	
	private List<ParameterRegister<?>> parameters = new ArrayList<ParameterRegister<?>>();
	
	public <F> void connectParameter(Parameter<F> parameter, Transformer<T, F> transformer) {
		ParameterRegister<F> register = new ParameterRegister<F>();
		register.parameter = parameter;
		register.transformer = transformer;
		parameters.add(register);
	}
	
	public Parameter<T> getControllParameter() {
		return controllParameter;
	}
}
