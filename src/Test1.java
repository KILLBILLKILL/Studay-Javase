public class Test1 {
    public static void main(String[] args) {
        printStar(6);
        System.out.println();
        System.out.println("========================");
        printStar(10);
    }
    static void printStar(int number)
    {
        for(int i=0;i<number-1;i++)
        {
            for(int j=0;j<number-1-i;j++)
            {
                System.out.printf(" ");
            }
           if(i==0)
           System.out.printf("*");
           else
           {
               System.out.printf("*");
               for(int k=0;k<2*i-1;k++)
               {
                   System.out.printf(" ");
               }
               System.out.printf("*");
           }
            System.out.println();

        }
        for(int i=0;i<2*number-1;i++)
        {
            System.out.printf("*");
        }
    }
}
