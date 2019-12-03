package com.clown.decorator.Guns;


public class TimesScope8 extends Decorator {
    public TimesScope8(Component component) {
        super(component);
    }

    @Override
    public void shot() {
        super.shot();
        this.addScope();
    }

    public void  addScope(){
        System.out.println("带8倍镜");
    }
}
