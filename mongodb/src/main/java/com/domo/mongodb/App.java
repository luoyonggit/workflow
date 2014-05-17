package com.domo.mongodb;

import java.net.UnknownHostException;

import com.mongodb.Mongo;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        System.out.println( "Hello World!" );
        
        try {
			@SuppressWarnings("deprecation")
			Mongo mongo = new Mongo("localhost:27017");
			System.out.println(mongo.getDatabaseNames());
		} catch (UnknownHostException e) {
			e.printStackTrace();
		}
    }
}
