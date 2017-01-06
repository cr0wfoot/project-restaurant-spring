package com.restaurant.model.search.criteria;

import com.restaurant.model.Ingredient;

/**
 * Serach criteria of entity Ingredient for db
 * @see Ingredient
 */
public class IngredientSearchCriteria {
    
    /**
     * The value of name
     */
    private String name;
    
    /**
     * The value of consist
     */
    private String consist;
    
    /**
     * Max value of weight
     */
    private Integer maxWeight;
    
    /**
     * Min value of weight
     */
    private Integer minWeight;
    
    /**
     * Max value of calorie
     */
    private Integer maxCalorie;
    
    /**
     * Min value of calorie
     */
    private Integer minCalorie;
    
    /**
     * Max value of price
     */
    private Double maxPrice;
    
    /**
     * Min value of price
     */
    private Double minPrice;

    /**
     * Get the value of consist
     * @return the value of {@link IngredientSearchCriteria#consist}
     */
    public String getConsist() {
        return consist;
    }

    /**
     * Set the value of {@link IngredientSearchCriteria#consist}
     * @param consist
     * the value of ingredient's consist
     */
    public void setConsist(String consist) {
        this.consist = consist;
    }

    /**
     * Get the value max calorie
     * @return the value of {@link IngredientSearchCriteria#maxCalorie}
     */
    public Integer getMaxCalorie() {
        return maxCalorie;
    }

    /**
     * Set the value of {@link IngredientSearchCriteria#maxCalorie}
     * @param maxCalorie
     * the value of ingredient's max calorie
     */
    public void setMaxCalorie(Integer maxCalorie) {
        this.maxCalorie = maxCalorie;
    }

    /**
     * Get the value max price
     * @return the value of {@link IngredientSearchCriteria#maxPrice}
     */
    public Double getMaxPrice() {
        return maxPrice;
    }

    /**
     * Set the value of {@link IngredientSearchCriteria#maxPrice}
     * @param maxPrice
     * the value of ingredient's max price
     */
    public void setMaxPrice(Double maxPrice) {
        this.maxPrice = maxPrice;
    }

    /**
     * Get the value of max weight
     * @return the value of {@link IngredientSearchCriteria#maxWeight}
     */
    public Integer getMaxWeight() {
        return maxWeight;
    }

    /**
     * Set the value of {@link IngredientSearchCriteria#maxWeight}
     * @param maxWeight
     * the value of ingredient's max weight
     */
    public void setMaxWeight(Integer maxWeight) {
        this.maxWeight = maxWeight;
    }

    /**
     * Get the value of min calorie
     * @return the value of {@link IngredientSearchCriteria#minCalorie}
     */
    public Integer getMinCalorie() {
        return minCalorie;
    }

    /**
     * Set the value of {@link IngredientSearchCriteria#minCalorie}
     * @param minCalorie
     * the value of ingredient's min calorie
     */
    public void setMinCalorie(Integer minCalorie) {
        this.minCalorie = minCalorie;
    }

    /**
     * Get the value of min price
     * @return the value of {@link IngredientSearchCriteria#minPrice}
     */
    public Double getMinPrice() {
        return minPrice;
    }

    /**
     * Set the value of {@link IngredientSearchCriteria#minPrice}
     * @param minPrice
     * the value of ingredient's min price
     */
    public void setMinPrice(Double minPrice) {
        this.minPrice = minPrice;
    }

    /**
     * Get the value of min weight
     * @return the value of {@link IngredientSearchCriteria#minWeight}
     */
    public Integer getMinWeight() {
        return minWeight;
    }

    /**
     * Set the value of {@link IngredientSearchCriteria#minWeight}
     * @param minWeight
     * the value of ingredient's min weight
     */
    public void setMinWeight(Integer minWeight) {
        this.minWeight = minWeight;
    }

    /**
     * Get the value of name
     * @return the value of {@link IngredientSearchCriteria#name}
     */
    public String getName() {
        return name;
    }

    /**
     * Set the value of {@link IngredientSearchCriteria#name}
     * @param name
     * the value of ingredient's name
     */
    public void setName(String name) {
        this.name = name;
    }
    
    /**
     * Check if search criteria is empty
     * @return boolean value: true - if every field is empty
     */
    public boolean isEmpty() {
        return name == null && consist == null && maxWeight == null
            && minWeight == null && maxCalorie == null && minCalorie == null
            && maxPrice == null && minPrice == null;
    }
    
    /**
     * Check if object of class Ingredient fulfils criteria
     * @param ingredient
     * an object of class Ingredient
     * @return 
     * boolean value: true - if object fulfils criteria
     */
    public boolean accept(Ingredient ingredient) {
        return acceptMinPrice(   ingredient.getPrice()   )
            && acceptMaxPrice(   ingredient.getPrice()   )
            && acceptMaxCalorie( ingredient.getCalorie() )
            && acceptMinCalorie( ingredient.getCalorie() )
            && acceptMaxWeight(  ingredient.getWeight()  )
            && acceptMinWeight(  ingredient.getWeight()  )
            && acceptConsist(    ingredient.getConsist() )
            && acceptName(       ingredient.getName()    );
    }
    
    /**
     * Check if name of object equals info criteria
     * @param info
     * field "name" of class Ingredient
     * @return 
     * boolean value: true - if accepted
     */
    private boolean acceptName(String name) {
        return this.name == null || this.name.equals(name);
    }
    
    /**
     * Check if consist of object equals info criteria
     * @param consist
     * field "consist" of class Ingredient
     * @return 
     * boolean value: true - if accepted
     */
    private boolean acceptConsist(String consist) {
        return this.consist == null || this.consist.equals(consist);
    }
    
    /**
     * Check if weight of object lower than max weight
     * @param weight
     * field "weight" of class Ingredient
     * @return 
     * boolean value: true - if accepted
     */
    private boolean acceptMaxWeight(Integer weight) {
        return this.maxWeight == null || this.maxWeight.equals(weight);
    }
    
    /**
     * Check if weight of object higher than min weight
     * @param weight
     * field "weight" of class Ingredient
     * @return 
     * boolean value: true - if accepted
     */
    private boolean acceptMinWeight(Integer weight) {
        return this.minWeight == null || this.minWeight.equals(weight);
    }
    
    /**
     * Check if calorie of object lower than max calorie
     * @param calorie
     * field "calorie" of class Ingredient
     * @return 
     * boolean value: true - if accepted
     */
    private boolean acceptMaxCalorie(Integer calorie) {
        return this.maxCalorie == null || this.maxCalorie.equals(calorie);
    }
    
    /**
     * Check if calorie of object higher than min calorie
     * @param calorie
     * field "calorie" of class Ingredient
     * @return 
     * boolean value: true - if accepted
     */
    private boolean acceptMinCalorie(Integer calorie) {
        return this.minCalorie == null || this.minCalorie.equals(calorie);
    }
    
    /**
     * Check if price of object lower than max price
     * @param price
     * field "price" of class Ingredient
     * @return 
     * boolean value: true - if accepted
     */
    private boolean acceptMaxPrice(Double price) {
        return this.maxPrice == null || this.maxPrice.equals(price);
    }
    
    /**
     * Check if price of object higher than min price
     * @param price
     * field "price" of class Ingredient
     * @return 
     * boolean value: true - if accepted
     */
    private boolean acceptMinPrice(Double price) {
        return this.minPrice == null || this.minPrice.equals(price);
    }
    
}
