/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.restaurant.util.filters;

import com.restaurant.model.User;
import com.restaurant.util.constants.Attributes;
import java.io.IOException;
import javax.servlet.*;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

/**
 * Filter check user's access, before processing admin's request
 */
public class AccessAdmin implements Filter {

    /**
     * Filter configuration
     */
    private FilterConfig filterConfig = null;
    
    /**
     * Page redirect user to, if access denied
     */
    private static final String PAGE_IF_ADMIN_ACCESS_DENIED = "redirect.jsp"; 
    
    /**
     * An empty constructor
     */
    public AccessAdmin() {
        
    }    

    /**
     *
     * @param request The servlet request we are processing
     * @param response The servlet response we are creating
     * @param chain The filter chain we are processing
     *
     * @exception IOException if an input/output error occurs
     * @exception ServletException if a servlet error occurs
     */
    @Override
    public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain)
           throws IOException, ServletException {

        HttpSession session = ((HttpServletRequest)request).getSession(true);    
        if((session.getAttribute(Attributes.ACCESS)).equals(User.Access.ADMIN))
            chain.doFilter(request, response);
        else request.getRequestDispatcher(PAGE_IF_ADMIN_ACCESS_DENIED).forward(request, response);

    }

    /**
     * Return the filter configuration object for this filter.
     */
    public FilterConfig getFilterConfig() {
        return (this.filterConfig);
    }

    /**
     * Set the filter configuration object for this filter.
     *
     * @param filterConfig The filter configuration object
     */
    public void setFilterConfig(FilterConfig filterConfig) {
        this.filterConfig = filterConfig;
    }

    /**
     * Destroy method for this filter
     */
    @Override
    public void destroy() {        
    }

    /**
     * Init method for this filter
     */
    @Override
    public void init(FilterConfig filterConfig) {        
        this.filterConfig = filterConfig;
    }

}
