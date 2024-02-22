import java.util.Random;

public class ejercicioBucles
{
    public static void main(String[] args)
    {
        final var random = new Random();
        int n = RandomUtilities.generarRandomInt(20,5,random);
        numHastan(n);
        inparesHastan(n);
        cuentaRegresiva(n);
        }

    private static void cuentaRegresiva(int n) {
        for (int i = n; i > 0; i--) {
            System.out.println(i);
        }
        System.out.println();
    }

    static void numHastan (int n)
        {
        for (int i = 1; i < n; i++) {
            System.out.println(i);
        }
            System.out.println();
            }
            static void inparesHastan(int n)
            {
                for (int i = 1; i < n; i++)
                {
                   if (i % 2 != 0)
                   { System.out.println(i);
                   }
                }
                System.out.println();
            }

}
