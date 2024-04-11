package edu.westga.comp4420.shopping_list.test.model.item;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

import edu.westga.comp4420.shopping_list.model.Item;

public class TestGetQuantity {
	
	@Test
	public void testGetQuantity() {
		Item newItem = new Item("Test");
		
		assertEquals(0, newItem.getQuantity(),"Checking quantity is initially set to 0.");
	}
	
}