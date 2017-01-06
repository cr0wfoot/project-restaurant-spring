package com.restaurant.command.concretes;

import com.restaurant.command.AbstractCommand;
import com.restaurant.model.Ingredient;
import com.restaurant.util.constants.Attributes;
import java.util.List;
import javax.servlet.http.HttpServletRequest;
import org.springframework.transaction.annotation.Transactional;

/**
 * Command show page, where user makes order
 * @see Ingredient
 */
public class UserMakeOrder extends AbstractCommand {

    /**
     * Page, where forward to
     */
    private static final String FORWARD_PAGE = "user/user-make-order";
    
    @Override
    @Transactional
    protected String doOperation(HttpServletRequest request) {
        List<Ingredient> ingredients = factory.createIngredientDao().selectAll();
        request.setAttribute(Attributes.INGREDIENTS, ingredients);
        return FORWARD_PAGE;
    }
    
}
