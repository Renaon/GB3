import java.util.ArrayList;

public class Box <Fruit>{
    private ArrayList<Fruit> oranges = new ArrayList<>();
    private ArrayList<Fruit> apples = new ArrayList<>();
    private float appleWeight = 1.0f;
    private float orangeWeight = 1.5f;

    public Box(Fruit f){
        if(f instanceof Apple) apples.add(f);
        else if(f instanceof Orange) oranges.add(f);
    }

    public Fruit getApples(){
        return (Fruit) apples;
    }

    public Fruit getOranges(){
        return (Fruit) oranges;
    }

    public void showType(){
        System.out.println(oranges.getClass().getName());
    }

    public void getWeight(){
        float totalWeightOr = 0f;
        float totalWeightAp = 0f;
        for(int i=0; i<oranges.size(); i++){
            totalWeightOr += orangeWeight;
        }

        for(int i=0; i<appleWeight; i++) totalWeightAp += appleWeight;

        System.out.println("Вес коробки апельсинов: " + totalWeightOr);
        System.out.println("Вес коробки яблок: " + totalWeightAp);
    }
}
