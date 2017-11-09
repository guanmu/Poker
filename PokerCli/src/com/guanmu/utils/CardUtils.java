package com.guanmu.utils;

import java.util.LinkedList;
import java.util.List;
import java.util.Random;
import java.util.concurrent.CopyOnWriteArrayList;

import com.guanmu.config.CardConfig;
import com.guanmu.exceptin.IllegalValueCardException;
import com.guanmu.model.card.BigJokerCard;
import com.guanmu.model.card.ICard;
import com.guanmu.model.card.LittleJokerCard;
import com.guanmu.model.card.NumberCard;
import com.guanmu.model.suit.Suit;

/**
 * 卡牌工具类
 * @author wangquan
 *
 */
public class CardUtils {
	
	
	/**
	 * 生成一副标准卡牌
	 * @param startId	卡牌的起始id
	 * @return
	 * @throws IllegalValueCardException
	 */
	public static List<ICard> createOnePackCard(int startId) throws IllegalValueCardException {
		
		List<ICard> numberCards = createOnePackCardNoJoker(startId);
		
		
		numberCards.add(new LittleJokerCard(startId + CardConfig.PACK_NUMBER_CARD_NUMBER));
		numberCards.add(new BigJokerCard(startId + CardConfig.PACK_NUMBER_CARD_NUMBER + 1));
		
		return numberCards;
	}
	
	/**
	 * 生成一副没有王牌的普通卡牌
	 * @param startId 卡牌的起始id
	 * @return
	 * @throws IllegalValueCardException
	 */
	private static List<ICard> createOnePackCardNoJoker(int startId) throws IllegalValueCardException {
		
		List<ICard> numberCards = new CopyOnWriteArrayList<ICard>();
		
		for(int v = 1;v <= CardConfig.MAX_NUMBER_CARD_VALUE;v++) {
			for(Suit suit : Suit.values()) {
				NumberCard numberCard = new NumberCard(startId,v,suit);
				numberCards.add(numberCard);
				startId++;
			}
		}
		
		return numberCards;
	};
	
	/**
	 * 生成多副id不通的卡牌
	 * @param packNumber
	 * @return
	 * @throws IllegalValueCardException
	 */
	public static List<ICard> createPackCards(int packNumber) throws IllegalValueCardException {
		
		List<ICard> cards = new CopyOnWriteArrayList<>();
		
		int id = 1;
		for(int i = 1;i <= packNumber;i ++) {
			List<ICard> tmp = createOnePackCard(id);
			cards.addAll(tmp);
			
			id += tmp.size();
		}
		
		
		return cards;
	}
	
	/**
	 * 随机打乱卡牌组的卡牌
	 * @param cards
	 */
	public static void randomCards(List<ICard> cards) {
		
		List<ICard> source = new LinkedList<>(cards);
		List<ICard> copy = new CopyOnWriteArrayList<>();
		
		while(source.size() > 0) {
			
			int index = new Random().nextInt(source.size());
			
			ICard card = source.get(index);
			copy.add(card);
			source.remove(index);
		}
		
		cards.clear();
		cards.addAll(copy);
	}
}
