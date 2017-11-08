package com.guanmu.model.suit;

import com.guanmu.resouses.Message;

/**
 * ��ɫ������
 * @author wangquan
 *
 */
public enum Suit {
	
	Clubs(SuitColor.BlackSuit,Message.getString("Clubs.name")),			// ÷��
	Diamonds(SuitColor.RedSuit,Message.getString("Diamonds.name")),		// ����
	Hearts(SuitColor.RedSuit,Message.getString("Hearts.name")),			// ����
	Spades(SuitColor.BlackSuit,Message.getString("Spades.name"));		// ����
	
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
