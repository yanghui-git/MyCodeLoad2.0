package com.yh.file;

import org.apache.commons.codec.digest.DigestUtils;
import org.apache.commons.io.FileUtils;
import org.junit.Test;

import java.io.File;
import java.io.FileInputStream;
import java.util.Arrays;
import java.util.List;

//commons-io的一些用法
public class FileUtil {

    @Test
    //inputStream 变成file
    public void test() throws Exception {
        FileInputStream fileInputStream = new FileInputStream(new File("D:\\TSBrowserDownloads", "1.txt"));
        org.apache.commons.io.FileUtils.copyInputStreamToFile(fileInputStream, new File("D:\\TSBrowserDownloads", "2.txt"));
    }

    @Test
    //文件删除
    public void test2() throws Exception {
        // new File("D:\\TSBrowserDownloads","1").delete();2
        FileUtils.forceDeleteOnExit(new File("D:\\TSBrowserDownloads", "1"));
    }

    @Test
    //文件复制
    public void test3() throws Exception {
        FileUtils.copyToFile(new FileInputStream(new File("D:\\TSBrowserDownloads", "1.txt")), new File("D:\\TSBrowserDownloads", "3.txt"));
        ;
    }

    @Test
    //文件写入
    public void test4() throws Exception {
        List<String> test = Arrays.asList(new String[]{"1", "222", "yhhj"});
        FileUtils.writeLines(new File("C:\\Users\\Administrator\\Desktop\\程序员\\", "1.txt"), test);
    }

    @Test
    //文件读取
    public void test5() throws Exception {
        System.out.print(FileUtils.readLines(new File("C:\\Users\\Administrator\\Desktop\\程序员\\", "1.txt")));
    }

    @Test
    /**
     * 文件Md5值
     *  https://www.cnblogs.com/pcheng/p/7724863.html
     *  1 更改文件名不会影响md5
     *  2更改内容如增加空格会影响
     */
    public void test6() throws Exception {
        /**
         * md5 步骤
         * 1获取文件byte信息
         * 2通过java自带MessageDigest加密
         * 3转为16进制md5
         */
        String md5 = DigestUtils.md5Hex(new FileInputStream("/Users/hui.yang/Desktop/Ago/222.txt"));
        System.out.println(md5);
        String md6 = DigestUtils.md5Hex(new FileInputStream("/Users/hui.yang/Desktop/Ago/444.txt"));
        System.out.println(md6);
        System.out.println(md5.equals(md6));
    }

}
