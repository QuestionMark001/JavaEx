import java.util.Scanner;
public class MySort{

	public static void main(String[] args)
	{
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
					//交换最值，保证外层当前下标填入相对最值
					if (numbers[j]<numbers[i]) 
					{
						temp=numbers[i];
						numbers[i]=numbers[j];
						numbers[j]=temp;
					}
				}
			}
			System.out.print("升序排序为：");
			for (int i : numbers) 
			{
			
				System.out.print(+i+" ");
			}
            //关闭对象in
            in.close();
			
			
		

	}

}
