package com.neusoft.file;

import sun.dc.pr.PathStroker;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.attribute.FileAttribute;

public class TestNIO {

    public static void main(String[] args) {
//        Path path = Paths.get("C:/windows");
//        System.out.println("文件节点数:" + path.getNameCount());
//        System.out.println("文件名称:" + path.getFileName());
//        System.out.println("文件根目录:" + path.getRoot());
//        System.out.println("文件上级关联目录:" + path.getParent());

        try {

            //Path path = Files.createDirectories(Paths.get("e:/aaa/bbb"));
            //Files.createFile(Paths.get("e:/aaa/bbb/kk.txt"));
            Files.copy(Paths.get("e:/aaa/bbb/kk.txt"), Paths.get("e:/aaa/ccc/kk.txt"));
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}
