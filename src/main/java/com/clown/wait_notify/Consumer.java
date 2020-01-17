package com.clown.wait_notify;


public class Consumer implements Runnable{
    private Monitor monitor;

    public Consumer(Monitor monitor) {
        this.monitor = monitor;
    }

    @Override
    public void run() {
        try {
            synchronized (monitor){
                if (Monitor.ids.isEmpty()){
                    monitor.wait();
                }

            }
        }catch (InterruptedException e){
            e.printStackTrace();
        }


    }
}
