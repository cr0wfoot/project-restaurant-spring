package com.restaurant.command.concretes;

import com.restaurant.command.AbstractCommand;
import com.restaurant.model.Order;
import com.restaurant.util.constants.Attributes;
import com.restaurant.util.constants.Params;
import javax.servlet.http.HttpServletRequest;

/**
 * Command show information about order for user
 * @see Order
 */
public class UserGetOrder extends AbstractCommand {

    /**
     * Page, where forward to
     */
    private static final String FORWARD_PAGE = "user/user-order";
    
    @Override
    protected String doOperation(HttpServletRequest request) {
        Order order = factory.createOrderDao().select(Integer.parseInt(request.getParameter(Params.ID)));
        request.setAttribute(Attributes.ORDER, order);
        return FORWARD_PAGE;
    }
    
}
