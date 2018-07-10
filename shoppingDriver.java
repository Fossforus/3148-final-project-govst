public class shoppingDriver{
    //This is the driver class the collobarates all the other class.
    
    public static void main(String[] args){
        Product p1 = new Product("Razor","Shaving razor", "regular", 10, 1);
       
        System.out.println(p1.getName());
    }
}