package com.restaurant.util.filters;

import java.io.IOException;
import javax.servlet.*;

/**
 * Filter sets encoding to UTF-8
 */
public class Encoding implements Filter {

    /**
     * The boolean value of encoding
     */
    private static final String ENCODING = "UTF-8";
    
    /**
     * Filter configuration
     */
    private FilterConfig filterConfig = null;
    
    /**
     * An empty constructor
     */
    public Encoding() {
        
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
               
        request.setCharacterEncoding(ENCODING);
        response.setContentType("text/html;charset=" + ENCODING);
        chain.doFilter(request, response);
                
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
