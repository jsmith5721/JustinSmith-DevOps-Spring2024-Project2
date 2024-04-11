package edu.westga.comp4420.shopping_list.test.model.shoppinglist;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

import edu.westga.comp4420.shopping_list.model.ShoppingList;

public class TestAddItem {
	ShoppingList sList;
	
	@BeforeEach
	static void setUp() {
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
		sList.addItem("Test");
		
		assertEquals(1, sList.size(), "Confirms that the size of sList increased.");
	}
	
	@Test
	public void testNameAlreadyExitst() {
		sList.addItem("Test");
		
		assertThrows(IllegalArgumentException.class,
			()->{
				sList.addItem("Test");
			}
		);
	}
}