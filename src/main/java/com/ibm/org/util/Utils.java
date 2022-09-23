package com.ibm.org.util;

import java.util.Random;

public class Utils
{
    /**
     * Generate a unique aplha-numeric ID of given length
     * @param length
     * @return
     */
    public static String generateUniqueID(int length)
    {
        char [] chars = new char[]{'a','b','c','d','e','f','g','h','i','j','k','l','m','n','o','p','q','r','s','t','u','v','w','x','y','z'};
        int [] numbers = new int[]{0,1,2,3,4,5,6,7,8,9};

        StringBuilder sb = new StringBuilder();

        for(int i=1; i<=length; i++) {
            Random r = new Random();
            int select = r.nextInt(2);
            if(select == 0) {
                char rChar = chars[r.nextInt(chars.length)];
                sb.append(rChar);
            } else {
                int rInt = numbers[r.nextInt(numbers.length)];
                sb.append(rInt);
            }
        }
        return sb.toString();
    }
}
