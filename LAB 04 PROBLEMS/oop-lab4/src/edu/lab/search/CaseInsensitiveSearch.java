package edu.lab.search;

public class CaseInsensitiveSearch implements Searchable {
    public CaseInsensitiveSearch(){}
    @Override
    public boolean search(String text, String key){
        // TODO: convert both to lower-case and use indexOf
        throw new UnsupportedOperationException("TODO");
    }
    @Override
    public String replace(String text, String oldWord, String newWord){
        // TODO: implement a case-insensitive replace of all occurrences
        throw new UnsupportedOperationException("TODO");
    }
}
