public class multiplicationmatrix {
    public static void main(String args[])
    {
        int a[][]={{2,3},{5,7}};
        int b[][]={{3,7},{10,4}};
        int c[][];
        c =new int[2][2];
        
        for(int i=0;i<a.length;i++)
        {
            for(int j=0;j<b.length;j++)
            {
                c[i][j]=0;
                for(int k=0;k<2;k++)
                {
                    c[i][j]=c[i][j]+a[i][k]*b[k][j];
                }
            }
        }
        System.out.println("The mutliplication of the array is =");
        for(int i=0;i<a.length;i++)
        {
            for(int j=0;j<b.length;j++)
            {
                System.out.print(c[i][j] +"\t");
            }
            System.out.println();
        }
    }
}

