package com.restaurant.command;

import com.restaurant.command.concretes.*;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
/**
 * Class creates appropriate command to process request
 * @see ConcreteCommand
 */
public class CommandFactory {
    
    /**
     * An instance of class CommandFactory
     */
    protected static CommandFactory instance = null;
    
    /**
     * Get the instance of class CommandFactory
     * @return the value of {@link CommandFactory#instance}
     */
    public static CommandFactory getInstance() {
        CommandFactory localInstance = instance;
        if (localInstance == null)
            synchronized (CommandFactory.class) {
                localInstance = instance;
                if (localInstance == null)
                    instance = localInstance = new CommandFactory();
            }
        return localInstance;
    }
    
    /**
     * Enumeration of commands
     */
    enum ConcreteCommand { 
        
        /**
         * Contains an object of class VisitorLogin
         * @see VisitorLogin
         */
        LOGIN(            new VisitorLogin()     ), 
        
        /**
         * Contains an object of class VisitorRegister
         * @see VisitorRegister
         */
        REGISTER(         new VisitorRegister()  ),
        
        /**
         * Contains an object of class UserMainPage
         * @see UserMainPage
         */
        USR_MAIN_PAGE(    new UserMainPage()     ),
        
        /**
         * Contains an object of class UserGetOrder
         * @see UserGetOrder
         */
        USR_GET_ORDER(    new UserGetOrder()     ),
        
        /**
         * Contains an object of class UserGetBill
         * @see UserGetBill
         */
        USR_GET_BILL(     new UserGetBill()      ),
        
        /**
         * Contains an object of class UserPayBill
         * @see UserPayBill
         */
        USR_PAY_BILL(     new UserPayBill()      ),
        
        /**
         * Contains an object of class UserMakeOrder
         * @see UserMakeOrder
         */
        USR_MAKE_ORDER(   new UserMakeOrder()    ),
        
        /**
         * Contains an object of class UserInsertOrder
         * @see UserInsertOrder
         */
        USR_INSERT_ORDER( new UserInsertOrder()  ),
        
        /**
         * Contains an object of class AdminMainPage
         * @see AdminMainPage
         */
        ADM_MAIN_PAGE(    new AdminMainPage()    ),
        
        /**
         * Contains an object of class AdminGetOrder
         * @see AdminGetOrder
         */
        ADM_GET_ORDER(    new AdminGetOrder()    ),
        
        /**
         * Contains an object of class AdminAcceptOrder
         * @see AdminAcceptOrder
         */
        ADM_ACCEPT_ORDER( new AdminAcceptOrder() ),
        
        /**
         * Contains an object of class AdminGetUsers
         * @see AdminGetUsers
         */
        ADM_GET_USERS(    new AdminGetUsers()    ),
        
        /**
         * Contains an object of class AdminUpdateUsers
         * @see AdminUpdateUsers
         */
        ADM_UPDATE_USERS( new AdminUpdateUsers() ),
        
        /**
         * Contains an object of class AdminDeleteUser
         * @see AdminDeleteUser
         */
        ADM_DEL_USER(     new AdminDeleteUser()  );
       
        /**
         * An object of class Command
         * @see Command
         */
        private final Command command;
        
        /**
         * Constructor with one argument initialize field {@link ConcreteCommand#command}
         * @param command    an object of class Command
         */
        ConcreteCommand(Command command) {
            this.command = command;
        }
        
    }
    
    /**
     * Get an object of class Command
     * @param command
     * the name of command
     * @return the value of {@link ConcreteCommand#command}
     */
    public Command getCommand(String command) {
        try {
            return ConcreteCommand.valueOf(command.toUpperCase()).command;
        } catch(IllegalArgumentException ex) {
            return new Command() {
                @Override
                public String execute(HttpServletRequest request, HttpServletResponse response) {
                    throw new UnsupportedOperationException();
                }
            };
        }
    }
    
}
