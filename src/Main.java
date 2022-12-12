import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int math,physic,chemistry,english,music,history;
        Scanner inp = new Scanner(System.in);

        System.out.println("***AVERAGE GRADE CALCULATION***");

        System.out.println("Math. Grade : ");
        math = inp.nextInt();

        System.out.println("Physic Grade : ");
        physic = inp.nextInt();

        System.out.println("Chemistry Grade : ");
        chemistry = inp.nextInt();

        System.out.println("English Grade : ");
        english = inp.nextInt();

        System.out.println("Music Grade : ");
        music = inp.nextInt();

        System.out.println("History Grade : ");
        history = inp.nextInt();

        int sum = math+physic+chemistry+english+music+history;
        double average = sum/6.0;

        System.out.println("Average Grade : " + average);

        //Comparison without if
        String str = (average>=60)? "Passed:)" : "Failed:(";
        System.out.println("Final Case :" + str);

    }
}