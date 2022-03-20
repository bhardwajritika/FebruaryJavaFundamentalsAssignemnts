package assignment25;

class Vehicles{
    int tyres=2;
    int horn;
    int model=111;
    int VId;
    
     Vehicles()
    {
        
        System.out.println("I have "+ tyres+ "tyres");
        System.out.println("my model number "+ model);
    }
    
    Vehicles(int tyres, int model)
    {
        this.tyres = tyres;
        this.model= model;
        
        System.out.println("I have "+ tyres+ "tyres");
        System.out.println("my model number "+ model);
    }
    
    public int getVehicleID()
    {  
        return VId;
    }  
    public void setVehicleID(final int VId)
    {  
        this.VId = VId;
    }  
    
    public static void speed(){
        System.out.println("I am fast...");
    }
    public static void break1 (){
        System.out.println("I have break");
    }
    public static void passenger(){
        System.out.println("I can carry passenger");
    }
}


public class Vehicle {
    public static void main(String args[]) {
      Vehicles bike = new Vehicles();
      bike.setVehicleID(123);
      Vehicles car = new Vehicles(4,222);
        car.setVehicleID(567);
      Vehicles truck = new Vehicles(6, 333);
       truck.setVehicleID(987);
      
      
    }
}
