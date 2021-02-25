package demo;

import java.util.ArrayList;
import java.util.List;

public class GenericsRunner {
    static  <X> X doubleValue(X value){
        return value;
    }
    // to get the duplicate of numbers

    static <X extends List> void duplicate(X list){
        list.addAll(list);
    }

    static double sumOfNumberList(List<? extends Number> numbers){
        double sum = 0.0;//upper bounded wildcard
        for(Number number:numbers){
            sum += number.doubleValue();
        }
        return sum;
    }

    static void addACoupleOfValues(List<? super Number> numbers){
        numbers.add(1);//lower bounded wildcard
        numbers.add(1.0);
        numbers.add(1.0f);
        numbers.add(1l);
    }
    public static void main(String[] args) {

        //5. getting different data types at a time
        List emptyList = new ArrayList<Number>();
        addACoupleOfValues(emptyList);
        System.out.println(emptyList);

        //4.many ways to add long Data types list
        System.out.println(sumOfNumberList(List.of(1,2,3,4,5)));
        System.out.println(sumOfNumberList(List.of(1.1,2.1,3.1,4.1,5.1)));
        System.out.println(sumOfNumberList(List.of(1l,2l,3l,4l,5l)));

//        String value1 = doubleValue(new String());
//        Integer number1 = doubleValue(Integer.valueOf(5));
//        ArrayList list1 = doubleValue(new ArrayList());

        //3.to get the duplicate of numbers

        ArrayList<Integer> numbers = new ArrayList<>(List.of(1,2,3));
        duplicate(numbers);
        System.out.println(numbers);

        MyCustomList<String> list = new MyCustomList<>();
        list.addElement("Element 1");
        list.addElement("Element 2");
        String value = list.get(1);
        System.out.println(value);

        //1. getting any type of datatype by using T
        //2. by using get method we get particular index value

        MyCustomList<Integer> list2 = new MyCustomList<>();
        list2.addElement(Integer.valueOf(5));
        list2.addElement(Integer.valueOf(7));
        Integer number = list2.get(0);
        System.out.println(number);
    }
}
