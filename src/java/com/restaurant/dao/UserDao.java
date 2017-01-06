package com.restaurant.dao;

import com.restaurant.model.User;
import com.restaurant.model.search.criteria.UserSearchCriteria;
import java.util.List;

/**
 * Contains methods to work with entity User
 * @see User
 */
public interface UserDao {
    
    /**
     * Save the object of class User
     * @param user object of class User
     */
    void insert(User user);
    
    /**
     * Get the object of class User by id
     * @param id the int value of id
     * @return object of class User 
     */
    User select(Integer id);
    
    /**
     * Get all objects of class User
     * @return the list of objects
     */
    List<User> selectAll();
    
    /**
     * Update the object of class User
     * @param user object of class User
     */
    void update(User user);
    
    /**
     * Delete the object of class User by it's id
     * @param id the int value of id
     */
    void delete(Integer id);
    
    /**
     * Get all objects of class User according to criteria
     * @param criteria user search criteria
     * @return the list of objects 
     * @see UserSearchCriteria
     */
    List<User> findByCriteria(UserSearchCriteria criteria);
    
}
