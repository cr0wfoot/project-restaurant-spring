package com.restaurant.util.tags;

import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;
import javax.servlet.jsp.JspException;
import javax.servlet.jsp.SkipPageException;
import javax.servlet.jsp.tagext.SimpleTagSupport;

/**
 * Custom tag, views todays date according to format
 */
public class DateToday extends SimpleTagSupport  {
    
    /**
     * The value of date format
     */
    private String format;
    
    /**
     * Set the value of {@link DateToday#format}
     * @param format
     * the value of date format
     */
    public void setFormat(String format) {
        this.format = format;
    }

    /**
     * Called by the container to invoke this tag. The implementation of this
     * method is provided by the tag library developer, and handles all tag
     * processing, body iteration, etc.
     */
    @Override
    public void doTag() throws JspException {
        try {
            Date today = new Date();
            SimpleDateFormat dateFormatter = new SimpleDateFormat(format);
            getJspContext().getOut().write(dateFormatter.format(today));
        } catch(IOException ex) {
            throw new SkipPageException(ex);
        }       
    }
    
}
