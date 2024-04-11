package edu.westga.comp4420.shopping_list.model;

/** A representation of an item that can be added to the shopping list.
 *
 * @author Justin Smith
 * @version Spring 2024
 */
public class Item {
	private String name;
	private int quantity;
	
	/**Creates a new Item.
	 * 
	 * @precondition name != null || ""
	 *
	 * @param name     the name to initilize the Item with.
	 */
	public Item(String name) {
		if (name != null && !name.isEmpty()) {
			this.name = name;
		} else {
			throw new IllegalArgumentException("The name provided is invalid. The name must contain at least 1 character.");
		}
		this.quantity = 0;
	}
	
	/** Returns the name of the Item.
	 * 
	 * @return the name of the Item.
	 */
	public String getName() {
		return this.name;
	}
	
	/** Returns the quantity of the Item.
	 * 
	 * @return the quantity of the Item.
	 */
	public int getQuantity() {
		return this.quantity;
	}
	
	/** Sets the quantity to the newQuanitiy provided.
	 * 
	 * @precondition newQuanitiy >= 0
	 *
	 * @param newQuanitiy       the new quantity value to set for this Item.
	 */
	public void setQuantity(int newQuanitiy) {
		if (newQuanitiy >= 0) {
			this.quantity = newQuanitiy;
		} else {
			throw new IllegalArgumentException("The new quantity must be greater than or equal to 0");
		}
	}
}