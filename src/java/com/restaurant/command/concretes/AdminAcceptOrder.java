package com.restaurant.command.concretes;

import com.restaurant.command.AbstractCommand;
import com.restaurant.dao.OrderDao;
import com.restaurant.model.Bill;
import com.restaurant.model.Ingredient;
import com.restaurant.model.Order;
import com.restaurant.util.constants.Params;
import java.util.List;
import javax.servlet.http.HttpServletRequest;
import org.springframework.transaction.annotation.Transactional;

/**
 * Command executes admin order acception and creates bill for user
 * @see Order
 * @see Bill
 */
public class AdminAcceptOrder extends AbstractCommand {

    @Override
    @Transactional
    protected String doOperation(HttpServletRequest request) {
        OrderDao orderDao = factory.createOrderDao();
        Order order = orderDao.select(Integer.parseInt(request.getParameter(Params.ID)));
        Bill bill = new Bill();
        bill.setUserId  ( order.getUserId()                      );
        bill.setPrice   ( countPrice(order.getIngredients())     );
        bill.setInfo    ( createBillInfo(order.getIngredients()) );
        factory.createBillDao().insert(bill);
        orderDao.delete(order.getId());
        return new AdminMainPage().doOperation(request);
    }
    
    /**
     * Get the double value of total price for all ingredients from the list
     * @param ingredients 
     * the list of ingredients in order
     * @return the value of price
     */
    private double countPrice(List<Ingredient> ingredients) {
        double totalPrice = 0;
        for(Ingredient i : ingredients)
            totalPrice += i.getPrice();
        return totalPrice;
    }
    
    /**
     * Get the total info of all ingredients from list
     * @param ingredients
     * the list of ingredients in order
     * @return the value of info
     */
    private String createBillInfo(List<Ingredient> ingredients) {
        String info = "";
        for(Ingredient i : ingredients)
            info += System.lineSeparator() + i.getInfo(); 
        return info;
    }
    
}
