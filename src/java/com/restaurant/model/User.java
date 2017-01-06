package com.restaurant.model;

/**
 * Describes entity User
 * @see Access
 */
public class User {
    
    /**
     * The value of user's ID
     */
    private Integer id;
    
    /**
     * The value of user's login
     */
    private String login;
    
    /**
     * The value of user's password
     */
    private String password;
    
    /**
     * The value of user's name
     */
    private String name;
    
    /**
     * The value of user's access level
     */
    private Access access;

    /**
     * An empty constructor
     */
    public User() {
        
    }
    
    /**
     * Constructor with five arguments initialize fields 
     * {@link User#id}, {@link User#login}, {@link User#password},
     * {@link User#name}, {@link User#access}
     * 
     * @param id    the value of user's ID
     * @param login    the value of user's login
     * @param password    the value of user's password
     * @param name    the value of user's name
     * @param access    the value of user's access level
     */
    public User(Integer id, String login, String password, String name, Access access) {
        this.id       = id;
        this.login    = login;
        this.password = password;
        this.name     = name;
        this.access   = access;
    }
    
    /**
     * User's access type
     */
    public enum Access {
        
        /**
         * Admin privilege
         */
        ADMIN,
        
        /**
         * User privilege
         */
        USER,
        
    }
    
    /**
     * Get the value of user's ID
     * @return the value of {@link User#id}
     */
    public Integer getId() {
        return id;
    }

    /**
     * Set the value of {@link User#id}
     * @param id
     * the value of users's ID
     */
    public void setId(Integer id) {
        this.id = id;
    }
    
    /**
     * Get the value of user's access level
     * @return the value of {@link User#access}
     */
    public Access getAccess() {
        return access;
    }

    /**
     * Set the value of {@link User#access}
     * @param access
     * the value of users's access
     */
    public void setAccess(Access access) {
        this.access = access;
    }

    /**
     * Get the value of user's login
     * @return the value of {@link User#login}
     */
    public String getLogin() {
        return login;
    }

    /**
     * Set the value of {@link User#login}
     * @param login
     * the value of user's login
     */
    public void setLogin(String login) {
        this.login = login;
    }

    /**
     * Get the value of user's name
     * @return the value of {@link User#name}
     */
    public String getName() {
        return name;
    }

    /**
     * Set the value of {@link User#name}
     * @param name
     * the value of users's name
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * Get the value of user's password
     * @return the value of {@link User#password}
     */
    public String getPassword() {
        return password;
    }

    /**
     * Set the value of {@link User#password}
     * @param password
     * the value of users's password
     */
    public void setPassword(String password) {
        this.password = password;
    }
    
    @Override
    public boolean equals(Object obj) {
	if (  this           == obj             ) return true;
	if (  obj            == null            ) return false;
	if (  getClass()     != obj.getClass()  ) return false;
	if (  ((User)obj).id != id              ) return false;
        return true;
    }
    
    @Override
    public int hashCode() {
        int hash = 5;
        hash = 89 * hash + this.id;
        return hash;
    }
    
    @Override 
    public String toString() {
        return "ID="          + id       + " | Login=" + login + 
               " | Password=" + password + " | Name="  + name  + 
               " | Access="   + access.name().toLowerCase();
    }
            
}
