import java.util.ArrayList;
import java.util.Collections;

public class Box <T extends Fruit>{
    private ArrayList<T> fruits = new ArrayList<>();
    private float appleWeight = 1.0f;
    private float orangeWeight = 1.5f;

//    public Box(Fruit f){
//        fruits.add(f);
//    }

    public ArrayList<T> getFruits(){
        return fruits;
    }

    public void add(T f){
        fruits.add(f);
    }

    private int getLength(){
        return fruits.size();
    }

    public void showType(){
        System.out.println(fruits.getClass().getName());
    }

    private T get(int i){
        return fruits.get(i);
    }

    private void remove(int i){
        fruits.remove(i);
    }


    public Float getWeight(){
        float totalWeight = 0f;
        float oneWeight = 0f;
        if(fruits.get(0) instanceof Apple) oneWeight = appleWeight;
        else if(fruits.get(0) instanceof Orange) oneWeight = orangeWeight;

        for(int i=0; i<fruits.size(); i++){
            totalWeight += oneWeight;
        }

        return totalWeight;
    }

    public boolean compare(Box f){
        return this.getWeight().equals(f.getWeight());
    }

    public void addAll(Box<T> f){
        for(int i = 0; i<f.getLength(); i++){
            fruits.add(f.get(i));
            f.remove(i);
        }
    }
}
