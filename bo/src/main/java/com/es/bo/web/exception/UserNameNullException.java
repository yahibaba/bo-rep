package com.es.bo.web.exception;

/**
 * Created by myachb on 3/30/2016.
 */
public class UserNameNullException extends BusinessException {

    public UserNameNullException(){
        super("UserName is Null.");
    }
}
