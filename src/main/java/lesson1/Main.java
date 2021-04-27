package lesson1;

import java.util.*;

public class Main {
    private static Random r;

    public static void main(String[] args){
        LinkedList<Integer> arr = new LinkedList<Integer>();
        r = new Random();
        for(int i = 0; i<10; i++){
            arr.add(r.nextInt(101));
            System.out.print(arr.get(i) + " ");
        }
        System.out.println();
        replace(arr);
        toArrayList();
        boxes();
    }

    private static void replace(LinkedList arr){
        System.out.println("Какие элементы хотите поменять местами? Укажите индексы");
        Scanner scanner = new Scanner(System.in);
        int first = scanner.nextInt();
        int second = scanner.nextInt();

        int tmp = (int) arr.get(first-1);
        arr.set((first-1), arr.get(second-1));
        arr.set((second-1), tmp);

        for (int i = 0; i<arr.size(); i++) System.out.print(arr.get(i) + " ");
    }

    private static void toArrayList(){
        Integer[] arr = new Integer[10];
        for(int i = 0; i<10; i++){
            arr[i] = r.nextInt(101);
            System.out.print(arr[i] + " ");
        }
        System.out.println();
        ArrayList<Integer> newList = new ArrayList<>(arr.length);
        Collections.addAll(newList, arr);
        for (int i = 0; i< arr.length; i++) System.out.print(newList.get(i) + " ");
    }

    private static void boxes(){
        Box<Orange> orangeBox = new Box<>();
        orangeBox.add(new Orange());
        orangeBox.add(new Orange());
        orangeBox.add(new Orange());
        orangeBox.add(new Orange());
        orangeBox.add(new Orange());
        orangeBox.add(new Orange());
        System.out.println("Вес коробки: " + orangeBox.getWeight());

        Box<Apple> appleBox = new Box<>();
        appleBox.add(new Apple());
        appleBox.add(new Apple());
        appleBox.add(new Apple());
        appleBox.add(new Apple());
        appleBox.add(new Apple());
        appleBox.add(new Apple());
        appleBox.add(new Apple());
        appleBox.add(new Apple());

        System.out.println(orangeBox.compare(appleBox));

        Box<Orange> orangeBox1 = new Box<Orange>();
        orangeBox1.add(new Orange());
        orangeBox1.add(new Orange());
        orangeBox1.add(new Orange());
        orangeBox1.add(new Orange());
        orangeBox1.add(new Orange());

        orangeBox.addAll(orangeBox1);
    }
}
