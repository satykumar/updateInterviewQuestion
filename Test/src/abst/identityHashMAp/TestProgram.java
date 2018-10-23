package abst.identityHashMAp;

public class TestProgram {
public static void main(String[] args) {
    int result=0;
    int[] numbers = {1,2,3,4,5,6,7,8,9, 11,12};
    result= sumofnatural(10)-sumofmissing(numbers);
   
}

static int sumofmissing(int n[])
{int sum=0;
    for(int i=0;i<= n.length;i++)
        
     sum=sum+n[i];
    return sum;
}






static int sumofnatural(int n)
{
    int sum1=n*(n=1)/2;
    return sum1;
}

}

