package com.restaurant.command.concretes;

import com.restaurant.command.AbstractCommand;
import com.restaurant.model.User;
import com.restaurant.model.search.criteria.UserSearchCriteria;
import com.restaurant.util.constants.Attributes;
import com.restaurant.util.constants.Params;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

/**
 * Command login users
 * @see User
 */
public class VisitorLogin extends AbstractCommand {
    
    /**
     * Page, where forward to, if error
     */
    private static final String FORWARD_DEFAULT_PAGE = "error";

    @Override
    protected String doOperation(HttpServletRequest request) {
        UserSearchCriteria criteria = new UserSearchCriteria();
        criteria.setLogin( request.getParameter(Params.LOGIN) );
        User user = factory.createUserDao().findByCriteria(criteria).get(0);
        HttpSession session = request.getSession(true);                    
        session.setAttribute( Attributes.ID_USER, String.valueOf(user.getId()) ); 
        session.setAttribute( Attributes.ACCESS,  user.getAccess()             );
        switch(user.getAccess()) {
            case ADMIN : return new AdminMainPage().doOperation(request);
            case USER  : return new UserMainPage() .doOperation(request);
            default    : return FORWARD_DEFAULT_PAGE;
        }
    }
    
}
