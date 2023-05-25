package com.lakers.io;

import java.io.File;

/**
 * Created on 2023/5/6 15:49
 *
 * @author lakers
 */
public class FileTest {

    public static void main(String[] args) throws Exception {
        File file = new File("/Users/lakers/desktop/挖咖3.7上线文档-刘元龙.txt");
        System.out.println(file.isFile());


        File newFile = new File("/Users/lakers/desktop/挖咖3.8上线文档-刘元龙.txt");
        if (newFile.createNewFile()) {
            // 文件创建成功！
            System.out.println("新文件创建成功");
            System.out.println(newFile.isFile());

        }

        File tempFile = File.createTempFile("temp", ".txt");
        System.out.println(tempFile.isFile());
        System.out.println(tempFile.getAbsolutePath());
    }
}
