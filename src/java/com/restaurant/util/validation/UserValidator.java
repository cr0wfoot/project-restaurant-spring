package com.restaurant.util.validation;

import com.restaurant.dao.DaoFactory;
import com.restaurant.model.User;
import com.restaurant.model.search.criteria.UserSearchCriteria;
import com.restaurant.util.constants.Params;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import org.springframework.stereotype.Component;
import org.springframework.validation.Errors;
import org.springframework.validation.ValidationUtils;
import org.springframework.validation.Validator;

/**
 * Validates data of object User from registration form
 */
@Component
public class UserValidator implements Validator {
    
    @Override
    public boolean supports(Class<?> aClass) {
        return User.class.isAssignableFrom(aClass);
    }
 
    @Override
    public void validate(Object o, Errors errors) {
        ValidationUtils.rejectIfEmptyOrWhitespace(errors, Params.LOGIN, MessagePath.LOGIN_EMPTY);
        ValidationUtils.rejectIfEmptyOrWhitespace(errors, Params.PASSWORD, MessagePath.PASSWORD_EMPTY);        
        ValidationUtils.rejectIfEmptyOrWhitespace(errors, Params.NAME, MessagePath.NAME_EMPTY);
        User user = (User)o; 
        if(!errors.hasErrors())
            validateByPatterns(user, errors);
    }
    
    /**
     * Check if fields are valid by patterns
     * @param user
     * model of class User received from form
     * @param errors 
     * an object of class Errors, stores errors
     */
    private void validateByPatterns(User user, Errors errors) {
        Matcher m;
        if (user.getLogin() != null) {  
            m = Pattern.compile(Regexp.LOGIN).matcher(user.getLogin());  
            if (!m.matches())
                errors.rejectValue(Params.LOGIN, MessagePath.LOGIN_INVALID);
            else checkIfLoginExists(user.getLogin(), errors);
        }
        if (user.getPassword() != null) {  
            m = Pattern.compile(Regexp.PASSWORD).matcher(user.getPassword());  
            if (!m.matches())  
                errors.rejectValue(Params.PASSWORD, MessagePath.PASSWORD_INVALID);  
        }        
        if (user.getName() != null) {  
            m = Pattern.compile(Regexp.NAME).matcher(user.getName());   
            if (!m.matches())  
                errors.rejectValue(Params.NAME, MessagePath.NAME_INVALID);  
        }
    }
    
    /**
     * Check if login is already exists in db
     * @param login
     * login received from form
     * @param errors 
     * an object of class Errors, stores errors
     */
    private void checkIfLoginExists(String login, Errors errors) {
        UserSearchCriteria criteria = new UserSearchCriteria();
        criteria.setLogin(login);
        if(!DaoFactory.instance().createUserDao().findByCriteria(criteria).isEmpty())
            errors.rejectValue(Params.LOGIN, MessagePath.LOGIN_EXISTS);
    }
    
}