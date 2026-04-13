/* 
Write a java program to display following pattern:
5
4 5
3 4 5
2 3 4 5
1 2 3 4 5 
*/
class Q7
{
    public static void main(String[] args) {
        int n=5;
        for(int i=n;i>0;i--)
        {
            for(int j=i;j<=n;j++)
            {
                System.out.print(j+"");
            }
            System.out.println();
        }
    }
}