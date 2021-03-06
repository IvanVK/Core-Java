import java.util.HashMap;

public class Favourites {

    private HashMap<Class<?>, Object> favourites;
    
    public Favourites() {
        this.favourites = new HashMap<>();
    }

    public <T> T get(Class<T> class1) {
        return class1.cast(this.favourites.get(class1));
    }
    
    public <T> void add(Class<T> classType, T element) {
        this.favourites.put(classType, element);
    }



}