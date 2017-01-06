package com.restaurant.dao;

import com.restaurant.model.Bill;
import com.restaurant.model.search.criteria.BillSearchCriteria;
import java.util.List;

/**
 * Contains methods to work with entity Bill
 * @see Bill
 */
public interface BillDao {
    
    /**
     * Save the object of class Bill
     * @param bill object of class Bill
     */
    void insert(Bill bill);
    
    /**
     * Get the object of class Bill by id
     * @param id the int value of id
     * @return object of class Bill 
     */
    Bill select(Integer id);
    
    /**
     * Get all objects of class Bill
     * @return the list of objects
     */
    List<Bill> selectAll();
    
    /**
     * Update the object of class Bill
     * @param bill object of class Bill
     */
    void update(Bill bill);
    
    /**
     * Delete the object of class Bill by it's id
     * @param id the int value of id
     */
    void delete(Integer id);
    
    /**
     * Get all objects of class Bill according to criteria
     * @param criteria bill search criteria
     * @return the list of objects 
     * @see BillSearchCriteria
     */
    List<Bill> findByCriteria(BillSearchCriteria criteria);
    
}
