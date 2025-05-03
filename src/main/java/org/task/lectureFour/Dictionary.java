package org.task.lectureFour;

import java.util.HashMap;
import java.util.List;
import java.util.Set;
import java.util.HashSet;
import java.util.Collections;

public class Dictionary {
    private List<String> dictionary;
    public Dictionary(List<String> dictionary) {
        this.dictionary = dictionary;
    }
    private HashMap<String,Integer> getUniqueWords(){
        HashMap<String,Integer> words = new HashMap<>();
        Set<String> set = new HashSet<>(this.dictionary);
        set.stream().forEach(v->{
            words.put(v,Collections.frequency(this.dictionary,v));
        });
        return words;
    }
    public void getInfo(){
        HashMap<String,Integer> infoWords = this.getUniqueWords();
        infoWords.forEach((k,v)-> System.out.printf("%s встречается: %d\n",k,v));
    }
}
