package com.clown.adapter_pattern.demo;


public class ApiAdapter  extends XMlApiAdaptee implements ApiTarget {
    @Override
    public Object login() {
        return super.responseXML();
    }
}
