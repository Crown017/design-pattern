package com.clown.singleton;

public class FinalMinister {
    public FinalMinister() {
    }

    private static final FinalMinister finalMinister = new FinalMinister();

    public static FinalMinister getInstance(){
        return finalMinister;
    }

}
