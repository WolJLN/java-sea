package com.iee.lambda.buildStream;

import com.google.common.primitives.Ints;

import java.util.Arrays;
import java.util.List;
import java.util.stream.IntStream;
import java.util.stream.Stream;

/**
 * @ClassName BuildStreamDemo
 * @Description TODO
 * @Author longxiaonan@163.com
 * @Date 2019/2/20 0020 17:02
 */
public class BuildStreamDemo {
    //    获取流 通过集合系列提供的stream方法和 parallelStream()（并行流）方法获取流
    public static void test1() {
        List<Integer> list = Ints.asList(new int[]{1, 2, 3});
        // 常用获取流的方式
        Stream<Integer> stream = list.stream();
    }

    //通过Arrays.stream() 将数组转换成流
    public static void test2() {
        int[] a = new int[]{1, 2, 3, 4};
        IntStream stream = Arrays.stream(a);
        stream.forEach(b -> System.out.println(b));
    }

    //    通过Stream.of今天方法创建流
    public static void test3() {
        Stream<Integer> stream = Stream.of(1, 2, 3);
    }

    //   创建无限流
    public static void test4() {
        Stream<Integer> iterate = Stream.iterate(0, x -> x + 2);
    }

}
