
//Java program to find the number is even or odd and to check whether the number is greater than 25
import java.util.ArrayList;
class To_Check_Even
{
    public static void main(String[] args) {
        int[] a={8,5,10,14,9,1,3,4};
        int sum=0,sum1=0;
        ArrayList<Integer> al1=new ArrayList<>();
        ArrayList<Integer>  al2= new ArrayList<>();

        for(int i=0; i<a.length; i++)
        {
            if(a[i]%2==0)
            {
                al1.add(a[i]);
            }
            else
            {
                al2.add(a[i]);
            }
        }

        //To check whether the array number is even
        System.out.println("Even numbers are");
        for(int no:al1)
        {
            System.out.println(no+" ");
            sum=sum+no;
        }

        //find the sum of odd number is greater than 25
        System.out.println("The sum of the even numbers are  \n"+sum);
        if(sum >25)
        {
            System.out.println("Yep!! The sum is Greater than 25");
        }
        else
        {
            System.out.println("The Sum of the even numbers is lesser than 25 ('_')");
        }


        // TO find Array number is odd
        System.out.println("\n");
        System.out.println("Odd numbers are");
        for(int no:al2)
        {
            System.out.println(no+" ");
        }

        //find the sum of odd number is greater than 25
        System.out.println("The sum of the even numbers are  \n"+sum1);
        if(sum1 >25)
        {
            System.out.println("Yep!! The the sum is Greater than 25"+sum1);
        }
        else
        {
            System.out.println("The Sum of the odd numbers is lesser than 25 ('_')");
        }

    }
}