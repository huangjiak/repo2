package com.ithec.demo;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class DemoOutputStream01 {
    public static void main(String[] args) throws IOException {
        FileOutputStream fos = new FileOutputStream("myByte\\fos.txt");

        //写数据
        for (int i = 0; i < 10; i++) {
            fos.write("hello".getBytes());
            fos.write("\r\n".getBytes());
        }

        //释放资源
        fos.close();
    }
}
