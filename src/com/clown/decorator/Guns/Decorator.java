package com.clown.decorator.Guns;

public class Decorator implements  Component {

    private Component component ;

    public Decorator(Component component) {
        this.component = component;
    }

    @Override
    public void shot() {
        component.shot();
    }
}
