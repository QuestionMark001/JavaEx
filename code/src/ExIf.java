public class ExIf{
    public static void main(String[] args) {
        int a=2,b=-1,c=2;

        if(a<b)
            if(b<0) c=0;
        else c++;
        
        System.out.println(c);
    }
}

/*
 *  在没有花括号标识范围的情况下else找的是离他最近的if
 * 所以第二个if和else是同一组的判断语句，都属于第一个if的执行语句，由于第一个判断条件不满足，所以下面的都不执行，直接打印c，打印结果就是2
 * 来源：https://ask.csdn.net/questions/7630119?weChatOA=&spm=1005.2026.3001.5622
 */