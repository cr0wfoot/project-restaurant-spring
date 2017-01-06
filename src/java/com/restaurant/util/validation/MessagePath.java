package com.restaurant.util.validation;

/**
 * Strorage of path to properties with error messages
 */
public interface MessagePath {
    
    /**
     * Path for propertie: if field "login" is empty
     */
    String LOGIN_EMPTY = "validation.login.empty";
    
    /**
     * Path for propertie: if field "login" is not valid by pattern
     */
    String LOGIN_INVALID = "validation.login.invalid";
    
    /**
     * Path for propertie: if login exists in db
     */
    String LOGIN_INCORRECT = "validation.login.incorrect";
    
    /**
     * Path for propertie: if login is already exists in db
     */
    String LOGIN_EXISTS = "validation.login.exists";
    
    /**
     * Path for propertie: if field "password" is empty
     */
    String PASSWORD_EMPTY = "validation.password.empty";
    
    /**
     * Path for propertie: if field "password" is not valid by pattern
     */
    String PASSWORD_INVALID = "validation.password.invalid";
    
    /**
     * Path for propertie if password is correct
     */
    String PASSWORD_INCORRECT = "validation.password.incorrect";
    
    /**
     * Path for propertie: if field "name" is empty
     */
    String NAME_EMPTY = "validation.name.empty";
    
    /**
     * Path for propertie: if field "name" is not valid by pattern
     */
    String NAME_INVALID = "validation.name.invalid";
    
}
