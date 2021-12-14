import java.util.*;
public class CylinderVol{

	public static void main(String[] args){

		double h,r,vol;//定义变量
		Scanner scan = new Scanner(System.in);

		System.out.println("计算圆柱体积");
		
		//输入
		System.out.print("请输入高：\n");
		h = scan.nextDouble();
		System.out.print("请输入半径：\n");
		r = scan.nextDouble();
		
		//运算
		vol = Math.PI*r*r*h;

		//输出
		System.out.println("圆柱的体积为"+vol);

		//关闭对象scan
		scan.close();
		
	}
}
