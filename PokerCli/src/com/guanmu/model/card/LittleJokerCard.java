package com.guanmu.model.card;

import com.guanmu.model.suit.Suit;
import com.guanmu.resouses.Message;

public class LittleJokerCard extends JokerCard {

	public LittleJokerCard(int id) {
		this.id = id;
	}

	@Override
	public Suit getSuit() {
		return Suit.Clubs;
	}

	@Override
	public String getText() {
		return Message.getString("LittleJokerCard.text");
	}

}
