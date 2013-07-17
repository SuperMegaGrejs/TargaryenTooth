package org.supermegagrejs.targaryentooth.core.controllers;

public interface Transformer<T, F> {
	public F transform(T from);
}
