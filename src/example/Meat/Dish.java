package example.Meat;

/**
 * Created by Legat on 6/13/2016.
 */
public class Dish {
    private String name;
    private long complexity;

    public Dish(String name, long complexity) {
        this.name = name;
        this.complexity = complexity;
    }

    public long getComplexity() {
        return complexity;
    }
}
