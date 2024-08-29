package org.example2;

public class Samosa {
    // constructor

    private static Samosa samosa;

    private Samosa(){

    }

    // Lazy way of creating singleton object
    public static Samosa getSamosa(){
        // Object of  this call
        if (samosa==null){
            synchronized (Samosa.class){
                if (samosa==null){
                    samosa = new Samosa();
                }
            }
        }
        return samosa;
    }

    // contructor must be private
    // object create with help of the new method or factory method
    // create field to store object is private
}
