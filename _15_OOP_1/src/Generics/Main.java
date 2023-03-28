package Generics;

public class Main {
    public static void main(String[] args) {
        CustomArrayList list1 = new CustomArrayList();
        list1.add(15);
        list1.add(16);
        System.out.println(list1.getSize());
        System.out.println(list1);
    }
}
