package edu.lab.search;

public class CaseSensitiveSearch implements Searchable {
    public CaseSensitiveSearch(){}
    @Override
    public boolean search(String text, String key){
        // TODO: return true if key appears in text (case-sensitive); handle null safely
        throw new UnsupportedOperationException("TODO");
    }
    @Override
    public String replace(String text, String oldWord, String newWord){
        // TODO: case-sensitive replace of all occurrences (use String.replace)
        throw new UnsupportedOperationException("TODO");
    }
}
