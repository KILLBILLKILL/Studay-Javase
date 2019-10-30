import java.util.ArrayList;
import java.util.List;
public class Test {
    //求两个字符串数组的逆序排序
    static void characterarray(String [] a,String [] b)
    {
      String []c=new String[a.length+b.length];
      int k=0;
      for(int i=0;i<a.length;i++)
      {
          c[i]=a[i];
          k++;
      }
      for(int n=0;n<b.length;n++)
      {
          c[k]=b[n];
          k++;
      }
        reversesort(c);
      display(c);
    }
    static void sort(String a[])
    {
        for(int i=0;i<a.length;i++)
        {
            for(int j=0;j<a.length-i-1;j++)
            {
                if(a[j].compareTo(a[j+1])>0) {
                    String temp = a[j + 1];
                    a[j + 1] = a[j];
                    a[j] = temp;
                }
            }
        }
    }
    static void reversesort(String a[])
    {
        for(int i=0;i<a.length;i++)
        {
            for(int j=0;j<a.length-i-1;j++)
            {
                if(a[j].compareTo(a[j+1])<0) {
                    String temp = a[j + 1];
                    a[j + 1] = a[j];
                    a[j] = temp;
                }
            }
        }
    }
    static void display(String [] a)
    {
        for(int i=0;i<a.length;i++)
        {
            System.out.println(a[i]);
        }
    }
    static void display2(int  [] a)
    {
        for(int i=0;i<a.length;i++)
        {
            System.out.println(a[i]);
        }
    }
    //求两个整形数组的交集
    static void intersection (int arr[], int arr2[])
    {
        intsort(arr);
        intsort(arr2);
        List<Integer> list=new ArrayList<>();
        int j=0,i=0;
        while( i<arr.length&& j<arr2.length)
        {
            if(arr[i]==arr2[j]) {
                list.add(arr[i]);
                do {
                    i++;
                } while (i < arr.length-1 && arr[i] == arr[i + 1]);
                do {
                    j++;
                } while (j < arr2.length-1&& arr2[j] == arr2[j + 1]);
                continue;
            }
            else if(arr[i]>arr2[j])
        {
            j++;
            continue;
        }
            else if(arr[i]<arr2[j])
            {
                i++;
                continue;
            }
        }
        for(int x=0;x<list.size();x++)
        {
            System.out.println(list.get(x));
        }
    }

    static void intsort(int arr[])
    {
        for(int i=0;i<arr.length;i++)
        {
            for(int j=0;j<arr.length-1-i;j++)
            {
                if(arr[j]>arr[j+1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
    }
    static void union(double b[],double c[])
    {
        List<Double> list=new ArrayList<>();
        for(int i=0;i<b.length;i++)
        {
            if(!list.contains(b[i]))
                list.add(b[i]);
        }
        for(int j=0;j<c.length;j++)
        {
            if(!list.contains(c[j]))
                list.add(c[j]);
        }
        for(int x=0;x<list.size();x++)
        {
            System.out.println(list.get(x));
        }
    }
    static void doublesort(double arr4[])
    {
        for(int i=0;i<arr4.length;i++)
        {
            for(int j=0;j<arr4.length-1-i;j++)
            {
                if(arr4[j]>arr4[j+1])
                {
                    double temp=arr4[j];
                    arr4[j]=arr4[j+1];
                    arr4[j+1]=temp;
                }
            }
        }
    }
    public static void main(String[] args) {
        String arr1[]={"ab","df","cd","xy","yzq","sde","gdffdgi"};
        String arr2[]={"ab","asdsad","juhghhsjss"};
        System.out.println("两个字符串数组的逆序排序");
        characterarray(arr1,arr2);
        System.out.println("==============");
        System.out.println("求两个整型数组的交集");
        int arr4[]={1,5,4,2,5,5,5,12,8};
        int arr3[]={8,5885,25,25,5,4,7,1,3,6,5};
        intersection (arr4,  arr3);
        System.out.println("==============");
        System.out.println("求两个浮点数组的并集");
        double arr6[]={2.0,6.2,52.1,355.222,25252,21462.21266262,25.262};
        double arr7[]={2.2525,1.2626,2.595,4.225,92.5929,5.629};
        union(arr6,arr7);
    }
}
