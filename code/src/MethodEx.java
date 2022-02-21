public class MethodEx {
    public static void main(String[] args) {
        char a = '9',b = '8',c = '7';
        System.out.println(fun(fun(a,b),fun(b,c)));
    }

    static char fun (char x,char y) { //封装
            //fun是函数名，上一行括号里的x和y是形式参数（即为形参）
            if (x<y) return x;return y;
    }
}
