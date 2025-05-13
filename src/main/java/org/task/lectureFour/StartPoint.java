package org.task.lectureFour;

import java.util.ArrayList;

public class StartPoint {
    public static void run() {
        System.out.println("Task 1\n----------------------");
        ArrayList<String> dictionaryList = new ArrayList<>();
        dictionaryList.add("tomato");
        dictionaryList.add("tomato");
        dictionaryList.add("potato");
        dictionaryList.add("potato");
        dictionaryList.add("cucumber");
        dictionaryList.add("cucumber");
        dictionaryList.add("cabbage");
        dictionaryList.add("cabbage");
        dictionaryList.add("pumpkin");
        dictionaryList.add("pumpkin");
        dictionaryList.add("celery");
        dictionaryList.add("celery");
        dictionaryList.add("carrot");
        dictionaryList.add("carrot");
        dictionaryList.add("beet");
        dictionaryList.add("beet");
        dictionaryList.add("onion");
        dictionaryList.add("onion");
        dictionaryList.add("garlic");
        dictionaryList.add("garlic");
        Dictionary dictionary = new Dictionary(dictionaryList);
        dictionary.getInfo();
        System.out.println("Task 2\n----------------------");
        TelephoneDirectory telephoneDirectory = new TelephoneDirectory();
        telephoneDirectory.addPeople("bobrov","89354870047");
        telephoneDirectory.addPeople("petrov","89364563247");
        telephoneDirectory.addPeople("petrov","+79995343243");
        telephoneDirectory.addPeople("trudov","89994563247");
        telephoneDirectory.addPeople("vasnecov","+79674500984");
        telephoneDirectory.addPeople("sherbakov","+79998370099");
        telephoneDirectory.addPeople("rybkov","89994563247");
        telephoneDirectory.addPeople("kulkov","+79994563233");
        telephoneDirectory.addPeople("tomatov","89994563261");
        telephoneDirectory.addPeople("potatov","+79994563211");
        telephoneDirectory.addPeople("alexov","+79994563211");

        System.out.println("Telephone directory");
        System.out.print(telephoneDirectory.toString());
        System.out.println("---");
        String family = "peTrov";
        telephoneDirectory.findPeople(family);
    }
}
