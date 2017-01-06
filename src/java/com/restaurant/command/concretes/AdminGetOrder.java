package com.restaurant.command.concretes;

import com.restaurant.command.AbstractCommand;
import com.restaurant.model.Order;
import com.restaurant.util.constants.Attributes;
import com.restaurant.util.constants.Params;
import javax.servlet.http.HttpServletRequest;

/**
 * Command show order's info for admin
 * @see Order
 */
public class AdminGetOrder extends AbstractCommand {

    /**
     * Page, where forward to
     */
    private static final String FORWARD_PAGE = "admin/admin-order";
    
    @Override
    protected String doOperation(HttpServletRequest request) {
        Order order = factory.createOrderDao().select(Integer.parseInt(request.getParameter(Params.ID)));
        request.setAttribute(Attributes.ORDER, order);
        return FORWARD_PAGE;
    }
    
}
