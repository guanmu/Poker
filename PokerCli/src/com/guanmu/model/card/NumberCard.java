package com.guanmu.model.card;

import com.guanmu.config.Config;
import com.guanmu.exceptin.IllegalValueCardException;
import com.guanmu.model.suit.Suit;

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
		
		if (value > Config.CARD_NUMBER_TEXTS.length) {
			throw new IllegalValueCardException(value);
		}
		
		text = suit.getText() + Config.CARD_TEXT_SPLIT + Config.CARD_NUMBER_TEXTS[value -1];
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
