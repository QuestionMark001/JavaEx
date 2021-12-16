public class Circulate {
    public static void main(String[] args){
        
        int num,wordToken=0;//定义num用作输出的数字，wordToken用来控制变量num每行输出的个数
        for(num = 100;num <= 999;num++){  //for循环从100遍历到999
            if(num/100%10 + num/10%10 + num%10 == 15){
                wordToken++;  //当100到999之间各数字之和为15时，wordToken自增1，并
                System.out.printf();

                if(wordToken == 10){
                    System.out.print("\n");
                    wordToken = 0;
                }
            }


        }

    }
    
}
