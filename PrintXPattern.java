public class PrintXPattern 
{
        public static void main(String[] args) 
	{
            int i, j;
            for (i = 1; i <= 5; i++) 
	    {
                for (j = 1; j <= 5; j++) 
                {
                    if (j == i) 
                    {
                        System.out.print("*");
                    } else if (j == 5 - (i - 1)) 
                    {
                        System.out.print("*");
                    } else 
                    {
                        System.out.print(" ");
                    }
                }
                System.out.println();
            }
        }
    }