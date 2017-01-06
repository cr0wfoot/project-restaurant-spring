package com.restaurant.command.concretes;

import com.restaurant.command.AbstractCommand;
import com.restaurant.model.search.criteria.BillSearchCriteria;
import com.restaurant.model.search.criteria.OrderSearchCriteria;
import com.restaurant.util.constants.Attributes;
import javax.servlet.http.HttpServletRequest;

/**
 * Command show user's index page with list of bills, orders and personal info
 * @see User
 * @see Order
 * @see Bill
 */
public class UserMainPage extends AbstractCommand {

    /**
     * Page, where forward to
     */
    private static final String FORWARD_PAGE = "user/user-index";
    
    @Override
    protected String doOperation(HttpServletRequest request) {
        BillSearchCriteria billCriteria = new BillSearchCriteria();
        OrderSearchCriteria orderCriteria = new OrderSearchCriteria();
        int userId =  getUserId(request);
        billCriteria. setUserId(userId);
        orderCriteria.setUserId(userId);
        request.setAttribute( Attributes.BILLS,  factory.createBillDao() .findByCriteria( billCriteria )  );
        request.setAttribute( Attributes.ORDERS, factory.createOrderDao().findByCriteria( orderCriteria)  );
        request.setAttribute( Attributes.USER,   factory.createUserDao() .select        ( userId       )  );
        return FORWARD_PAGE;
    }
    
}
