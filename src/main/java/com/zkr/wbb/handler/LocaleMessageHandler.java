package com.zkr.wbb.handler;

import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.MessageSource;
import org.springframework.context.i18n.LocaleContextHolder;
import org.springframework.stereotype.Component;

import java.util.Locale;

@Component
public class LocaleMessageHandler {

    @Autowired
    private MessageSource messageSource;

    public String getMessage(String code) {
        return getMessage(code, new Object[]{});
    }


    public String getMessage(String code, String language,Object... args) {
        if(StringUtils.equalsIgnoreCase("zh", language)){
        	return getMessage(code, args, "", Locale.CHINA);
        }else  if(StringUtils.equalsIgnoreCase("en", language)){
        	return getMessage(code, args, "", Locale.US);
        }else {
        	return getMessage(code, args, "", Locale.CHINA);
        }
    }

    public String getMessage(String code, String defaultMessage, Locale locale) {
        return getMessage(code, null, defaultMessage, locale);
    }


    public String getMessage(String code, Locale locale) {
        return getMessage(code, null, "", locale);
    }

    public String getMessage(String code, Object[] args) {
        return getMessage(code, args, "");
        
        
    }


    public String getMessage(String code, Object[] args, Locale locale) {
        return getMessage(code, args, "", locale);
    }


    public String getMessage(String code, Object[] args, String defaultMessage) {
        Locale locale = LocaleContextHolder.getLocale();
        return getMessage(code, args, defaultMessage, locale);
    }

    public String getMessage(String code, Object[] args, String defaultMessage, Locale locale) {
        return messageSource.getMessage(code, args, defaultMessage, locale);
    }
}
