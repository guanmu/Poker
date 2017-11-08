package com.guanmu.utils;

import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

import com.guanmu.config.CardConfig;
import com.guanmu.exceptin.IllegalValueCardException;
import com.guanmu.model.card.BigJokerCard;
import com.guanmu.model.card.ICard;
import com.guanmu.model.card.LittleJokerCard;
import com.guanmu.model.card.NumberCard;
import com.guanmu.model.suit.Suit;

public class CardUtils {
	
	
	/**
	 * 生成一副标准卡牌
	 * @return
	 * @throws IllegalValueCardException 
	 */
	public static List<ICard> createOnePackCard() throws IllegalValueCardException {
		
		List<ICard> numberCards = createOnePackCardNoJoker();
		
		numberCards.add(new LittleJokerCard(53));
		numberCards.add(new BigJokerCard(54));
		
		return numberCards;
	}

	private static List<ICard> createOnePackCardNoJoker() throws IllegalValueCardException {
		
		List<ICard> numberCards = new CopyOnWriteArrayList<ICard>();
		
		int id = 1;
		
		for(int v = 1;v <= CardConfig.MAX_NUMBER_CARD_VALUE;v++) {
			for(Suit suit : Suit.values()) {
				NumberCard numberCard = new NumberCard(id,v,suit);
				numberCards.add(numberCard);
				id++;
			}
		}
		
		return numberCards;
	};
	
	
	
}
