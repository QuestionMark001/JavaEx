import java.util.*;
public class MyDate {
    public static void main(String[] args)
	{
		Scanner in = new Scanner(System.in);
		System.out.println("请输入年份：");
		int year, month, day;
		year = in.nextInt();
		if( year % 4 == 0)
		{//年份为闰年
			System.out.println("请输入月份：");
			int yeara = year;//yeara为闰年
			month = in.nextInt();
			if( month > 0 && month < 13) 
			{//月份输入正确
				
				if(  month == 1 | month == 3 | month == 5 | month == 7 | month == 8 | month == 10 | month == 12) 
				{
					System.out.println("请输入日期：");
					day = in.nextInt();
					//月份是1，3，5，7，8，10，12的情况
					if( day < 32 && day > 0)
					{
						System.out.println("输入正确！您输入的日期是："+yeara+"年"+month+"月"+day+"日");
					}else 
					{
						System.out.println("日期输入错误！");
					}
				}else if(month == 2) 
				{//月份是2月的情况
					System.out.println("请输入日期：");
					day = in.nextInt();
					if (day < 30 && day > 0) 
					{
						System.out.println("输入正确！您输入的日期是："+yeara+"年"+month+"月"+day+"日");
					}else 
					{
						System.out.println("日期输入错误！");
					}	
				}else if(  month == 4 | month == 6 | month == 9 | month ==11 )
				{//月份是4，6，9，11的情况
					System.out.println("请输入日期：");
					day = in.nextInt();
					if (day < 31 && day > 0) 
					{
						System.out.println("输入正确！您输入的日期是："+yeara+"年"+month+"月"+day+"日");
					}else 
					{
						System.out.println("日期输入错误！");
					}
				}else 
				{//月份是>31的情况下
					System.out.println("日期输入错误！");
				}
			}else
			{//月份输入错误
				System.out.println("输入错误！");
			}
			
		}else 
		{//年份为平年
			System.out.println("请输入月份：");
			int yearb = year;//yearb为平年
			month = in.nextInt();
			if( month > 0 && month < 13) 
			{//月份输入正确
				
				if(   month == 1 | month == 3 | month == 5 | month == 7 | month == 8 | month == 10 | month == 12) 
				{
					System.out.println("请输入日期：");
					day = in.nextInt();
					//月份是1，3，5，7，8，10，12的情况
					if( day < 32 && day > 0)
					{
						System.out.println("输入正确！您输入的日期是："+yearb+"年"+month+"月"+day+"日");
					}else 
					{
						System.out.println("日期输入错误！");
					}
				}else if(month == 2) 
				{//月份是2月的情况
					System.out.println("请输入日期：");
					day = in.nextInt();
					if (day < 29 && day > 0) 
					{
						System.out.println("输入正确！您输入的日期是："+yearb+"年"+month+"月"+day+"日");
					}else 
					{
						System.out.println("日期输入错误！");
					}	
				}else if(  month == 4 | month == 6 | month == 9 | month ==11 )
				{//月份是4，6，9，11的情况
					System.out.println("请输入日期：");
					day = in.nextInt();
					if (day < 31 && day > 0) 
					{
						System.out.println("输入正确！您输入的日期是："+yearb+"年"+month+"月"+day+"日");
					}else 
					{
						System.out.println("日期输入错误！");
					}
				}else 
				{//月份是>31的情况下
					System.out.println("日期输入错误！");
				}
			}else
			{//月份输入错误
				System.out.println("输入错误！");
			}
		}
        //关闭对象in
        in.close();
		
		

	}
    
}
