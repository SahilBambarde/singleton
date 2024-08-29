package org.example;

import java.lang.reflect.Executable;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class Main {
    public static void main(String[] args) {
//        TVSet tvSet1ForMember1 = new TVSet();
//        // family with only one tv set
//
//        TVSet tvSet2 = new TVSet();
//
//        System.out.println(tvSet1ForMember1);
//        System.out.println(tvSet2);

//        TVSet tvSet = TVSet.getTVSetInstance();
//        TVSet tvSet1= TVSet.getTVSetInstance();
//        System.out.println(tvSet);
//        System.out.println(tvSet1);

        ExecutorService executorService = Executors.newFixedThreadPool(2);
        executorService.execute(TVSet::getTVSetInstance);
        executorService.execute(TVSet::getTVSetInstance);
        executorService.execute(TVSet::getTVSetInstance);
        executorService.execute(TVSet::getTVSetInstance);
        executorService.execute(TVSet::getTVSetInstance);
        executorService.execute(TVSet::getTVSetInstance);
    }
}