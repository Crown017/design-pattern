package com.clown.wait_notify;

import java.util.UUID;

public class Producer implements  Runnable{


    private Monitor monitor;




    public Producer(Monitor monitor) {
        this.monitor = monitor;
    }

    @Override
    public void run() {

    }

    public void produce() throws InterruptedException{
        synchronized (monitor){
            Monitor.ids.add(UUID.randomUUID().toString());
            monitor.wait();
        }
    }

}
