public class Armstrong {

    public static void main(String[] args) {

        int number = 395, originalNumber, remainder, result = 0;

        originalNumber = number;

        while (originalNumber != 0)
        {
            remainder = originalNumber % 10;
            result += Math.pow(remainder, 3);
            originalNumber =originalNumber/10;
        }
        System.out.println("The sum of thecubes of digits =="+result);  
        if(result == number)
            System.out.println(number + " is an Armstrong number.");
        else
            System.out.println(number + " is not an Armstrong number.");
    }
}
