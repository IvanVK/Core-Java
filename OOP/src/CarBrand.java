
public class CarBrand {
    private String brand;
    
    public String toString(){
        return this.brand + "@" + super.toString(); 
    }
    
    public CarBrand(String brand)
    {
        this.brand = brand;
    }
    
    public static void main(String[] args) {
        CarBrand car = new CarBrand("AUDI");
        System.out.println(car.toString());
    }
}