package com.guanmu.model.card;

import com.guanmu.model.suit.Suit;

/**
 * ÆË¿ËÅÆ½Ó¿Ú
 * @author wangquan
 *
 */
public interface ICard {
	
	public int getId();
	
	public int getValue();
	
	public Suit getSuit();
	
	public String getText();
	
}
