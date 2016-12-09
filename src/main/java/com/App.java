package com;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 * Title: App.java Description:
 * 
 * @author 龚梁钧
 * @created Dec 9, 2016 8:16:57 PM
 */

public class App {
	public static void main(String[] args) {
		System.out.println("请输入日期：(YYYY-mm-DD)");
		Scanner sc = new Scanner(System.in);
		String s = sc.nextLine();

		List<Integer> day_30 = new ArrayList<Integer>();
		day_30.add(4);
		day_30.add(6);
		day_30.add(9);
		day_30.add(11);

		String[] strings = s.split("-");
		int year = Integer.parseInt(strings[0]);
		int month = Integer.parseInt(strings[1]);
		int day = Integer.parseInt(strings[2]);

		int days = 0;
		for (int i = 1; i < month; i++) {
			if (i == 2) {
				if (year % 4 == 0 && year % 400 == 0) {
					days += 29;
				} else {
					days += 28;
				}
			} else if (day_30.contains(i)) {
				days += 30;
			} else {
				days += 31;
			}
		}

		days += day;
		System.out.print("你输入的日期为当年的第" + days + "天");
	}
}