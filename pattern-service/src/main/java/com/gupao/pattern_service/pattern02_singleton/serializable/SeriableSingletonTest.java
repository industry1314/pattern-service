package com.gupao.pattern_service.pattern02_singleton.serializable;

import java.io.*;

public class SeriableSingletonTest {

    public static void main(String[] args) throws Exception {
        SeriableSingleton instance = SeriableSingleton.getInstance();
        
        FileOutputStream fileOutputStream = new FileOutputStream("D://SeriableSingleton");
        ObjectOutputStream objectOutputStream = new ObjectOutputStream(fileOutputStream);
        objectOutputStream.writeObject(instance);
        objectOutputStream.flush();
        objectOutputStream.close();

        FileInputStream fileInputStream = new FileInputStream("D://SeriableSingleton");
        ObjectInputStream objectInputStream = new ObjectInputStream(fileInputStream);
        Object instance2 = objectInputStream.readObject();
        objectInputStream.close();

        System.out.println(instance);
        System.out.println(instance2);
        System.out.println(instance == instance2);
    }
}
