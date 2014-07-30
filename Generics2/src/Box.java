
public class Box<B> {
    private B value;

    public Box() {

    }

    public Box(B value) {
        set(value);
    }
    
    public B get() {
        return this.value;
    }
    
    public void set(B value) {
        this.value = value;
    }
}