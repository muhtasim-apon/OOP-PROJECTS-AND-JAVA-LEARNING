package edu.lab.text;
import edu.lab.api.Analyzer;

public class SimpleAnalyzer implements Analyzer {
    public SimpleAnalyzer(){}

    @Override
    public int countWords(String text){
        if(text.isEmpty())
        {
            return 0;
        }
            int count=0;
            String[] words= text.split("\\s+");
            for(String word: words)
            {
                count++;
            }
            return count;
    }

    @Override
    public int countCharacters(String text){
        int count=0;
        if(text.isEmpty())return 0;
        char[] array=text.toCharArray();
        for(char c: array)
        {
            count++;
        }
        return count;
    
    }

    @Override
    public boolean containsSubstring(String text, String sub){
        if(text.contains(sub))return true;
        return false;
    }
}
