package com.restaurant.command.concretes;

import com.restaurant.command.AbstractCommand;
import com.restaurant.util.constants.Params;
import javax.servlet.http.HttpServletRequest;
import org.springframework.transaction.annotation.Transactional;

/**
 * Admin command deletes user from DB
 * @see User
 */
public class AdminDeleteUser extends AbstractCommand {

    @Override
    @Transactional
    protected String doOperation(HttpServletRequest request) {
        factory.createUserDao().delete(Integer.parseInt(request.getParameter(Params.ID)));
        return new AdminGetUsers().doOperation(request);
    }
    
}
