package com.restaurant.model.search.criteria;

import com.restaurant.model.User;

/**
 * Serach criteria of entity User for db
 * @see User
 */
public class UserSearchCriteria {
    
    /**
     * The value of access
     */
    private String access;
    
    /**
     * The value of login
     */
    private String login;
    
    /**
     * The value of name
     */
    private String name;

    /**
     * Get the value of access
     * @return the value of {@link UserSearchCriteria#access}
     */
    public String getAccess() {
        return access;
    }

    /**
     * Set the value of {@link UserSearchCriteria#access}
     * @param access
     * the value of users's access
     */
    public void setAccess(String access) {
        this.access = access;
    }

    /**
     * Get the value of login
     * @return the value of {@link UserSearchCriteria#login}
     */
    public String getLogin() {
        return login;
    }

    /**
     * Set the value of {@link UserSearchCriteria#login}
     * @param login
     * the value of users's login
     */
    public void setLogin(String login) {
        this.login = login;
    }

    /**
     * Get the value of name
     * @return the value of {@link UserSearchCriteria#name}
     */
    public String getName() {
        return name;
    }

    /**
     * Set the value of {@link UserSearchCriteria#name}
     * @param name
     * the value of users's name
     */
    public void setName(String name) {
        this.name = name;
    }
    
    /**
     * Check if search criteria is empty
     * @return boolean value: true - if every field is empty
     */
    public boolean isEmpty() {
        return name == null && access == null && login == null;
    }
    
    /**
     * Check if object of class User fulfils criteria
     * @param user
     * an object of class User
     * @return 
     * boolean value: true - if object fulfils criteria
     */
    public boolean accept(User user) {
        return acceptLogin(  user.getLogin()                       )
            && acceptAccess( user.getAccess().name().toLowerCase() )
            && acceptName(   user.getName()                        );
    }
    
    /**
     * Check if name of object equals name criteria
     * @param name
     * field "name" of class User
     * @return 
     * boolean value: true - if accepted
     */
    private boolean acceptName(String name) {
        return this.name == null || this.name.equals(name);
    }
    
    /**
     * Check if login of object equals login criteria
     * @param name
     * field "login" of class User
     * @return 
     * boolean value: true - if accepted
     */
    private boolean acceptLogin(String login) {
        return this.login == null || this.login.equals(login);
    }
    
    /**
     * Check if access of object equals access criteria
     * @param access
     * field "access" of class User
     * @return 
     * boolean value: true - if accepted
     */
    private boolean acceptAccess(String access) {
        return this.access == null || this.access.equals(access);
    }
    
}
