package com.restaurant.util.constants;

/**
 * Storage of parameters' names
 */
public interface Params {
    
    /**
     * Parameter for id of any object, with int value
     */
    String ID = "id";
    
    /**
     * Parameter of field with user's login, with String value
     * @see User
     */
    String LOGIN = "login";
    
    /**
     * Parameter of field with user's name, with String value
     * @see User
     */
    String NAME = "name";
    
    /**
     * Parameter of field with user's password, with String value
     * @see User
     */
    String PASSWORD    = "password";
    
    /**
     * Parameter for multiple values of id belongs to objects of class Ingredient
     * @see Ingredient
     */
    String INGREDIENTS = "ingredients";
    
    /**
     * Parameter for user's access level
     * @see User
     */
    String ACCESS      = "access";
    
}
