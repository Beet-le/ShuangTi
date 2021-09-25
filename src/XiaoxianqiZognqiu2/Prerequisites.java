package XiaoxianqiZognqiu2;

import java.util.Scanner;

/*
 * 具体需求：1.如果男孩有房，有车，直接嫁程序结束
 * 2.如果男孩只有车or只有房，女孩暂时不嫁给男孩,接下来要看女孩是否愿意等
 * 3.如果不愿意等程序结束；如果愿意等待那么男孩的年薪要>10万，感情值要>8才能嫁（感情值增加的方法是每年生日有送花和礼物，如果没有送就减少，
 * 	同时女生的年龄会增加1岁，当女生年龄>28岁了，男生就算达到年薪10万，程序也结束，感情减少到0时，程序也结束）默认男孩年薪每年增加1万
 * 4.age<28 && girlsLoverCount>8  才能嫁
 */
public class Prerequisites {
	Scanner sc = new Scanner(System.in);
	Body body = new Body();
	Girl girl = new Girl();
	/*
	 * { System.out.println("男孩是否有房?"); // 不能直接写在类里，用{}
	 * body.setBoyHasHouse(sc.nextBoolean()); System.out.println("男孩是否有车?");
	 * body.setBoyHasCar(sc.nextBoolean()); System.out.println("女孩的初始感情值?");
	 * girl.setGirlsLoverCount(sc.nextInt()); }
	 */
	
	public boolean prerequisites() {
		System.out.println("男孩是否有房?"); // 不能直接写在类里，用{}
		body.setBoyHasHouse(sc.nextBoolean());
		boolean house = body.getBoyHasHouse();
		
		System.out.println("男孩是否有车?");
		body.setBoyHasCar(sc.nextBoolean());
		boolean car = body.getBoyHasCar();
		
		System.out.println("男孩的幸福感（年薪）是多少万?");
		body.setBoySalary(sc.nextInt());	// 万为单位
		int salary = body.getBoySalary();	// 获取初始年薪，并赋值给salary
		
		System.out.println("女孩的初始感情值是多少？");
		girl.setGirlsLoverCount(sc.nextInt());
		int lovecount = girl.getGirlsLoverCount();
		
		System.out.println("你希望女孩几岁了？");
		girl.setAge(sc.nextInt());
		int age = girl.getAge();  // 获取初始年龄并赋值给age
		
		if(body.getBoyHasHouse() == true && body.getBoyHasCar() == true) {
			System.out.print("房子：" + house + ",车子：" + car +",女孩" + age + "岁了，");
			System.out.println("对男孩的好感值是" + lovecount + ",男孩年薪" + salary + "万。");
			System.out.println("我条件还不错吧！咋俩结婚吧，我可以养活你！！");
			return true;
		} else if(body.getBoyHasHouse() == true || body.getBoyHasCar() == true) {
			System.out.println("女孩是否愿意等待：");
			girl.setGirlsCanWaite(sc.nextBoolean());
			/*
			 * 3.如果不愿意等程序结束；如果愿意等待那么男孩的年薪要>10万，感情值要>8才能嫁（感情值增加的方法是每年生日有送花和礼物，如果没有送就减少，
			 * 	同时女生的年龄会增加1岁，当女生年龄>28岁了，男生就算达到年薪10万，程序也结束，感情减少到0时，程序也结束）默认男孩年薪每年增加1万
			 */
			for(int i=age;i <= 40;i++) {	// 单位：年,因为不知道初始年龄是闰年还是平年，所以就统一按平年算365天
				if(girl.getGirlsCanWaite() == true && age <= 28) {		// 愿意等待,28岁后就结束
					if(body.getBoySalary() >= 10 && lovecount >= 8) {
						System.out.print("房子：" + house + ",车子：" + car +",女孩" + age + "岁了，");
						System.out.println("对男孩的好感值是" + lovecount + ",男孩年薪" + salary + "万。");
						System.out.println("条件满足，可嫁!!");
						return true;
					}	else if(lovecount == 0) {
						System.out.print("房子：" + house + ",车子：" + car +",女孩" + age + "岁了，");
						System.out.println("对男孩的好感值是" + lovecount + ",男孩年薪" + salary + "万。");
						System.out.println("你会遇见更好的！！");
						return false;
					} /*
						 * else { return false; }
						 */
				} else {	// 不愿意等待
					System.out.print("房子：" + house + ",车子：" + car +",女孩" + age + "岁了，");
					System.out.println("对男孩的好感值是" + lovecount + ",男孩年薪" + salary + "万。");
					System.out.println("你是好人！！");
					return false;
				}
				
				System.out.println("女孩" + age + "岁了，是否送玫瑰花？");
				body.setBoyGiveFlower(sc.nextBoolean());
				if(body.getBoyGiveFlower() == true) {
					lovecount++;
				} else {
					lovecount--;
				}
				
				age++;
				salary++;
			}
		}
		return true;
	}
}
