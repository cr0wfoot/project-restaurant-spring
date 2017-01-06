package com.restaurant.model;

/**
 * Describes entity Bill
 */
public class Bill {
    
    /**
     * The value of bill's ID
     */
    private Integer id;
    
    /**
     * The value of user's ID, bill belongs to
     */
    private Integer userId;
    
    /**
     * The value of total price
     */
    private Double price;
    
    /**
     * Additional info contains ingredients' name and price
     */
    private String info;
    
    /**
     * An empty constructor
     */
    public Bill() {
        
    }
    
    /**
     * Constructor with four arguments initialize fields 
     * {@link Bill#id}, {@link Bill#userId}, {@link Bill#price}, {@link Bill#info},
     * 
     * @param id    the value of bill's ID
     * @param userId    the value of user's ID
     * @param price    the value of price
     * @param info    some info about ingredients
     */
    public Bill(Integer id, Double price, Integer userId, String info) {
        this.id     = id;
        this.info   = info;
        this.price  = price;
        this.userId = userId;
    }

    /**
     * Get the value of bill's ID
     * @return the value of {@link Bill#id}
     */
    public Integer getId() {
        return id;
    }

    /**
     * Set the value of {@link Bill#id}
     * @param id
     * the value of bill's ID
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * Get the value of bill's info
     * @return the value of {@link Bill#info}
     */
    public String getInfo() {
        return info;
    }

    /**
     * Set the value of {@link Bill#info}
     * @param info
     * some info about ingredients
     */
    public void setInfo(String info) {
        this.info = info;
    }
    
    /**
     * Get the value of user's ID
     * @return the value of {@link Bill#userId}
     */
    public Integer getUserId() {
        return userId;
    }

    /**
     * Set the value of {@link Bill#userId}
     * @param userId
     * the value of user's ID
     */
    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    /**
     * Get the value of bill's total price
     * @return the value of {@link Bill#price}
     */
    public Double getPrice() {
        return price;
    }

    /**
     * Set the value of {@link Bill#price}
     * @param price
     * the value of bill's total price
     */
    public void setPrice(Double price) {
        this.price = price;
    }
    
    @Override
    public boolean equals(Object obj) {
	if (  this           == obj             ) return true;
	if (  obj            == null            ) return false;
	if (  getClass()     != obj.getClass()  ) return false;
	if (  ((Bill)obj).id != id              ) return false;
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
        return "ID="       + id    + " | UserID=" + userId + 
               " | Price=" + price + " | Info:"   + info;
    }
    
}
