import java.util.*;
class Main {
    public static void main(String[] args) {
        ArrayList<String> myList = new ArrayList<String>();
        boolean logic = true;
        while (logic){
            prompt();
            int input = getInput();
            action(input, myList);
            logic = false;
        }

    }
    public static int getInput(){
        Scanner input = new Scanner(System.in);
        return input.nextInt();
    }
    public static String[] getItems(){
        Scanner input = new Scanner(System.in);
        String items = input.nextLine();
        return items.split(", ");
    }
    public static void action(int input, ArrayList<String> myList){
        switch (input) {
            case 0 -> shutdown(myList);
            case 1 -> addItems(myList);
            case 2 -> deleteItems(myList);
            default -> System.out.println("Invalid Input. Try Again.");
        }
    }
    public static void shutdown(ArrayList<String> myList){
        System.out.println("Shutting down.");
        printList(myList);
        System.exit(0);
    }
    public static void addItems(ArrayList<String> myList){
        System.out.println("List items you wish to add.");
        String[] lst = getItems();
        System.out.println("Added items: " + Arrays.toString(lst));
        myList.addAll(Arrays.asList(lst));
        printList(myList);
    }
    public static void deleteItems(ArrayList<String> myList){
        System.out.println("List items you wish to delete.");
        if (myList.isEmpty()){
            System.out.println("List is empty");
        }
        String[] lst = getItems();
        System.out.println("Deleted items: " + Arrays.toString(lst));
        myList.removeAll(Arrays.asList(lst));
        printList(myList);
    }
    public static void prompt(){
        System.out.println("0 - To Shutdown");
        System.out.println("1 - To Add Items");
        System.out.println("2 - To Delete Items");
    }
    public static void printList(ArrayList<String> myList){
        System.out.println("List: " + myList.toString());
    }
    public static void printWorld(){
        System.out.println("Hello world");
    }
}
