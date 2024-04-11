package edu.westga.comp4420.shopping_list.test.model.shoppinglist;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import edu.westga.comp4420.shopping_list.model.ShoppingList;

public class TestUpdateQuantity {
	ShoppingList sList;
	String validName = "Test";
	String invalidName = "Apple";
	int validQuantity = 1;
	int invalidQuantity = -1;
	
	@BeforeEach
	public void setUpPerTest() {
		sList = new ShoppingList();
		sList.addItem(validName);
	}
	
	@Test
	public void testNameNotFound() {
		assertThrows(IllegalArgumentException.class,
			()->{
				sList.updateQuantity(invalidName, validQuantity);
			}
		);
	}
	
	@Test
	public void testQuantityLessThanZero() {
		assertThrows(IllegalArgumentException.class,
			()->{
				sList.updateQuantity(validName, invalidQuantity);
			}
		);
	}
	
	@Test
	public void testValidUpdate() {
		sList.updateQuantity(validName, validQuantity);
		
		assertEquals(validQuantity, sList.getItemByName(validName).getQuantity(), "Confirms the item with the name validName was updated to the quantity given.");
	}
}
