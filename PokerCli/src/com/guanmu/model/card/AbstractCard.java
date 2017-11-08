package com.guanmu.model.card;



public abstract class AbstractCard implements ICard {
	/** ¥Û–°÷µ*/
	protected int value;
	
	protected int id;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getValue() {
		return value;
	}

	
}
