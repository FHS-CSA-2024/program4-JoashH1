import java.util.Scanner; //This imports the console scanner that reads user input

//Your code here:
    class Program3 {
        public static void main(String[] args) {
            Scanner myScanner = new Scanner(System.in);
            
            int num1 = 0;
            int num2 = 0;
            int num3 = 0;
            int num4 = 0;
            int sum = num1+num2+num3+num4;
            
            
            
            //Ask for user input
            System.out.println("Please enter first number:");
            num1=myScanner.nextInt();
            
            System.out.println("Please enter second number:");
            num2=myScanner.nextInt();
            
            System.out.println("Please enter third number:");
            num3=myScanner.nextInt();
            
            System.out.println("Please enter fourth number:");
            num4=myScanner.nextInt();
            //Get input
            sum = num1+num2+num3+num4;
            System.out.println("The sum of the numbers is" + sum);
            
            
            //Calculate
            
            //Output
            
        }
    }
