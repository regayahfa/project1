import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
        //method Q8
        sport();
//method Q1
q1();
//method Q2
        name();
        //method Q3
        maax();
        //METHOD Q4
       AV4();
       //method Q5
        cal();
        //methodQ6
        int arr[]={6,10,23,12,15,63,99};
        int z=arr.length;
        printandarr(arr,z);
        
        //method Q7
   Q7();
    }

    //Q1
    public static void  q1() {
        System.out.println("Hello world!");
    }
    //Q2//
    public static void name(){
    String firstName = "regayah ";
    String lastName = "khalid";
System.out.println(firstName.concat(lastName));}

    //Q3
    public static void maax() {
        Scanner sc = new Scanner(System.in);
        System.out.println("entar first number: ");
        int a= sc.nextInt();
        System.out.println("entar second number: ");
        int b= sc.nextInt();
        System.out.println("entar third number: ");
        int c= sc.nextInt();
        if (a>b&&a>c){
            System.out.println(a+"is largest number :");
        }
        else if(b>a&&b>c){
            System.out.println(b+"is largest number:");
        }
        else{
            System.out.println(c+"is largest number:");
        }

    }
    //
    //
    //Q4
    public static float AV4() {
        Scanner AV = new Scanner(System.in);
        float a, b, c, avg;
        System.out.println("entar 3 numbers:");
        a = AV.nextFloat();
        b= AV.nextFloat();
        c = AV.nextFloat();
        avg=(a+b+c) /3;
        return avg;

    }
    //
    //
    //Q5
    public static void cal() {
        char calcul;
        Double num1, num2, result;
        Scanner calculator = new Scanner(System.in);
        System.out.println("operator: +, -, *, /");
        calcul = calculator.next().charAt(0);

        // ask users to enter numbers
        System.out.println("Enter first number");
        num1 = calculator.nextDouble();

        System.out.println("Enter second number");
        num2 = calculator.nextDouble();
        switch (calcul) {
            case '+':
                result = num1 + num2;
                System.out.println(num1 + " + " + num2 + " = " + result);
                break;
            case '-':
                result = num1 - num2;
                System.out.println(num1 + " - " + num2 + " = " + result);
                break;
            case '*':
                result = num1 * num2;
                System.out.println(num1 + " * " + num2 + " = " + result);
                break;
            case '/':
                result = num1 / num2;
                System.out.println(num1 + " / " + num2 + " = " + result);
                break;

            default:
                System.out.println("Invalid operator!");
                break;
        }
        calculator.close();

    }
    //
    //
    //Q6
    public static void printandarr(int arr[],int a){
        for (int i=0;i<a;i++){
            int z;
            for (z=0;z<i;z++) if(arr[i]==arr[z])
                    break;
            if(i==z)
                System.out.println(arr[i]+" ");
        }
    }

    //
    //
    //Q7
    public static void Q7(){
    String str = "MY NAME IS REGAYAH";
    str = str.toLowerCase();
    int count = 0;
    for (int i = 0; i < str.length(); i++) {
        if (str.charAt(i) == 'r' || str.charAt(i) == 'a' || str.charAt(i) == 'm' || str.charAt(i) == 'l' || str.charAt(i) == 'u') {
            count++;
        }
    }
        System.out.println("Total:"+ count);}

//Q8
    //
    //
    public static void sport(){

String s = "I want to walk my dog";
    String[] arr = s.split(" ");

for ( String ss : arr) {
        System.out.println(ss);
    }}



}