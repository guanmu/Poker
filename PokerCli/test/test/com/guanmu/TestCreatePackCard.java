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
		List<ICard> cards = CardUtils.createOnePackCard();
		Assert.assertEquals(54, cards.size());
		
		Set<String> cardTexts = new HashSet<>();
		for(ICard card : cards) {
			String cardText = card.getText();
			System.out.println(cardText);
			
			cardTexts.add(cardText);
		}
		Assert.assertEquals(54, cardTexts.size());
		
		
	}
	
}
