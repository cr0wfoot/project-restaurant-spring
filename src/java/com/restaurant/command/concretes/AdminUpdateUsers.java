package com.restaurant.command.concretes;

import com.restaurant.command.AbstractCommand;
import com.restaurant.model.User;
import com.restaurant.util.constants.Params;
import javax.servlet.http.HttpServletRequest;
import org.springframework.transaction.annotation.Transactional;

/**
 * Command updates info about user (only access level)
 * @see User
 */
public class AdminUpdateUsers extends AbstractCommand {

    @Override
    @Transactional
    protected String doOperation(HttpServletRequest request) {
        User user = factory.createUserDao().select(Integer.parseInt(request.getParameter(Params.ID)));
        user.setAccess(User.Access.valueOf(request.getParameter(Params.ACCESS).toUpperCase()));
        factory.createUserDao().update(user);        
        return new AdminGetUsers().doOperation(request);
    }
    
}
