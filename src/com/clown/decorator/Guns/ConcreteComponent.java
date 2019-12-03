package com.clown.decorator.Guns;

public class ConcreteComponent  implements Component{
    @Override
    public void shot() {
        System.out.println("Mini41 shot");
    }
}
