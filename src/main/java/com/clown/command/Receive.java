package com.clown.command;

public class Receive {

    private Command command;

    public Command  receiveCommand(Command  command){
         this.command =   command;
         return this.command;
    }
}
