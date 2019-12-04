package com.clown.decorator.Guns;

public class ClipDecorator extends Decorator {

    public ClipDecorator(Component component) {
        super(component);
    }

    @Override
    public void shot() {
        super.shot();
        this.kuoRong();
    }

    public void kuoRong(){
        System.out.println("带扩容的");
    }
}
