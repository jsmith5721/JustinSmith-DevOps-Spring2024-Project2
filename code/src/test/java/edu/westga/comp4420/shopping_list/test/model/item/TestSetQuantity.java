package edu.westga.comp4420.shopping_list.test.model.item;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

import edu.westga.comp4420.shopping_list.model.Item;

public class TestSetQuantity {
	
	@Test
	public void testNegativeValue() {
		Item newItem = new Item("Test");
		assertThrows(IllegalArgumentException.class,
			()->{
				newItem.setQuantity(-1);
			}
		);
	}
	
	@Test
	public void testValidValue() {
		Item newItem = new Item("Test");
		newItem.setQuantity(1);
		
		assertEquals(1, newItem.getQuantity(),"Checking quantity was updated to 1.");
	}
}