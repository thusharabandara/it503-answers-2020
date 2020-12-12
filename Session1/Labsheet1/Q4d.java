class Q4d
{
    public static void main(String[] args)
    {
        int number = 7;
        int count = number - 1;
        for (int i = 1; i <= number; i++)
        {
            for (int j = 1; j <= count; j++)
            {
                System.out.print(" ");
            }
            count--;
            for (int j = 1; j <= (2 * i) - 1; j++)
            {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}