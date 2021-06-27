package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
    	System.out.println("Сейчас мы умножим 2 целых числа без использования операции умножения.");
    	System.out.println("Введите первое целое число: ");
		Scanner sc = new Scanner(System.in);
		int first = sc.nextInt();
		System.out.println("Введите второе целое число: ");
		Scanner sc2 = new Scanner(System.in);
		int second = sc.nextInt();
		int result = 0;
		int count = 0;
		while (count < second) {
	    result = result + first;
	    count = count + 1;
        }

        System.out.print("Ответ: " + result);


    }
}
