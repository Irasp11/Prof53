package org.example.Homework_Algoritms;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Random;


public class ArrayListVsLinkedList {
//    2. ArrayList vs. LinkedList. Напишите метод, который добавляет 1000000 элементов в ArrayList и LinkedList.
//    Напишите еще один метод, который выбирает из заполненного списка элемент наугад 100000 раз.
//    Замерьте время, которое потрачено на это.
//    Сравните результаты и предположите, почему они именно такие.

    public static void addMillion(List <Integer> list){
        for (int i = 0; i < 1000000; i++) {
            list.add(i);
        }
    }
    public static int[] getRandomElements(List <Integer> list){
        Random random = new Random();
        int[]array = new int[100000];
        for (int i = 0; i < array.length; i++) {
            int index = random.nextInt(0, list.size());
            array[i] = index;
        }
        return array;
    }

    public static void main(String[] args) {
        List <Integer> arrayList = new ArrayList<>();
        List <Integer> linkedList = new LinkedList<>();

        ArrayListVsLinkedList.addMillion(arrayList);
        ArrayListVsLinkedList.addMillion(linkedList);

        long startTime = System.currentTimeMillis();
        getRandomElements(arrayList);
        long endTime = System.currentTimeMillis();
        System.out.println(endTime-startTime);

        long startTime2 = System.currentTimeMillis();
        getRandomElements(linkedList);
        long endTime2 = System.currentTimeMillis();
        System.out.println(endTime2-startTime2);

    }
}
