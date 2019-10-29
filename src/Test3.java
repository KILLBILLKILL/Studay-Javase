import java.util.Scanner;
public class Test3{
    static String Zodiac(int number)
    {
        String ss=null;
        int val=number%12;
        switch(val)
        {
            case 0:
                ss="猴";
                break;
            case 1:
                ss="鸡";
                break;
            case 2:
                ss="狗";
                break;
            case 3:
                ss="猪";
                break;
            case 4:
                ss="鼠";
                break;
            case 5:
                ss="牛";
                break;
            case 6:
                ss="虎";
                break;
            case 7:
                ss="兔";
                break;
            case 8:
                ss="龙";
                break;
            case 9:
                ss="蛇";
                break;
            case 10:
                ss="马";
                break;
            case 11:
                ss="羊";
                break;
        }
           return ss;
    }
    public static void main(String[] args) {
        System.out.println("请输入某个人的出生日期");
        Scanner scanner=new Scanner(System.in);
        int number=scanner.nextInt();
       String se=Zodiac(number);
        System.out.println("这个人的生肖是：  ");
        System.out.println(se);
    }
}
