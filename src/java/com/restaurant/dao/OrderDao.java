package com.restaurant.dao;

import com.restaurant.model.Order;
import com.restaurant.model.search.criteria.OrderSearchCriteria;
import java.util.List;

/**
 * Contains methods to work with entity Order
 * @see Order
 */
public interface OrderDao {
    
    /**
     * Save the object of class Order
     * @param order object of class Order
     */
    void insert(Order order);
    
    /**
     * Get the object of class Order by id
     * @param id the int value of id
     * @return object of class Order 
     */
    Order select(Integer id);
    
    /**
     * Get all objects of class Order
     * @return the list of objects
     */
    List<Order> selectAll();
    
    /**
     * Update the object of class Order
     * @param horse object of class Order
     */
    void update(Order order);
    
    /**
     * Delete the object of class Order by it's id
     * @param id the int value of id
     */
    void delete(Integer id);
    
    /**
     * Get all objects of class Order according to criteria
     * @param criteria order search criteria
     * @return the list of objects 
     * @see OrderSearchCriteria
     */
    List<Order> findByCriteria(OrderSearchCriteria criteria);
    
}
