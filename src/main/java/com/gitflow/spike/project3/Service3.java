package com.gitflow.spike.project3;


import com.gitflow.spike.common.Util;
import com.gitflow.spike.project1.Service;
import com.gitflow.spike.project2.Service2;

/**
 * Created by Javier on 11/01/2017.
 */
public class Service3 {

    Service service;

    Service2 service2;

    public Service3(){
        service = new Service();
        service2 = new Service2();
    }

    public void  execute(){
        Util.print();
        service.execute();
        service2.execute();
        System.out.println("Hey!!");
    }
}
