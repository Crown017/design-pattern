package com.clown.decorator.io;

import java.io.BufferedInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.InputStream;

public class IoTest {
    public static void main(String[] args) throws Exception {
        InputStream bis = new BufferedInputStream(new FileInputStream(new File("/home/user/abc.txt")));
        bis.read();
    }
}
