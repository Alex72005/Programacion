package FunctionsPackage;
public class FunctionsLib {
    public static boolean IsCapicua (int x) {
        return x == Flip(x);
    }

    public static boolean IsPrime (int x) {
        for (int i = 2; i <= x ; i++) {
            if (x % i == 0) {
                return true;
            }
        }
        return false;
    }

    public static int Digits (int x) {
        String sx = Integer.toString(x);
        return sx.length();
    }

    public static int Flip (int x) {
        int flip = 0;
        while (x != 0) {
            flip = flip * 10 + x % 10;
            x = x / 10;
        }
        return flip;
    }

    public static int DigitN (int x, int y) {
        int a[] = IntToArray(x);
        return a[y];
    }

    public static int DigitPosition (int x, int y) {
        int a[] = IntToArray(x);
        String sx = Integer.toString(x);
        for (int i = 0; i <= (sx.length() - 1); i++) {
            if(a[i] == y) {
                return i;
            }
        }
        return -1;
    }

    public static int RemoveByBehind (int x, int y) {
        int a[] = IntToArray(x);
        String sx = Integer.toString(x);
        int n = 0;
        int count = 0;
        for (int i = sx.length() - y - 1; i >= 0; i--) {
            int exp = (int) Math.pow(10, count);
            n += (a[i] * exp);
            count++;
        }
        return n;
    }

    public static int PasteByBack (int x, int y) {
        String sx = Integer.toString(x);
        String sy = Integer.toString(y);
        return Integer.parseInt(sx + sy);
    }

    public static int NumberSnippet (int x, int y, int z) {
        int temp;
        if (y > z) {
            temp = z;
            z = y;
            y = temp;
        }
        int a[] = IntToArray(x);
        int n = 0;
        int count = 0;
        for (int i = z; i >= y; i--) {
             int exp = (int) Math.pow(10, count);
             n += (a[i] * exp);
             count++;
        }
        return n;
    }

    public static int NumbersTogether (int x, int y) {
        return PasteByBack(x, y);
    }

    public static int[] IntToArray (int x) {
        x = Flip(x);
        String sx = Integer.toString(x);
        int a[] = new int[sx.length()];
        int i = 0;
        while (x != 0) {
            a[i] = x % 10;
            x = x / 10;
            i++;
        }
        return a;
    }
}
