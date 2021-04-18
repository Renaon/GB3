import java.util.ArrayList;
import java.util.Collections;

public class Box <T extends Fruit>{
    private final ArrayList<T> fruits = new ArrayList<>();

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
        float oneWeight = fruits.get(0).getWeight();

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
