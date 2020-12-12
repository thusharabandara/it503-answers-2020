class Q3
{
    public static void main(String[] args)
    {
        int num = 30;
        int factorial = 1;

        for (int i = 1; i <= num; i++)
        {
            factorial *= i;
        }
        System.out.println("Factorial of " + num + ": " + factorial);
    }
}