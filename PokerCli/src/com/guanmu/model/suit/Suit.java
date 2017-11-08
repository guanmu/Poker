package com.guanmu.model.suit;

import com.guanmu.resouses.Message;

/**
 * 花色抽象类
 * @author wangquan
 *
 */
public enum Suit {
	
	Clubs(SuitColor.BlackSuit,Message.getString("Clubs.name")),			// 梅花
	Diamonds(SuitColor.RedSuit,Message.getString("Diamonds.name")),		// 方块
	Hearts(SuitColor.RedSuit,Message.getString("Hearts.name")),			// 红桃
	Spades(SuitColor.BlackSuit,Message.getString("Spades.name"));		// 黑桃
	
	private Suit(SuitColor sc,String text) {
		this.color = sc;
		this.text = text;
	}

	protected SuitColor color;
	
	protected String text;
	
	public int getSuitValue() {
		return this.ordinal();
	}
	
	public String getText() {
		return text;
	}
}
