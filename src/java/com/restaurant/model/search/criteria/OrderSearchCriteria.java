package com.restaurant.model.search.criteria;

import com.restaurant.model.Order;
import java.util.Date;

/**
 * Serach criteria of entity Order for db
 * @see Order
 */
public class OrderSearchCriteria {
    
    /**
     * Min value of weight
     */
    private Date minTime;
    
    /**
     * Max value of time
     */
    private Date maxTime;
    
    /**
     * The value of user's id
     */
    private Integer userId;

    /**
     * Get max value of release time
     * @return the value of {@link OrderSearchCriteria#maxTime}
     */
    public Date getMaxTimeRelease() {
        return maxTime;
    }

    /**
     * Set the value of {@link OrderSearchCriteria#maxTime}
     * @param maxTimeRelease
     * the value of order's max time release
     */
    public void setMaxTimeRelease(Date maxTimeRelease) {
        this.maxTime = maxTimeRelease;
    }

    /**
     * Get min value of release time
     * @return the value of {@link OrderSearchCriteria#minTime}
     */
    public Date getMinTimeRelease() {
        return minTime;
    }

    /**
     * Set the value of {@link OrderSearchCriteria#minTime}
     * @param minTimeRelease
     * the value of order's min time release
     */
    public void setMinTimeRelease(Date minTimeRelease) {
        this.minTime = minTimeRelease;
    }

    /**
     * Get the value of user's id
     * @return the value of {@link OrderSearchCriteria#userId}
     */
    public Integer getUserId() {
        return userId;
    }

    /**
     * Set the value of {@link OrderSearchCriteria#userId}
     * @param userId
     * the value of order's user's id
     */
    public void setUserId(Integer userId) {
        this.userId = userId;
    }
    
    /**
     * Check if search criteria is empty
     * @return boolean value: true - if every field is empty
     */
    public boolean isEmpty() {
        return minTime == null && maxTime == null && userId == null;
    }
    
    /**
     * Check if object of class Order fulfils criteria
     * @param order
     * an object of class Order
     * @return 
     * boolean value: true - if object fulfils criteria
     */
    public boolean accept(Order order) {
        return acceptMinTime( order.getTime()                        )
            && acceptMaxTime( order.getTime()                        )
            && acceptUserId(  order.getId()                          );
    }
    
    /**
     * Check if user's id of object equals user's id criteria
     * @param userId
     * field "userId" of class Order
     * @return 
     * boolean value: true - if accepted
     */
    private boolean acceptUserId(Integer userId) {
        return this.userId == null || this.userId.equals(userId);
    }
    
    /**
     * Check if release time of object higher than time
     * @param time
     * field "time" of class Order
     * @return 
     * boolean value: true - if accepted
     */
    private boolean acceptMinTime(Date time) {
        return this.minTime == null || this.minTime.equals(time);
    }
    
    /**
     * Check if release time of object lower than time
     * @param time
     * field "time" of class Order
     * @return 
     * boolean value: true - if accepted
     */
    private boolean acceptMaxTime(Date time) {
        return this.maxTime == null || this.maxTime.equals(time);
    }
    
}
