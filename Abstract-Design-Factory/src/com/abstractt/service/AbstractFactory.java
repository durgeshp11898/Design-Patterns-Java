package com.abstractt.service;

//Abstract Factory interface
public interface AbstractFactory<T> {

	T create(String type);

}