package com.github.affandes.kuliah.st;

public class WordInfo {

    public String word;
    public int count;

    public WordInfo(String word, int count) {
        this.word = word;
        this.count = count;
    }

    @Override
    public String toString() {
        return "{" + word + ": " + count + "}";
    }
}