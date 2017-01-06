package com.restaurant.util.filters;

import com.restaurant.util.constants.Attributes;
import java.io.IOException;
import javax.servlet.*;

/**
 * Filter handles exceptions and redirects user to error page with error message
 */
public class ExceptionHandler implements Filter {
    
    /**
     * Filter configuration 
     */
    private FilterConfig filterConfig = null;
    
    /**
     * Page redirect user to, if error
     */
    private static final String ERROR_PAGE = "error";
    
    /**
     * An empty constructor
     */
    public ExceptionHandler() {
        
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
        
       try {
           chain.doFilter(request, response);
       } catch(Exception ex) {
           request.setAttribute(Attributes.MESSAGE, ex.getStackTrace());
           request.getRequestDispatcher(ERROR_PAGE).forward(request, response);
       }
        
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
