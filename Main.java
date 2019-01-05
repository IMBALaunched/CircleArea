import java.util.*;

public class Main {

	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		System.out.print("请输入要输入的圆数量:");
        int n=input.nextInt();
        System.out.print("请输入各个圆的半径:");
        CircleArrayList list=new CircleArrayList();
		for(int i=0;i<n;i++) {
			double roudius=input.nextInt();
			Circle circle=new Circle(roudius);
			list.add(circle);
		}
		for(int i=0;i<n;i++) {
			System.out.println("圆"+(n+1)+"的面积是:"+list.get(i).getArea());
		}
		sort(list);
		System.out.print("面积总和为:"+list.computeArea());
	}
	public static void swap(Circle cir1,Circle cir2) {
		Circle circle3=new Circle(cir1.getRadius());
		cir1.setRadius(cir2.getRadius());
		cir2.setRadius(circle3.getRadius());
	}
	public static void sort(CircleArrayList list) {
		for(int i=0;i<list.size()-1;i++) {
			for(int j=0;j<list.size()-i-1;j++) {
				Circle cir1=list.get(j);
				Circle cir2=list.get(j+1);
				if(cir1.getRadius()>cir2.getRadius()) {
					swap(cir1, cir2);
				}
			}
		}
	}
}
