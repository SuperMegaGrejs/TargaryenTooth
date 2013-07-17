package org.supermegagrejs.targaryentooth.core.components;

import org.supermegagrejs.targaryentooth.core.controllers.Controller;

public abstract class Component {
	private String id;
	
	public Component(String id) {
		this.id = id;
	}
	
	public String getId() {
		return id;
	}
	
	protected abstract void onConnect(Controller<?> controller);

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((id == null) ? 0 : id.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Component other = (Component) obj;
		if (id == null) {
			if (other.id != null)
				return false;
		} else if (!id.equals(other.id))
			return false;
		return true;
	}
}
