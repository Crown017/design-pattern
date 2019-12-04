package com.clown.command;

public class Client {

    private Receive receive;

    public void send(Command command){
        receive.receiveCommand(command);
    }

}
