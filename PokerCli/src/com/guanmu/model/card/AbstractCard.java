package com.guanmu.model.card;


/**
 * ��������
 * @author wangquan
 *
 */
public abstract class AbstractCard implements ICard {
	/** ��Сֵ*/
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
