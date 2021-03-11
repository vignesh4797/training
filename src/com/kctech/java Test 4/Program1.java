import java.util.Arrays;

class Program1 {
    public static void main (String[] firstWords, String[] secondWords) {
        for (int i = 0; i < firstWords.length; i++) {
            
            char[] s0 = firstWords[i].toCharArray();
            char[] s1 = secondWords[i].toCharArray();
            
            Arrays.sort(s0);
            Arrays.sort(s1);
            
            if (Arrays.equals(s0, s1))
                System.out.println("1");
            else
                System.out.println("0");
        }
    }
}