package com.restaurant.command;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Command executes user's requests
 */
public interface Command {
    
    /**
     * Execute command according to user's request
     * @param request    an object of class HttpServletRequest
     * @param response    an object of class HttpServletResponse
     * @return   page redirect to
     */
    String execute(HttpServletRequest request, HttpServletResponse response);
    
}
