package com.restaurant.command.concretes;

import com.restaurant.command.AbstractCommand;
import com.restaurant.model.User;
import com.restaurant.util.constants.Params;
import javax.servlet.http.HttpServletRequest;
import org.springframework.transaction.annotation.Transactional;

/**
 * Command register visitors
 * @see User
 */
public class VisitorRegister extends AbstractCommand {

    /**
     * Page, where forward to
     */
    private static final String FORWARD_PAGE = "index";
    
    @Override
    @Transactional
    protected String doOperation(HttpServletRequest request) {
        User user = new User();
        user.setLogin   ( request.getParameter(Params.LOGIN)    );
        user.setPassword( request.getParameter(Params.PASSWORD) );
        user.setName    ( request.getParameter(Params.NAME)     );
        user.setAccess  ( User.Access.USER                      );
        factory.createUserDao().insert(user);
        return FORWARD_PAGE;
    }
    
}
