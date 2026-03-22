import java.util.Scanner;

class BasicMathsConcept {

    // 1. Count digits
    public static int countDigits(int n){
        if (n == 0) return 1;
        int cnt = 0;
        while (n > 0){
            n = n / 10;
            cnt++;
        }
        return cnt;
    }

    // 2. Reverse number
    public static int reverseNum(int n){
        int revNum = 0;
        while (n > 0){
            int id = n % 10;
            revNum = (revNum * 10) + id;
            n = n / 10;
        }
        return revNum;
    }

    // 3. Palindrome check
    public static boolean palindromeNum(int n){
        int revNum = 0;
        int dup = n;

        while (n > 0){
            int id = n % 10;
            revNum = (revNum * 10) + id;
            n = n / 10;
        }
        return dup == revNum;
    }

    // 4. Armstrong number
    public static boolean isArmstrong(int n){
        int sum = 0;
        int dup = n;

        while(n > 0){
            int id = n % 10;
            sum = sum + (id * id * id);
            n = n / 10;
        }
        return sum == dup;
    }

    // 5. Print divisors
    public static void divisor(int n){
        for(int i = 1; i <= n; i++){
            if(n % i == 0){
                System.out.print(i + " ");
            }
        }
        System.out.println();
    }

    // 6. Prime check
    public static boolean primeNum(int n){
        if(n <= 1) return false;

        for(int i = 2; i * i <= n; i++){
            if(n % i == 0){
                return false;
            }
        }
        return true;
    }

    // 7. GCD / HCF
    public static int gcd(int a, int b){
        while(a > 0 && b > 0){
            if (a > b){
                a = a % b;
            } else {
                b = b % a;
            }
        }
        return (a == 0) ? b : a;
    }

    // MAIN METHOD (single entry point)
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int n = sc.nextInt();

        System.out.println("Digits: " + countDigits(n));
        System.out.println("Reversed: " + reverseNum(n));
        System.out.println("Palindrome: " + palindromeNum(n));
        System.out.println("Armstrong: " + isArmstrong(n));
        System.out.print("Divisors: ");
        divisor(n);
        System.out.println("Prime: " + primeNum(n));

        System.out.print("Enter two numbers for GCD: ");
        int a = sc.nextInt();
        int b = sc.nextInt();
        System.out.println("GCD: " + gcd(a, b));
    }
}