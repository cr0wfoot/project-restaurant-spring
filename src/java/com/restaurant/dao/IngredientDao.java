package com.restaurant.dao;

import com.restaurant.model.Ingredient;
import com.restaurant.model.search.criteria.IngredientSearchCriteria;
import java.util.List;

/**
 * Contains methods to work with entity Ingredient
 * @see Ingredient
 */
public interface IngredientDao {
    
    /**
     * Save the object of class Ingredient
     * @param ingredient object of class Ingredient
     */
    void insert(Ingredient ingredient);
    
    /**
     * Get the object of class Ingredient by id
     * @param id the int value of id
     * @return object of class Ingredient 
     */
    Ingredient select(Integer id);
    
    /**
     * Get all objects of class Ingredient
     * @return the list of objects
     */
    List<Ingredient> selectAll();
    
    /**
     * Update the object of class Ingredient
     * @param ingredient object of class Ingredient
     */
    void update(Ingredient order);
    
    /**
     * Delete the object of class Ingredient by it's id
     * @param id the int value of id
     */
    void delete(Integer id);
    
    /**
     * Get all objects of class Ingredient according to criteria
     * @param criteria ingredient search criteria
     * @return the list of objects 
     * @see IngredientSearchCriteria
     */
    List<Ingredient> findByCriteria(IngredientSearchCriteria criteria);
    
}
