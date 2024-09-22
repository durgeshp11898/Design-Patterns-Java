package com.learn.prototype.impl;

import java.util.logging.Logger;

import com.learn.prototype.Prototype;


public class ConcretePrototype extends Prototype {

	private String name;
	private int value;
	
	private static final Logger logger = Logger.getLogger(ConcretePrototype.class.getName());

	public ConcretePrototype(String name, int value) {
		this.name = name;
		this.value = value;
	}

	@Override
	public Object clone() throws CloneNotSupportedException {
		return super.clone(); // Calling the Object's clone method
	}

	@Override
	public void log() {
		logger.info("ConcretePrototype instance with hashcode: " + this.hashCode());
	}

	@Override
	public String toString() {
		return "ConcretePrototype{name='" + name + "', value=" + value + "}";
	}

	@Override
	public int hashCode() {
		return (name != null ? name.hashCode() : 0) + value;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj) return true;
		if (!(obj instanceof ConcretePrototype)) return false;
		ConcretePrototype other = (ConcretePrototype) obj;
		return value == other.value && (name != null ? name.equals(other.name) : other.name == null);
	}
}
