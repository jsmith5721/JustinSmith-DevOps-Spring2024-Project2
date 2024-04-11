package edu.westga.comp4420.shopping_list.test.model.item;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

import edu.westga.comp4420.shopping_list.model.Item;

public class TestGetName {
	
	@Test
	public void testGetName() {
		Item newItem = new Item("Test");
		
		assertEquals("Test", newItem.getName(),"Checking valid name for item");
	}
	
}