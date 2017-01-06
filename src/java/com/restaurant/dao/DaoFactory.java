package com.restaurant.dao;

import java.util.logging.Level;
import java.util.logging.Logger;

/**
 * This is highest level of abstraction for all Data Access Objects with an associated response object
 * Every data access object must register with a service before it can be used
 * @see OrderDao
 * @see BillDao
 * @see UserDao
 * @see IngredientDao
 * @see JdbcDaoFactory
 */
public abstract class DaoFactory {

    /**
     * Return the OrderDao Object
     */
    public abstract OrderDao createOrderDao();
    
    /**
     * Return the BillDao Object
     */
    public abstract BillDao createBillDao();
    
    /**
     * Return the IngredientDao Object
     */
    public abstract IngredientDao createIngredientDao();
    
    /**
     * Return the UserDao Object
     */
    public abstract UserDao createUserDao();
    
    /**
     * Gets an instance of JdbcDaoFactory
     */
    public static DaoFactory instance(){
        try {
            return (DaoFactory)Class.forName("com.restaurant.dao.jdbc.JdbcDaoFactory").newInstance();
        } catch (Exception ex) {
            Logger.getLogger(DaoFactory.class.getName()).log(Level.SEVERE, null, ex);
            return null;
        }
        
    }
    
}

