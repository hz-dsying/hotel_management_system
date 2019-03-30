package day05.hotel;
// 酒店类
public class Hotel {
	// 名字
	String name;
	// 很多个房间 Room
	Room[][] rooms;
	public Hotel() {
		name = "指针信息大酒店";
		// 设定酒店架构
		rooms = new Room[6][8];
		// 造房间 i表示每层楼 - 房间装修
		for(int i = 0; i < rooms.length; i++) {
			// j表示一层楼里的房间数
			for(int j = 0; j < rooms[i].length; j++) {
				// 创建一个新的房间，并且加入到酒店中
				// 第i层的 第j个房间	0,0 -> 101
				int number = (i + 1) * 100 + j + 1;
				rooms[i][j] = new Room(number);
			}
		}
	}
	// 显示所有房间的入住信息
	public void show() {
		for(int i = 0; i < rooms.length; i++) {
			for(int j = 0; j < rooms[i].length; j++) {
				int number = (i + 1) * 100 + j + 1;
				System.out.print(number + "\t");
			}
			System.out.println();
			for(int k = 0; k < rooms[i].length; k++) {
				if(rooms[i][k].guest == null) {
					System.out.print(rooms[i][k].guest + "\t");
				}else {
					System.out.print(rooms[i][k].guest.name + "\t");
				}

			}
			System.out.println();
		}
	}
	public void in(String name, int number) {
		
	}
	public void out(String number) {
		
	}
	
	
}
