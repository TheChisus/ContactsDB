package com.example.desmoline.myapplication.backend;

import com.googlecode.objectify.Objectify;
import com.googlecode.objectify.ObjectifyFactory;
import com.googlecode.objectify.ObjectifyService;

/**
 * Created by desmoline on 4/14/16.
 */

public class ObjectifyProvider {
    static {
        ObjectifyService.register(Contact.class);
    }

    public static Objectify ofy(){
        return ObjectifyService.ofy();
    }

    public static ObjectifyFactory factory(){
        return ObjectifyService.factory();
    }
}
