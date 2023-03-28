package Generics;

import java.util.Arrays;

public class CustomArrayList {
    private int[] data;
    private final static int DEFAULT_SIZE = 10;
    private int size = 0;

    public CustomArrayList(){
        this.data = new int[DEFAULT_SIZE];
    }

    public void add(int num){
        if(this.isFull()){
            this.resize();
        }
        data[size++] = num;
    }

    public boolean isFull(){
        return this.size == data.length;
    }

    public void resize(){
        int[] newArr = new int[data.length*20];
        for (int i = 0; i<=data.length; i++){
            newArr[i] = data[i];
        }
        data = newArr;
    }

    public int remove(){
        return data[--size];
    }

    public int get(int index){
        return data[index];
    }

    public int getSize(){
        return size;
    }

    public void set(int index, int num){
        data[index] = num;
    }

    @Override
    public String toString() {
        return "CustomArrayList{" +
                "data=" + Arrays.toString(data) +
                ", size=" + size +
                '}';
    }
}
