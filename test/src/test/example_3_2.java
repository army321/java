package test;
//这个示例讲的是实例方法和类方法
public class example_3_2 {

	public static void main(String[] args) {
		Point p1,p2,p3;
		p1 = new Point();
		p2 = new Point(40,50);
		p3 = new Point(p1.getX()+p2.getX(), p1.getY()+p2.getY());
		System.out.println("p3.x = " + p3.getX() + " p3.y = " + p3.getY());
		Point p4 = new Point(p1.x, p2.y);
		System.out.println("p4.x = " +p4.getX() + " p4.y = "+p4.getY() );
		System.out.println("有point对象"+Point.pointNum() + "个");
		
		People ps = new People();
		ps.speak();
	}
}

class Point{
	int x,y;
	static int pCount= 0;
	Point(){
		x = 10;
		y = 20;
		pCount++;
	}
	Point(int x,int y){
		this.x = x;
		this.y = y;
		
	}
	static int pointNum() {return pCount;}
	int getX() {return x;}
	int getY() {return y;}
}

class People {
	String name = "类体重定义的name";			//类中的成员变量并赋值
 
	People(){
	}
	
	public void speak() {
		String name = "类体方法中定义的name";		//在方法speak中定义和成员变量名字相同的name并赋值
		System.out.println(name);
		System.out.println(this.name);		//通过this来访问类中的成员变量
		
	}
}
 
 
