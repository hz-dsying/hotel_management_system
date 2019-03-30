package day05.hotel;

import java.util.Scanner;

public class HotelManagement {
	public static void main(String[] args) {
		// 创建控制台读取对象
		Scanner console = new Scanner(System.in);
		// 创建一个酒店
		Hotel hotel = new Hotel();
		// 1.欢迎页面
		System.out.println("欢迎进入"+hotel.name+"管理系统");
		// 2.系统提示 - 指令
		loop: while (true) {
			System.out.println("请输入指令：show查看，in入住，out退房，exit退出");
			// 读取控制台输入指令
			String command = console.nextLine();
			switch (command) {
			case "show":
				hotel.show();
				break;
			case "in":
				String name = console.nextLine();
				int number = console.nextInt();//302
				int a = number / 100 - 1;
				int b = number % 100 - 1;
				hotel.rooms[a][b].guest = new Guest(name);
				break;
			case "out":
				//302
				int number1 = console.nextInt();//302
				int c = number1 /100 - 1;
				int d = number1 % 100 - 1;
				hotel.rooms[c][d].guest = null;
				break;
			case "exit":
				// 3种结束方式
				// 强制退出（1）
				System.exit(0);
				// 方法结束（2）
				return;
				// 结束死循环（3）
				// break loop;
			default:
				System.out.println("指令有误，请重新输入！");
				break;
			}
		}

	}
}
