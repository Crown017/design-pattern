package com.clown.handler;

public abstract class Handler {
    private Handler handler;

    public void setNext(Handler handler){
        this.handler = handler;
    }

    public void invokeNext(){
        if (this.handler != null) {
            handler.service();
        }
    }

    public abstract void service();
}
