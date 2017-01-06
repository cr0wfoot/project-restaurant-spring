package com.restaurant.model;

/**
 * Describes entity Ingredient
 */
public class Ingredient {
    
    /**
     * The value of ingredient's ID
     */
    private Integer id;
    
    /**
     * The value of ingredient's name
     */
    private String name;
    
    /**
     * The value of what is ingredient consists of
     */
    private String consist;
    
    /**
     * The value of ingredient's weight (g)
     */
    private Integer weight;
    
    /**
     * The value of ingredient's calories among
     */
    private Integer calorie;
    
    /**
     * The value of ingredient's price
     */
    private Double price;
    
    /**
     * An empty constructor
     */
    public Ingredient() {
        
    }

    /**
     * Constructor with six arguments initialize fields 
     * {@link Ingredient#id}, {@link Ingredient#name}, {@link Ingredient#consist}, 
     * {@link Ingredient#weight}, {@link Ingredient#calorie}, {@link Ingredient#price}
     * 
     * @param id    the value of ingredient's ID
     * @param name    name of ingredient
     * @param consist    what ingredient consist of
     * @param weight    the value of ingredient's weight
     * @param calorie    the value of ingredient's calories
     * @param price    the value of price
     */
    public Ingredient(Integer id, String name, String consist, Integer weight, Integer calorie, Double price) {
        this.id      = id;
        this.name    = name;
        this.consist = consist;
        this.weight  = weight;
        this.calorie = calorie;
        this.price   = price;
    }

    /**
     * Get the value of ingredient's calorie
     * @return the value of {@link Ingredient#calorie}
     */
    public Integer getCalorie() {
        return calorie;
    }

    /**
     * Set the value of {@link Ingredient#calorie}
     * @param calorie
     * the value of ingredient's calorie
     */
    public void setCalorie(Integer calorie) {
        this.calorie = calorie;
    }

    /**
     * Get the value of ingredient's consist
     * @return the value of {@link Ingredient#consist}
     */
    public String getConsist() {
        return consist;
    }

    /**
     * Set the value of {@link Ingredient#consist}
     * @param consist
     * the value of ingredient's consist
     */
    public void setConsist(String consist) {
        this.consist = consist;
    }

    /**
     * Get the value of ingredient's ID
     * @return the value of {@link Ingredient#id}
     */
    public Integer getId() {
        return id;
    }

    /**
     * Set the value of {@link Ingredient#id}
     * @param id
     * the value of ingredient's ID
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * Get the value of ingredient's name
     * @return the value of {@link Ingredient#name}
     */
    public String getName() {
        return name;
    }

    /**
     * Set the value of {@link Ingredient#name}
     * @param name
     * the value of ingredient's name
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * Get the value of ingredient's price
     * @return the value of {@link Ingredient#price}
     */
    public Double getPrice() {
        return price;
    }

    /**
     * Set the value of {@link Ingredient#price}
     * @param price
     * the value of ingredient's price
     */
    public void setPrice(Double price) {
        this.price = price;
    }

    /**
     * Get the value of ingredient's weight
     * @return the value of {@link Ingredient#weight}
     */
    public Integer getWeight() {
        return weight;
    }

    /**
     * Set the value of {@link Ingredient#weight}
     * @param weight
     * the value of ingredient's weight
     */
    public void setWeight(Integer weight) {
        this.weight = weight;
    }
    
    @Override
    public boolean equals(Object obj) {
	if (  this                 == obj             ) return true;
	if (  obj                  == null            ) return false;
	if (  getClass()           != obj.getClass()  ) return false;
	if (  ((Ingredient)obj).id != id              ) return false;
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
        return "ID="         + id      + " | Name="    + name  + 
               " | Calorie=" + calorie + " | Price="   + price + 
               " | Weight="  + weight  + " | Consist=" + consist;
                
    }
    
    /**
     * Get short info for bill
     * @return the String value of {@link Ingredient#name},
     * {@link Ingredient#weight}, {@link Ingredient#price}
     */
    public String getInfo() {
        return "\"" + name + "\" (" + weight + "g) - " + price;
    }
    
}
