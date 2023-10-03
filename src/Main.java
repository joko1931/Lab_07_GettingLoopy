public class Main
{
    public static void main(String[] args)
    {
        for(int a=0; a < 31; a++)
        {
            System.out.println(a);

        }
        System.out.println("\n");

        for(int b=30; b > -1; b--)
        {
            System.out.println(b);
        }
        System.out.println("\n");

        for(int c=0; c < 19 ; c+= 3)
        {
            System.out.println(c);
        }
        System.out.println("\n");

        for(int d=10; d > -1; d-= 2)
        {
            System.out.println(d);
        }
        System.out.println("\n");

        for (int e = 0; e < 6; e++)
        {
            for (int numStars = 0; numStars < 6 - Math.abs(5 - e); numStars++)
            {
                System.out.print("*");
            }
            System.out.println();
        }

    }
}