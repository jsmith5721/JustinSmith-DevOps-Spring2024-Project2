package edu.westga.comp4420.shopping_list.test.model.shoppinglist;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import edu.westga.comp4420.shopping_list.model.ShoppingList;

public class TestRemoveItem {
	ShoppingList sList;
	String itemName = "Test";
	
	@BeforeEach
	public void setUpPerTest() {
		sList = new ShoppingList();
		sList.addItem(itemName);
	}

	@Test
	public void testNullName() {
		assertThrows(IllegalArgumentException.class,
			()->{
				sList.removeItem(null);
			}
		);
	}
	
	@Test
	public void testBlankName() {
		assertThrows(IllegalArgumentException.class,
			()->{
				sList.removeItem("");
			}
		);
	}
	
	@Test
	public void testNameNotFound() {
		assertThrows(IllegalArgumentException.class,
			()->{
				sList.removeItem("Apple");
			}
		);
	}
	
	@Test
	public void testValidName() {
		sList.removeItem(itemName);
		
		assertEquals(null, sList.getItemByName(itemName), "Confirms that the item no longer can be found in sList.");
	}
}