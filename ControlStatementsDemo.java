public class ControlStatementsDemo {
    public static void main(String[] args) {

        //demonstration of working of different control flow statements and loops

        //check if the number is even or odd
        int n = 5;
        if(n % 2 == 0) {
            System.out.print(n + " is even.\n");
        } else {
            System.out.print(n + " is odd.\n");
        }
        n = 6;
        if(n % 2 == 0) {
            System.out.print(n + " is even.\n");
        } else {
            System.out.print(n + " is odd.\n");
        }

        System.out.print("\nList of primes in [1,100]:\n");

        //for-loop can be used when we know the iteration is definite in terms of range and increments
        for(int i = 1 ; i <= 100 ; ++i) {
            
            boolean isPrime = true;
            if(i > 1) {
                for(int j = 2 ; j <= Math.sqrt(i) ; ++j) {
                    if( i % j == 0 ) {
                        isPrime = false;
                        break;
                    }
                }
            } else {
                isPrime = false;
            }
            if(isPrime)
                System.out.print(i + " ");
        }

        System.out.println("\n\nRange of [1,100] with linear increase of 1 in gaps:");
        //while-loop can be used when we are not sure about the loop range and incrementation
        int k = 1;
        int inc = 0;
        while(k <= 100) {
            System.out.print(k + " ");
            ++k;
            k += (++inc);   
        }
        System.out.println("\n");

        //switch case and for-each loop
        String[] alphabets = {"a","b","c","d","e","f","g","h","i","j","k","l","m","n","o","p","q","r","s","t","u","v","w","x","y","z"};
        int vowels = 0, consonants = 0;
        for(String alpha : alphabets) {
            switch(alpha.charAt(0)) {
                case 'a':   ++vowels;
                            break;
                case 'e':   ++vowels;
                            break;
                case 'i':   ++vowels;
                            break;
                case 'o':   ++vowels;
                            break;
                case 'u':   ++vowels;
                            break;
                default:    ++consonants;
            }
        }
        System.out.println("There are " + vowels + " vowels and " + consonants + " consonants in english alphabets.");
    }
}