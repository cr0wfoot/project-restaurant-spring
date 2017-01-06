package com.restaurant.util.validation;

/**
 * Storage of regular expressions
 */
public interface Regexp {
    
    /**
     * Regular expression for user's login
     */
    String LOGIN    = "^[a-z0-9_-]{4,10}$";
    
    /**
     * Regular expression for user's password
     */
    String PASSWORD = "^[a-z0-9_-]{4,10}$";
    
    /**
     * Regular expression for user's name
     */
    String NAME     = "^[А-ЯA-ZЁ][а-яёa-z]+$";
    
}
