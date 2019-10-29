public class Test2 {
    public void multiplicationTable(){
        int i=1;
        while(i<10)
        {
            int j=1;
            while(j<=i)
            {
                System.out.printf(i+"*"+j+"="+i*j+"  ");
                j++;

            }
            System.out.println();
            i++;
        }
    }

    public static void main(String[] args) {
        Test2 test2=new Test2();
        test2.multiplicationTable();

    }
}
