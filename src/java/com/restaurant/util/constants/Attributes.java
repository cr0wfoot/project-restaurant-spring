package com.restaurant.util.constants;

/**
 * Storage of attributes' names
 */
public interface Attributes {
    
    /**
     * Attribute for access level of user, with object of class Access
     * @see User
     * @see User.Access
     */
    String ACCESS = "access";
    
    /**
     * Attribute for object of class User
     * @see User
     */
    String USER = "user";
    
    /**
     * Attribute for list of objects of class User
     * @see User
     */
    String USERS = "users";
    
    /**
     * Attribute object of class Order
     * @see Order
     */
    String ORDER = "order";
    
    /**
     * Attribute for list of objects of class Order
     * @see Order
     */
    String ORDERS = "orders";
    
    /**
     * Attribute for list of objects of class Bill
     * @see Bill
     */
    String BILL = "bill";
    
    /**
     * Attribute for list of objects of class Bill
     * @see Bill
     */
    String BILLS = "bills";
    
    /**
     * Attribute for list of objects of class Ingredient
     * @see Ingredient
     */
    String INGREDIENTS = "ingredients";
    
    /**
     * Attribute for user's id, with int value
     * @see User
     */
    String ID_USER = "idUser";
    
    /**
     * Attribute for error message
     */
    String MESSAGE = "message";
    
}
