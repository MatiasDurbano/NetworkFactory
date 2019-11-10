package com.TwitterApi;

import java.util.List;

import com.Network2.Red;
import com.Twitter.TwitterRedImpl;


public class App 
{
    public static void main( String[] args )
    {
       Red A = new TwitterRedImpl();
       
       List<String> b = A.get();
       for(String c :b) {
    	   System.out.println(c);
       }
    }
}
