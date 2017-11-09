package com.guanmu.model.card;

import com.guanmu.model.suit.Suit;
import com.guanmu.resouses.Message;

/**
 * ´óÍõÀà
 * @author wangquan
 *
 */
public class BigJokerCard extends JokerCard {

	public BigJokerCard(int id) {
		this.id = id;
	}

	@Override
	public Suit getSuit() {
		return Suit.Hearts;
	}

	@Override
	public String getText() {
		return Message.getString("BigJokerCard.text");
	}

}
