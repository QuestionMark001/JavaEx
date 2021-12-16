public class Circulate {
    public static void main(String[] args){
        
        int num,wordToken=0;//定义num用作输出的数字，wordToken用来控制变量num每行输出的个数
        for(num = 100;num <= 999;num++){  //for循环从100遍历到999
            if(num/100%10 + num/10%10 + num%10 == 15){
                wordToken++;  //当100到999之间各数字之和为15时，wordToken自增1
                System.out.printf("%-5d",num);  //以左对齐，5字符宽格式化输出变量num

                if(wordToken == 10){  //当wordToken为10时换行，此时一行输出了10个num变量，
                    System.out.print("\n");  //换行
                    wordToken = 0;  //将0赋值给wordToken,开始下一行输出
                }
            }


        }

    }
    
}
