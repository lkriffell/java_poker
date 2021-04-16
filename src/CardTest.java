import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class CardTest {
	
	@Test
	void test() {
		Card card = new Card("King", "Hearts", 13);
		assertEquals("King", card.rank);
		assertEquals("Hearts", card.suit);
		assertEquals(13, card.value);
	}

}
