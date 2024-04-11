package edu.westga.comp4420.shopping_list.test.model.shoppinglist;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

import edu.westga.comp4420.shopping_list.model.ShoppingList;

public class TestGetItemByName {
	ShoppingList sList;
	
	@BeforeAll
	static void setUp() {
		sList = new ShoppingList();
		sList.addItem("Test Name");
	}
	
	@Test
	public void testNameNotFound() {
		assertEquals(null, sList.getItemByName(""), "Checking that providing a name that doesn't exist returns null.");
	}
	
	@Test
	public void testValidName() {
		Item item = sList.getItemByName("Test Name");
		
		assertEquals("Test Name", item.getName();, "Checking that the item name of the item returned is the same as the name provided");
	}
}