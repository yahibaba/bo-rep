package com.es.bo.biz.util;

import com.es.bo.biz.domain.User;

/**
 * Created by myachb on 3/30/2016.
 */
public class AppContext {

    private static final ThreadLocal context = new ThreadLocal();

    public static void set(User user){
        context.set(user);
    }

    public static User get(){
        return (User)context.get();
    }

    public static void destroy(){
        context.remove();
    }


}
