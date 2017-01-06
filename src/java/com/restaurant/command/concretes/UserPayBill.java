package com.restaurant.command.concretes;

import com.restaurant.command.AbstractCommand;
import com.restaurant.util.constants.Params;
import javax.servlet.http.HttpServletRequest;
import org.springframework.transaction.annotation.Transactional;

/**
 * Command executes user's bill payment
 * @see Bill
 */
public class UserPayBill extends AbstractCommand {

    @Override
    @Transactional
    protected String doOperation(HttpServletRequest request) {
        factory.createBillDao().delete(Integer.parseInt(request.getParameter(Params.ID)));
        return new UserMainPage().doOperation(request);
    }
    
}
