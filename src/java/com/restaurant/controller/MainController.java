package com.restaurant.controller;

import com.restaurant.command.Command;
import com.restaurant.command.CommandFactory;
import com.restaurant.model.User;
import com.restaurant.util.validation.LoginValidator;
import com.restaurant.util.validation.UserValidator;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * The main controller, proccesses all requests
 */
@Controller
public class MainController {
    
    /**
     * Validates and proccesses user registration
     * @param user
     * an object of class User
     * @param result
     * binding result
     * @param request
     * HTTP request
     * @param response
     * HTTP response
     * @return 
     * page where forward to
     */
    @RequestMapping(value = "registration.restaurant", method = {RequestMethod.POST, RequestMethod.GET})
    public String validateRegistrationForm(
                @ModelAttribute("user") User user, BindingResult result, 
                HttpServletRequest request, HttpServletResponse response
            ) {
        UserValidator validation = new UserValidator();
        validation.validate(user, result);
        if (result.hasErrors()) 
            return "registration";  
        return processRequest(request, response);
    }
    
    /**
     * Validates and proccesses user log in
     * @param user
     * an object of class User
     * @param result
     * binding result
     * @param request
     * HTTP request
     * @param response
     * HTTP response
     * @return 
     * page where forward to
     */
    @RequestMapping(value = "login.restaurant", method = RequestMethod.POST)
    public String validateLoginForm(
                @ModelAttribute("user") User user, BindingResult result, 
                HttpServletRequest request, HttpServletResponse response
            ) {
        LoginValidator validation = new LoginValidator();
        validation.validate(user, result);
        if (result.hasErrors()) 
            return "index";  
        return processRequest(request, response);
    }
    
    /**
     * Proccesses user's requests
     * @param request
     * HTTP request
     * @param response
     * HTTP response
     * @return 
     * page where forward to
     */
    @RequestMapping(value = "*.restaurant", method = RequestMethod.POST)
    public String processRequest(HttpServletRequest request, HttpServletResponse response) {
        Command command = CommandFactory.getInstance().getCommand(request.getParameter("command"));        
        return command.execute(request, response);
    }
    
    /**
     * Redirects user
     * @param page
     * page from where request come
     * @param model
     * an object of class Model
     * @return 
     * page where forward to
     */
    @RequestMapping(value = "{page}.htm", method = RequestMethod.GET)
    public String redirect(@PathVariable String page, Model model) { 
        model.addAttribute("user", new User());
        return page;
    }
    
}
