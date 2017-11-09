package com.guanmu.model.card;

import com.guanmu.config.CardConfig;
import com.guanmu.exceptin.IllegalValueCardException;
import com.guanmu.model.suit.Suit;

/**
 * 普通卡牌类，非王牌
 * @author wangquan
 *
 */
public class NumberCard extends AbstractCard {

	protected Suit suit;
	
	protected String text;
	
	public NumberCard() {

	}

	public NumberCard(int id,int value, Suit suit) throws IllegalValueCardException {
		this.id = id;
		this.value = value;
		this.suit = suit;
		
		initCardText();
	}
	
	private void initCardText() throws IllegalValueCardException {
		
		if (value > CardConfig.CARD_NUMBER_TEXTS.length) {
			throw new IllegalValueCardException(value);
		}
		
		text = suit.getText() + CardConfig.CARD_TEXT_SPLIT + CardConfig.CARD_NUMBER_TEXTS[value -1];
	}

	@Override
	public Suit getSuit() {
		return suit;
	}

	public void setSuit(Suit suit) {
		this.suit = suit;
	}

	@Override
	public String getText() {
		return text;
	}

	

}
