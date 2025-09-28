package edu.lab.text;
import edu.lab.api.Analyzer;

public class SimpleAnalyzer implements Analyzer {
    public SimpleAnalyzer(){}

    @Override
    public int countWords(String text){
        // TODO: count words splitting on whitespace; handle null/empty as 0
        throw new UnsupportedOperationException("TODO");
    }

    @Override
    public int countCharacters(String text){
        // TODO: return text length; null => 0
        throw new UnsupportedOperationException("TODO");
    }

    @Override
    public boolean containsSubstring(String text, String sub){
        // TODO: true if sub occurs within text (case-sensitive)
        throw new UnsupportedOperationException("TODO");
    }
}
