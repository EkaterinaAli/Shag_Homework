package homework24;

public class HeavyBox {
    int weight;
    public HeavyBox(){weight = 0;}
    public HeavyBox(int weight){this.weight = weight;}
       public String toString (){return "Box weight " + weight + " ";}
    public int getWeight() { return weight;  }
    public void setWeight(int weight) {
        this.weight = weight;
    }
    }