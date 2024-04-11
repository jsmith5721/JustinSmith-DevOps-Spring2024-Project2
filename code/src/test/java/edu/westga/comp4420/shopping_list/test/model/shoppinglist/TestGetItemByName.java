package edu.westga.comp4420.shopping_list.test.model.shoppinglist;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import edu.westga.comp4420.shopping_list.model.ShoppingList;
import edu.westga.comp4420.shopping_list.model.Item;

public class TestGetItemByName {
	static ShoppingList sList;
	static String itemName = "Test";
	
	@BeforeAll
	static void setUp() {
		sList = new ShoppingList();
		sList.addItem(itemName);
	}
	
	@Test
	public void testNameNotFound() {
		assertEquals(null, sList.getItemByName(""), "Checking that providing a name that doesn't exist returns null.");
	}
	
	@Test
	public void testValidName() {
		Item item = sList.getItemByName(itemName);
		
		assertEquals(itemName, item.getName(), "Checking that the item name of the item returned is the same as the name provided");
	}
}