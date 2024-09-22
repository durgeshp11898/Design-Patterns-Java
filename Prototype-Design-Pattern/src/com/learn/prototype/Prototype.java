package com.learn.prototype;

public abstract class Prototype implements Cloneable {

	@Override
	protected Object clone() throws CloneNotSupportedException {
		return super.clone();
	}


	public abstract void log();
}
