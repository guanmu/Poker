package com.guanmu.model.card;


/**
 * 抽象卡牌类
 * @author wangquan
 *
 */
public abstract class AbstractCard implements ICard {
	/** 大小值*/
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
