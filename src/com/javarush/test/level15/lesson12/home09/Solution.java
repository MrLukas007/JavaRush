package com.javarush.test.level15.lesson12.home09;

/* Парсер реквестов
Считать с консоли URl ссылку.
Вывести на экран через пробел список всех параметров (Параметры идут после ? и разделяются &, например, lvl=15).
URL содержит минимум 1 параметр.
Если присутствует параметр obj, то передать его значение в нужный метод alert.
alert(double value) - для чисел (дробные числа разделяются точкой)
alert(String value) - для строк

Пример 1
Ввод:
http://javarush.ru/alpha/index.html?lvl=15&view&name=Amigo
Вывод:
lvl view name

Пример 2
Ввод:
http://javarush.ru/alpha/index.html?obj=3.14&name=Amigo
Вывод:
obj name
double 3.14
*/

import java.util.ArrayList;
import java.util.Scanner;

public class Solution {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		String url = scanner.nextLine();
		String fullUrl = url;
		int a = 0;
		ArrayList<String> arrayList = new ArrayList<String>();
		int nachalo = 0;
		String subString = null;

		while (url.contains("=")) {
			if (url.contains("?")) {
				nachalo = url.indexOf('?');
			} else if (url.contains("&")) {
				nachalo = url.indexOf('&');
			}
			subString = url.substring(nachalo + 1, url.indexOf('='));
			if (subString.contains("&")) {
				arrayList.add(subString.substring(0, subString.indexOf('&')));
				arrayList.add(subString.substring(subString.indexOf('&') + 1));

			} else {
				arrayList.add(subString);
			}

			url = url.substring(url.indexOf('=') + 1);
		}

		for (int i = 0; i < arrayList.size(); i++) {
			System.out.print(arrayList.get(i) + " ");
		}

		System.out.println();

		nachalo = fullUrl.indexOf('?') + 1;


		String str = null;
		while (fullUrl.substring(nachalo).contains("obj=")) {
			nachalo = 0;
			fullUrl = fullUrl.substring(fullUrl.indexOf("obj=") + 1);

			if (fullUrl.contains("&")) {
				str = fullUrl.substring(3, fullUrl.indexOf('&'));
			} else {
				str = fullUrl.substring(3);
			}
			if (str.contains(".")) {
				alert(Double.parseDouble(str));
			} else {
				alert(str);
			}
		}
	}


	public static void alert(double value) {
		System.out.println("double " + value);
	}

	public static void alert(String value) {
		System.out.println("String " + value);
	}
}
