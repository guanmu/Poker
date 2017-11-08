package test.com.guanmu;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

import junit.framework.Assert;

import org.junit.Test;

import com.guanmu.exceptin.IllegalValueCardException;
import com.guanmu.model.card.ICard;
import com.guanmu.utils.CardUtils;

public class TestCreatePackCard {

	@Test
	public void testCreateOnePackCard() throws IllegalValueCardException {
		List<ICard> cards = CardUtils.createOnePackCard(1);
		Assert.assertEquals(54, cards.size());
		
		Set<String> cardTexts = new HashSet<>();
		for(ICard card : cards) {
			String cardText = card.getText();
			System.out.println(cardText);
			
			cardTexts.add(cardText);
		}
		Assert.assertEquals(54, cardTexts.size());
			
	}


	@Test
	public void testCreateTwoPackCard() throws IllegalValueCardException {
		List<ICard> cards = CardUtils.createPackCards(2);
		Assert.assertEquals(54*2, cards.size());
		
		Set<Integer> cardIds = new HashSet<>();
		Set<String> cardTexts = new HashSet<>();
		for(ICard card : cards) {
			String cardText = card.getText();
			int id = card.getId();
			System.out.println(cardText + "-" + id);
			
			cardTexts.add(cardText);
			cardIds.add(id);
		}
		Assert.assertEquals(54, cardTexts.size());
		Assert.assertEquals(108, cardIds.size());	
	}	
}
