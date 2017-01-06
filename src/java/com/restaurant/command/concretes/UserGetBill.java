package com.restaurant.command.concretes;

import com.restaurant.command.AbstractCommand;
import com.restaurant.model.Bill;
import com.restaurant.util.constants.Attributes;
import com.restaurant.util.constants.Params;
import javax.servlet.http.HttpServletRequest;

/**
 * Command show information about bill for user
 * @see Bill
 */
public class UserGetBill extends AbstractCommand {

    /**
     * Page, where forward to
     */
    private static final String FORWARD_PAGE = "user/user-bill";
    
    @Override
    protected String doOperation(HttpServletRequest request) {
        Bill bill = factory.createBillDao().select(Integer.parseInt(request.getParameter(Params.ID)));
        request.setAttribute(Attributes.BILL, bill);
        return FORWARD_PAGE;
    }
    
}
