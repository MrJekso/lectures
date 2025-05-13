package org.task.lectureFour;

import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.ArrayList;

public class TelephoneDirectory {
    private List<People> directory = new ArrayList<>();

    public void addPeople(String family, String phone){
        directory.add(new People(family,phone));
        Collections.sort(this.directory);
    }
    public void findPeople(String family){
        StringBuilder str = new StringBuilder();
        str.append("Find "+family+"\n");
        People people = new People(family);
        Iterator<People> iterator = this.directory.iterator();
        while(iterator.hasNext()){
            People p = iterator.next();
            if (p.equals(people)){
                str.append((p.getFamily()+":"+p.getPhone()+"\n"));
            }
        }
        System.out.println(str.toString());
    }
    @Override
    public String toString(){
        StringBuilder str = new StringBuilder();
        this.directory.forEach(v->str.append(v.getFamily()+":"+v.getPhone()+"\n"));
        return str.toString();
    }
}
