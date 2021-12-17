import java.util.*;
public class MySubscript {
    
    public static void main(String[] args){

		Scanner in = new Scanner(System.in);
		System.out.print("请输入数组长度: ");
		int count =  in.nextInt();
		//初始化并且用户输入共多少个数，决定开多少个数组格子

		//输入数组元素
			int[] numbers = new int [count];
			System.out.println("数组长度为："+numbers.length);
			System.out.println("请输入数组元素  中间用空格隔开");

			for(int i=0; i<numbers.length ;i++)
			{//for刚刚好的循环
				numbers [i]  = in.nextInt();

			}
			int temp;
			for (int i = 0; i < numbers.length-1; i++) 
			{
				// 对高于外层当前下标的所有下标进行遍历比较
				for (int j = i+1; j < numbers.length; j++) 
				{
					// 升序排列为a[j]<a[i]
					
					if (numbers[j]<numbers[i]) 
					{
						//交换最值
						temp=numbers[i];
						numbers[i]=numbers[j];
						numbers[j]=temp;
					}
				}
			}
			int max = numbers[0];
	        int index = 0;
	        for (int i = 1; i < numbers.length; i++) {
	            if (max < numbers[i]){
	                max = numbers[i];
	                index = i;
	            }
	        }
	        System.out.println("数组的最大值为：");
	        System.out.println(max);
	        
	        System.out.println("数组的最大值对应的下标为：");
	        System.out.println("numbers"+"["+index+"]");

            //关闭对象in
            in.close();
		

	}
}
