package edu.westga.comp4420.shopping_list.test.model.shoppinglist;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import edu.westga.comp4420.shopping_list.model.ShoppingList;

public class TestAddItem {
	ShoppingList sList;
	String itemName = "Test";
	
	@BeforeEach
	public void setUpPerTest() {
		sList = new ShoppingList();
	}
	
	@Test
	public void testNullName() {
		assertThrows(IllegalArgumentException.class,
			()->{
				sList.addItem(null);
			}
		);
	}
	
	@Test
	public void testEmptyName() {
		assertThrows(IllegalArgumentException.class,
			()->{
				sList.addItem("");
			}
		);
	}
	
	@Test
	public void testValidName() {
		sList.addItem(itemName);
		
		assertNotNull(sList.getItemByName(itemName), "Confirms that there is an Item by the correct name in sList.");
	}
	
	@Test
	public void testNameAlreadyExitst() {
		sList.addItem(itemName);
		
		assertThrows(IllegalArgumentException.class,
			()->{
				sList.addItem(itemName);
			}
		);
	}
}