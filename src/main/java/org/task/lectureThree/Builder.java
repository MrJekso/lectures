package org.task.lectureThree;

import java.util.ArrayList;

public class Builder <T> {
    public void exchange(T[] arr, int indexOne, int indexTwo){
        T val = arr[indexOne];
        arr[indexOne] = arr[indexTwo];
        arr[indexTwo] = val;
    }
    public ArrayList<T> transformInArrayList(T[] arr){
        ArrayList<T> result = new ArrayList<T>();
        for(T e: arr)
            result.add(e);
        return result;
    }
}
