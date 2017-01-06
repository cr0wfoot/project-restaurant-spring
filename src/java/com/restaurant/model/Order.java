package com.restaurant.model;

import java.util.Date;
import java.util.LinkedList;
import java.util.List;

/**
 * Describes entity Order
 * @see Ingredient
 */
public class Order {
    
    /**
     * The value of order's ID
     */
    private Integer id;
    
    /**
     * The value of order's release time
     */
    private Date time;
    
    /**
     * The value of user's ID, order belongs to
     */
    private Integer userId;
    
    /**
     * The list of ingredients
     */
    private List<Ingredient> ingredients = new LinkedList<Ingredient>();

    /**
     * An empty constructor
     */
    public Order() {
        
    }
    
    /**
     * Constructor with three arguments initialize fields 
     * {@link Order#id}, {@link Order#userId}, {@link Order#time}
     * 
     * @param id    the value of order's ID
     * @param userId    the value of user's ID
     * @param time    the value of order's release time
     */
    public Order(Integer id, Date time, Integer userId) {
        this.id     = id;
        this.time   = time;
        this.userId = userId;
    }

    /**
     * Get the value of order's ID
     * @return the value of {@link Order#id}
     */
    public Integer getId() {
        return id;
    }

    /**
     * Set the value of {@link Order#id}
     * @param id
     * the value of order's ID
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * Get the value of order's release time
     * @return the value of {@link Order#time}
     */
    public Date getTime() {
        return time;
    }

    /**
     * Set the value of {@link Order#time}
     * @param time
     * the value of order's time release
     */
    public void setTime(Date time) {
        this.time = time;
    }

    /**
     * Get the value of user's ID
     * @return the value of {@link Order#userId}
     */
    public Integer getUserId() {
        return userId;
    }

    /**
     * Set the value of {@link Order#userId}
     * @param userId
     * the value of user's ID
     */
    public void setUserId(Integer userId) {
        this.userId = userId;
    }
    
    /**
     * Get the list of ingredients
     * @return the value of {@link Order#ingredients}
     */
    public List<Ingredient> getIngredients() {
        return ingredients;
    }
    
    /**
     * Set the value of {@link Order#ingredients}
     * @param ingredients
     * the list of ingredients
     */
    public void setIngredients(List<Ingredient> ingredients) {
        this.ingredients = ingredients;
    }
    
    /**
     * Add new ingredient to list {@link Order#ingredients}
     * @param ingredient
     * an object of class Ingredient
     */
    public void addIngredient(Ingredient ingredient) {
        ingredients.add(ingredient);
    }
    
    @Override
    public boolean equals(Object obj) {
	if (  this            == obj             ) return true;
	if (  obj             == null            ) return false;
	if (  getClass()      != obj.getClass()  ) return false;
	if (  ((Order)obj).id != id              ) return false;
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
        String result = "ID="      + id   + " | UserID=" + userId + 
                        " | Time=" + time + " | Ingredients: {\n";
        for(Ingredient i : ingredients)
            result += "\t" + i + System.lineSeparator();
        return result + "}";
    }
    
}
