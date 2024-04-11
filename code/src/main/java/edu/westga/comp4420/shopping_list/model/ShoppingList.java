package edu.westga.comp4420.shopping_list.model;

import java.util.HashMap;
import java.util.Map;


/** A representation of a shopping list.
 *
 * @author Justin Smith
 * @version Spring 2024
 */
public class ShoppingList {
	private Map<String, Item> sList;
	
	private static final String ITEM_NAME_ALREADY_EXISTS = "There is already an item in your list by that name. Please enter a name of a new item.";
	private static final String EMPTY_NAME = "The item name can't be blank. Please provide a valid item name.";
	private static final String NAME_NOT_FOUND = "We couldn't find an Item with that name, please privide a valid item name.";
	
	/** Constructor method to instantiate the map of items
	 * 
	 * @preconditions none
	 * @postconditions none
	 */
	public ShoppingList() {
		this.sList = new HashMap<String, Item>();
	}
	
	/** Returns a Item object with the name provided if it exists in the sList.
	 * 
	 * @param name   the name of the item to return.
	 * 
	 * @return An Item object with the name provided if it exists in the sList
	 * 		   or null if the name was not found.
	 */
	public Item getItemByName(String name) {
		return this.sList.get(name);
	}
	
	/** Adds a new Item to sList.
	 *
	 * @precondition name != null || ""
	 *				 !sList.containsKey(name)
	 *
	 * @postcondition sList.size() = @pre sList.size() + 1
	 *
	 * @param name      the name of the new Item to add.
	 */
	public void addItem(String name) {
		Item item;
		if (this.sList.containsKey(name)) {
			throw new IllegalArgumentException(ShoppingList.ITEM_NAME_ALREADY_EXISTS);
		}
		try {
			item = new Item(name);
		} catch (IllegalArgumentException e) {
			throw e;
		}
		this.sList.put(name, item);
	}
	
	/** Removes the item with the name provided.
	 * 
	 * @preconditions name != null || ""  
	 * 				  sList.containsKey(name)
	 * 
	 * @postcondition sList.size() = @pre sList.size() - 1
	 * 
	 * @param name   the name of the item to be removed.
	 */
	public void removeItem(String name) {
		if (name == null || name.isEmpty()) {
			throw new IllegalArgumentException(ShoppingList.EMPTY_NAME);
		}
		if (!this.sList.containsKey(name)) {
			throw new IllegalArgumentException(ShoppingList.NAME_NOT_FOUND);
		} else {
			this.sList.remove(name);
		}
	}
	
	/** Updates the quantity for the Item with the name provided to the quantity provided.
	 * 
	 * @precondition sList.containsKey(name)
	 * 				 newQuantity >= 0
	 * 
	 * @postcondition sList.get(name).getQuantity() = newQuantity
	 *
	 * @param name               the name of the Item to update the quantity for.
	 * @param newQuantity        the new quantity to set for the Item with the name provided.
	 */
	public void updateQuantity(String name, int newQuantity) {
		if (!this.sList.containsKey(name)) {
			throw new IllegalArgumentException(ShoppingList.NAME_NOT_FOUND);
		}
		try {
			this.sList.get(name).setQuantity(newQuantity);
		} catch (IllegalArgumentException e) {
			throw e;
		}
	}
}