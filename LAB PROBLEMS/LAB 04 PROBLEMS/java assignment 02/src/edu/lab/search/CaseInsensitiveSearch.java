package edu.lab.search;

public class CaseInsensitiveSearch implements Searchable {
    public CaseInsensitiveSearch(){}
    @Override
    public boolean search(String text, String key){
        // TODO: convert both to lower-case and use indexOf
       text= text.toLowerCase();
        key= key.toLowerCase();
        if(text.indexOf(key)==-1)return false;
        return true;
    }
    @Override
    public String replace(String text, String oldWord, String newWord){
        // TODO: implement a case-insensitive replace of all occurrences
        int index=0;
        String str="";
        int length=oldWord.length();
        while(index<text.length())
        {
            if(text.regionMatches(true,index,oldWord,0 , length))
            {
                str+=newWord;
                index+=length;
            }
            else
            {
                str+=text.charAt(index);
                index++;
            }
        }
        return str;
    }
}
