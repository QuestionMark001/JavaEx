public class SumVol{
    public static void main(String[] args){

        //定义变量n为100，结果sum为double类型
        int n = 100;
        double sum = 0;
        for(int a = 1;a <= n;a++){  //for循环让分母从1累加到100
            sum += 1.0/a;  //sum = sum + 1.0/a,从1加到1/100
        }
        System.out.print("n=100,sum=" + sum);  //输出
    }
}