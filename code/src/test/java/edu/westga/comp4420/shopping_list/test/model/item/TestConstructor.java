package edu.westga.comp4420.shopping_list.test.model.item;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

import edu.westga.comp4420.shopping_list.model.Item;

public class TestConstructor {
	
	@Test
	public void testNullName() {
		assertThrows(IllegalArgumentException.class,
			()->{
				Item newItem = new Item(null);
			}
		);
	}
	
	@Test
	public void testBlankName() {
		assertThrows(IllegalArgumentException.class,
			()->{
				Item newItem = new Item("");
			}
		);
	}
	
	@Test
	public void testValidItem() {
		Item newItem = new Item("Test");
		
		assertEquals("Test", newItem.getName(),"Checking valid name for item");
		assertEquals(0, newItem.getQuantity(),"Checking quantity is initially set to 0.");
	}
}
