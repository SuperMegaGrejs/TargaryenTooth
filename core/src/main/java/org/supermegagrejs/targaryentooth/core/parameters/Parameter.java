package org.supermegagrejs.targaryentooth.core.parameters;

public class Parameter<T> {
	private T value;
	private PListener<T> listener;
	
	public Parameter(PListener<T> listener, T value) {
		this.value = value;
		this.listener = listener;
	}
	
	public Parameter(PListener<T> listener) {
		this(listener, null);
	}
	
	public T getValue() {
		return value;
	}
	
	public void setValue(T value) {
		this.value = value;
		listener.onChange(this);
	}
}
