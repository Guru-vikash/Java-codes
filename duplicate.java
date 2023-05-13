public class duplicate {
    public static void main(String args[])
    {
        int a[]={10,100,30,40,50,40,100};
        for(int i=0;i<a.length;i++)
        {
            for(int j=i+1;j<a.length;j++)
            {
                if(a[i]==a[j])
                {
                    a[i]=-1;
                }
            }  
        }
        System.out.print("Removed duplication array is =");
        for(int i=0;i<a.length;i++)
        {
            if(a[i]!=-1)
            {
                System.out.print(" "+a[i]);
            }
            
        }
    }
}
