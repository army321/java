package test;
//��̬
//�������
class Shape{
	float area() {return 0.0f;}
}
class Circle extends Shape{
	float R;
	Circle(float r)	{
		R =r;
	}
	float area() {
		return 3.1415926f * R * R;
	}

}

class Rectangel extends Shape{
	float W,H;
	Rectangel(float w,float h){
		this.W= w;
		this.H =h;
	}
	float area() {
		return W * H;
	}
}
public class example3_4 {

	public static void main(String[] args) {
		Circle c;
		Rectangel r;
		c = new Circle(1.0f);
		r = new Rectangel(3.0f, 4.5f);
		System.out.println("circle area is :" + returnArea(c)); //��Ч�ڣ��������ֵ���ʱ�ṩ�Ĳ��������Ͳ���������˳���ڱ���ʱ����ȷ�������õķ�����		System.out.println("circle area is :" + c.area());
		System.out.println("Rectangel area is :" + returnArea(r));// 		System.out.println("Rectangel area is :" + r.area());


	}
	static float returnArea(Shape s) {
		return s.area();
	}

}
