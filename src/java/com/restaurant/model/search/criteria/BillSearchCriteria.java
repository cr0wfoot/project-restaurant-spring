package com.restaurant.model.search.criteria;

import com.restaurant.model.Bill;

/**
 * Serach criteria of entity Bill for db
 * @see Bill
 */
public class BillSearchCriteria {
    
    /**
     * The value of user's ID
     */
    private Integer userId;
    
    /**
     * The min value of price
     */
    private Double minPrice;
    
    /**
     * The max value of price
     */
    private Double maxPrice;
    
    /**
     * The value of info
     */
    private String info;

    /**
     * Get the value of max price
     * @return the value of {@link BillSearchCriteria#maxPrice}
     */
    public Double getMaxPrice() {
        return maxPrice;
    }

    /**
     * Set the value of {@link BillSearchCriteria#maxPrice}
     * @param maxPrice
     * the value of bill's max price
     */
    public void setMaxPrice(Double maxPrice) {
        this.maxPrice = maxPrice;
    }

    /**
     * Get the value of min price
     * @return the value of {@link BillSearchCriteria#minPrice}
     */
    public Double getMinPrice() {
        return minPrice;
    }

    /**
     * Set the value of {@link BillSearchCriteria#minPrice}
     * @param minPrice
     * the value of bill's min price
     */
    public void setMinPrice(Double minPrice) {
        this.minPrice = minPrice;
    }
    
    /**
     * Get the value of info
     * @return the value of {@link BillSearchCriteria#info}
     */
    public String getInfo() {
        return info;
    }

    /**
     * Set the value of {@link BillSearchCriteria#info}
     * @param info
     * the value of bill's info
     */
    public void setInfo(String info) {
        this.info = info;
    }
    
    /**
     * Get the value of user's id
     * @return the value of {@link BillSearchCriteria#userId}
     */
    public Integer getUserId() {
        return userId;
    }

    /**
     * Set the value of {@link BillSearchCriteria#userId}
     * @param userId
     * the value of bill's user id
     */
    public void setUserId(Integer userId) {
        this.userId = userId;
    }
    
    /**
     * Check if search criteria is empty
     * @return boolean value: true - if every field is empty
     */
    public boolean isEmpty() {
        return minPrice == null && maxPrice == null && 
               info == null && userId == null;
    }
    
    /**
     * Check if object of class Bill fulfils criteria
     * @param bill
     * an object of class Bill
     * @return 
     * boolean value: true - if object fulfils criteria
     */
    public boolean accept(Bill bill) {
        return acceptMinPrice( bill.getPrice()  )
            && acceptMaxPrice( bill.getPrice()  )
            && acceptUserId(   bill.getUserId() )
            && acceptInfo(     bill.getInfo()   );
    }
    
    /**
     * Check if info of object equals info criteria
     * @param info
     * field "info" of class Bill
     * @return 
     * boolean value: true - if accepted
     */
    private boolean acceptInfo(String info) {
        return this.info == null || this.info.equals(info);
    }
    
    /**
     * Check if user's id of object  equals user's id criteria
     * @param userId
     * field "userId" of class Bill
     * @return 
     * boolean value: true - if accepted
     */
    private boolean acceptUserId(Integer userId) {
        return this.userId == null || this.userId.equals(userId);
    }
    
    /**
     * Check if price of object higher than min price criteria
     * @param price
     * field "price" of class Bill
     * @return 
     * boolean value: true - if accepted
     */
    private boolean acceptMinPrice(Double price) {
        return this.minPrice == null || this.minPrice.equals(price);
    }
    
    /**
     * Check if price of object lower than max price criteria
     * @param price
     * field "price" of class Bill
     * @return 
     * boolean value: true - if accepted
     */
    private boolean acceptMaxPrice(Double price) {
        return this.maxPrice == null || this.maxPrice.equals(price);
    }
    
}
