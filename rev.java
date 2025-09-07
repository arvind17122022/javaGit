public class rev {

    public static void main(String[] args) {
        // Declare variables before using them
        String real = "Jenkins";   // original string
        String rev = "";           // will hold the reversed string

        // Reverse string using loop
        for (int i = real.length() - 1; i >= 0; i--) {
            rev = rev + real.charAt(i);
			System.out.println("Reversed string = " + rev);
        }

        
    }
}
