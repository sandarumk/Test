// changes made to dog.java

package test100285c;

public class Dog extends Animal {
    public String type;
    
    @Override
    public void eat(){
        System.out.println(name+" is eating!");
    }
    @Override
    public void roam(){
        System.out.println(name+" is walking..");
       
    }
    @Override
    public void sound(){
        System.out.println(name+" is barking!! Buh Buh!");
    }
}
