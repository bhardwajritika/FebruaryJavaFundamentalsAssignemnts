package assignment27;

class Animal{
    int legs;
    String name;
    String size;
    
    Animal(){
        
    }
    
    Animal(int legs, String name, String size){
        
        System.out.println(legs);
        System.out.println(name);
        System.out.println(size);
        
    }
    
}

public class animal {
    public static void main(String [] args){
    Animal cat = new Animal();
    Animal dog = new Animal(4,"dog", "small");
    Animal elephant = new Animal(4, "elephant", "very big");
    Animal cow = new Animal(4, "cow", "big");
    

    
    }
}