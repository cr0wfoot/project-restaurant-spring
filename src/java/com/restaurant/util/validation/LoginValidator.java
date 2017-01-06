package com.restaurant.util.validation;

import com.restaurant.dao.DaoFactory;
import com.restaurant.model.User;
import com.restaurant.model.search.criteria.UserSearchCriteria;
import com.restaurant.util.constants.Params;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import org.springframework.stereotype.Component;
import org.springframework.validation.Errors;
import org.springframework.validation.ValidationUtils;
import org.springframework.validation.Validator;

/**
 * Validates data of object User from login form
 * @See
 */
@Component
public class LoginValidator implements Validator {
    
    @Override
    public boolean supports(Class<?> aClass) {
        return User.class.isAssignableFrom(aClass);
    }
 
    @Override
    public void validate(Object o, Errors errors) {
        ValidationUtils.rejectIfEmptyOrWhitespace(errors, Params.LOGIN, MessagePath.LOGIN_EMPTY);
        ValidationUtils.rejectIfEmptyOrWhitespace(errors, Params.PASSWORD, MessagePath.PASSWORD_EMPTY);        
        User user = (User)o; 
        if(isValidByPatterns(user, errors))
            checkLoginAndPassword(user.getLogin(), user.getPassword(), errors);
    }
    
    /**
     * Check if fields are valid by patterns
     * @param user
     * model of class User received from form
     * @param errors
     * an object of class Errors, stores errors
     * @return boolean value: true - if every field is valid
     */
    private boolean isValidByPatterns(User user, Errors errors) {
        if(errors.hasErrors()) return false;
        Matcher m;
        if (user.getLogin() != null) {  
            m = Pattern.compile(Regexp.LOGIN).matcher(user.getLogin());   
            if (!m.matches())
                errors.rejectValue(Params.LOGIN, MessagePath.LOGIN_INVALID);
        }
        if (user.getPassword() != null) {  
            m = Pattern.compile(Regexp.PASSWORD).matcher(user.getPassword());  
            if (!m.matches())  
                errors.rejectValue(Params.PASSWORD, MessagePath.PASSWORD_INVALID);  
        }        
        return !errors.hasErrors();
    }
    
    /**
     * Check if login exists then check password
     * @param login
     * login received from form
     * @param password
     * password received from form
     * @param errors 
     * an object of class Errors, stores errors
     */
    private void checkLoginAndPassword(String login, String password, Errors errors) {
        UserSearchCriteria criteria = new UserSearchCriteria();
        criteria.setLogin(login);
        List<User> users = DaoFactory.instance().createUserDao().findByCriteria(criteria);
        if(users.isEmpty()) {
            errors.rejectValue(Params.LOGIN, MessagePath.LOGIN_INCORRECT);
            return;
        }
        checkPassword(users.get(0).getPassword(), password, errors);    
    }
    
    /**
     * Check if password from login form coincides with password of this user from db
     * @param dbPassword
     * password from db
     * @param formPassword
     * password received from form
     * @param errors 
     * an object of class Errors, stores errors
     */
    private void checkPassword(String dbPassword, String formPassword, Errors errors) {
        if(!dbPassword.equals(formPassword))
            errors.rejectValue(Params.PASSWORD, MessagePath.PASSWORD_INCORRECT);
    }
    
}