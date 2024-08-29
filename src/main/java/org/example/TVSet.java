package org.example;

public class TVSet {
//    boolean isCreated = false;
    private static volatile TVSet tvSetInstance = null;
    private static Object lock = new Object();
    private TVSet(){
        System.out.println("TV set instantiated");
    }

    public synchronized static TVSet getTVSetInstance() {
        if(tvSetInstance==null){
            synchronized(lock) {
                if(tvSetInstance==null){
                    tvSetInstance=new TVSet();
                }
            }
        }
        return tvSetInstance;
    }
    // class have one instance of class
    // class  can be instantiated only one
    // singleton pattern

}
