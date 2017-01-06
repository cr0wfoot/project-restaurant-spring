package com.restaurant.command.concretes;

import com.restaurant.command.AbstractCommand;
import com.restaurant.model.User;
import com.restaurant.util.constants.Attributes;
import java.util.List;
import javax.servlet.http.HttpServletRequest;

/**
 * Command show users for admin
 * @see User
 */
public class AdminGetUsers extends AbstractCommand {

    /**
     * Page, where forward to
     */
    private static final String FORWARD_PAGE = "admin/admin-users";
    
    @Override
    protected String doOperation(HttpServletRequest request) {
        List<User> users = factory.createUserDao().selectAll();
        request.setAttribute(Attributes.USERS, users);
        return FORWARD_PAGE;
    }
    
}
