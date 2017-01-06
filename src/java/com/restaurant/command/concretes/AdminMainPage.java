package com.restaurant.command.concretes;

import com.restaurant.command.AbstractCommand;
import com.restaurant.util.constants.Attributes;
import javax.servlet.http.HttpServletRequest;

/**
 * Command show admin index page with list of orders
 * @see Order
 */
public class AdminMainPage extends AbstractCommand {

    /**
     * Page, where forward to
     */
    private static final String FORWARD_PAGE = "admin/admin-index";
    
    @Override
    protected String doOperation(HttpServletRequest request) {
        request.setAttribute(Attributes.ORDERS, factory.createOrderDao().selectAll());
        return FORWARD_PAGE;
    }
    
}
