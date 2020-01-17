package com.clown.handler;


public class Client {
    public static void main(String[] args) {
        CrossOriginHandler crossOriginHandler  = new CrossOriginHandler();
        TokenHandler tokenHandler = new TokenHandler();
        AuthHandler authHandler = new AuthHandler();
        crossOriginHandler.setNext(tokenHandler);
        tokenHandler.setNext(authHandler);
    }
}
