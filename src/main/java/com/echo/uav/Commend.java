package com.echo.uav;

import java.util.Scanner;

public class Commend {
	public static String commed() {
		Scanner sc = new Scanner(System.in);
		System.out.println("请输入需要派遣的任务：");
		System.out.println("单个任务用;隔开，任务参数用#号隔开：");
		System.out.println("比如：1#无人机1号#上海#131.142#2019-02-22 05:30:00#1;2#无人机2号#上海#131.142#2019-02-22 05:30:00#2");
		String name = sc.nextLine();

		return name;
	}
}
