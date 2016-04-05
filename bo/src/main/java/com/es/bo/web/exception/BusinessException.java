package com.es.bo.web.exception;

/**
 * Created by myachb on 3/30/2016.
 */
public class BusinessException extends RuntimeException {


    public BusinessException(){
        super();
    }

    public BusinessException(String msg){
        super(msg);
    }

    public BusinessException(Throwable cause){
        super(cause);
    }

    public BusinessException(String msg, Throwable cause){
        super(msg, cause);
    }
}

