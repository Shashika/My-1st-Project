abstract class Animal{

     abstract void shout();
     abstract void run();
     void sleep(){
         System.out.println("Sleeping");
     }
    
}

class Dog extends Animal{

    private String dog="Dog";
    
    @Override
    void shout() {
        System.out.println(""+dog+" is barking");
    }

    @Override
    void run() {
        System.out.println(""+dog+" is running");
    }

}

class Cat extends Animal{

    private String cat="Cat";
    
    @Override
    void shout() {
        System.out.println(""+cat+" is mearwing");
    }

    @Override
    void run() {
        System.out.println(""+cat+" is running");
    }

}

public class JavaForGit1 {
    
    public static void main(String[] args){
        
        Animal dog=new Dog();
        dog.shout();
        dog.run();
        dog.sleep();
        
        Animal cat=new Cat();
        cat.shout();
        cat.run();
        cat.sleep();
    }
    
}
