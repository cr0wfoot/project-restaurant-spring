package com.restaurant.command;

import com.restaurant.dao.DaoFactory;
import com.restaurant.util.constants.Attributes;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 * Abstract command implements pattern Strategy
 */
public abstract class AbstractCommand implements Command {
    
    /**
     * An instance of class DaoFactory
     * @see DaoFactory
     */
    protected DaoFactory factory = DaoFactory.instance();
    
    @Override
    public String execute(HttpServletRequest request, HttpServletResponse response) {
        return doOperation(request);
    }
    
    /**
     * Get user's id from session
     * @param HTTP servlet request
     * @return user's id
     */
    protected int getUserId(HttpServletRequest request) {
        HttpSession session = request.getSession(true);    
        return Integer.parseInt((String)session.getAttribute(Attributes.ID_USER));
    }
    
    /**
     * Do concrete operation according to command
     * @param HTTP servlet request
     * @return page redirect to
     * @see Command
     */
    protected abstract String doOperation(HttpServletRequest request);
    
}
