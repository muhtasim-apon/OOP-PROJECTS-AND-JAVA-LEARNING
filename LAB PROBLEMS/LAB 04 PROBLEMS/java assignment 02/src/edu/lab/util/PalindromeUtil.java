package edu.lab.util;

public final class PalindromeUtil {
    private PalindromeUtil(){}
// TODO: ignore spaces and case, treat null/empty as false except empty string may be true
    public static boolean isPalindrome(String text){
        if(text.isEmpty())return false;
        String[] str=text.split("\\s+");
        String str1="";
        for(String s: str)
        {
            str1+=s;
        }
        StringBuffer st= new StringBuffer(str1);
        String str2=st.reverse().toString();
        if(str1.equalsIgnoreCase(str2))return true;
        return false;
    }
// TODO: use StringBuffer(new String(text)).reverse().toString() style logic
    public static String reverse(String text){
        StringBuffer st= new StringBuffer(text);
        String str=st.reverse().toString();
        return str;
    }
}
 