import java.util.*;
public class CylinderVol{

	public static void main(String[] args){

		Scanner scan = new Scanner(System.in);

		System.out.println("计算圆柱体积");
		
		//定义变量并输入
		System.out.print("请输入高：\n");
		double h = scan.nextDouble();
		System.out.print("请输入半径：\n");
		double r = scan.nextDouble();
		
		//运算
		double vol = Math.PI*r*r*h;

		//输出
		System.out.println("圆柱的体积为"+vol);

		//关闭对象scan
		scan.close();
		
	}
}
