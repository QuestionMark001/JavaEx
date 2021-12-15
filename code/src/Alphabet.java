import java.util.*;
public class Alphabet{
	
	public static void main(String[] args){
		
		Scanner scan = new Scanner(System.in);

		System.out.println("请输入一个字符：");

		//定义字符为word
		char word = scan.next().charAt(0);
		
		//if条件循环判断，输出结果
		if(word>='a' && word<='z'){
			System.out.println("您输入的是小写字符");
		}else if(word>='A' && word<='Z'){
			System.out.println("您输入的是大写字符");
		}else if(word>='0' && word<='9'){
			System.out.println("您输入的是数字字符");
		}else{
			System.out.println("您输入的是其他字符");
		}

		//关闭对象scan
		scan.close();
	}
}