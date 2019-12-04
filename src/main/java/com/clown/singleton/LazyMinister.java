package com.clown.singleton;

public class LazyMinister {

    private String userName;

    public String getUserName() {
        return userName;
    }

    private  static Object object = new Object();

    private static LazyMinister singletonLazyMinister = null;

    private LazyMinister(String userName){
        this.userName = userName;
    }

    /**
     * 懒汉式
     *
     * 为了保证线程的安全必须要加锁
     * @return
     */
    public static LazyMinister getInstance(){

        synchronized (object) {

            if (singletonLazyMinister == null) {
                singletonLazyMinister = new LazyMinister("朱元璋");
                return singletonLazyMinister;
            }
            return singletonLazyMinister;
        }
    }


    public static void main(String[] args) {
        LazyMinister lazyMinister = LazyMinister.getInstance();
        System.out.println(lazyMinister.getUserName());
    }

}
