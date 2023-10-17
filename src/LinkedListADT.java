import java.util.LinkedList;
public class LinkedListADT {

    public static void addElement (LinkedList<String> object) {
        object.add("Mouse");
        object.add("Cat");
        object.add("Dog");
        System.out.println("LinkedList:  " + object);

    }

    public static void addElementWithIndex(LinkedList<String> object , int index, String valueElement) {
        object.add(index, valueElement);
        System.out.println("LinkedList  " + object);

    }

    public static void getElementByIndex(LinkedList<String> object, int index) {
        String element = object.get(index);
        System.out.println("get Element: " + element);
        System.out.println("LinkedList: " + object);

    }
    public  static  void setElementValueByIndex(LinkedList<String> object, int index, String value){
        object.set(index, value);
        System.out.println("LinkedList: " + object);

    }

    public static void scanElementLinkedList(LinkedList<String> object) {
        for (int i = 0; i < object.size(); i++){
            System.out.println("Element value: " + object.get(i));
        }
        for (String j : object){
            System.out.println("Element value: " + j);
        }
    }



}
