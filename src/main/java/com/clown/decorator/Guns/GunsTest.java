package com.clown.decorator.Guns;

public class GunsTest {
    public static void main(String[] args) {
        Component component = new TimesScope8( new ClipDecorator(new ConcreteComponent()));
        component.shot();
    }
}
