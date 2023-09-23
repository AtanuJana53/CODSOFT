import java.util.Scanner;

public class StudentGradeCalculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
         System.out.println("\n\n\t.....STUDENT GRADE CALCULATOR.....\n");
        System.out.println("Enter the marks of Subject-1: ");
        double sub1 = sc.nextInt();
        System.out.println("Enter the marks of Subject-2: ");
        double sub2 = sc.nextInt();
        System.out.println("Enter the marks of Subject-3: ");
        double sub3 = sc.nextInt();
        System.out.println("Enter the marks of Subject-4: ");
        double sub4 = sc.nextInt();
        System.out.println("Enter the marks of Subject-5: ");
        double sub5 = sc.nextInt();
        CalculateGrade grade = new CalculateGrade();
        grade.calculate(sub1, sub2, sub3, sub4, sub5);
        sc.close();
    }

}

class CalculateGrade {
    int subject1;
    int subject2;
    int subject3;
    int subject4;
    int subject5;

    public void calculate(Double sub1, Double sub2, Double sub3, Double sub4, Double sub5) {
        double percentage = (sub1 + sub2 + sub3 + sub4 + sub5) / 5;
        double total = sub1 + sub2 + sub3 + sub4 + sub5;
        System.out.println("\nYour Total marks out of 500 are : ");
        System.out.println(total);
        System.out.println("\nYour Percentage : ");
        System.out.println(percentage + " %");
        System.out.println("\nYour Grade is : ");
        if (percentage >= 90)
            System.out.println("Grade O ");
        else if (percentage < 90 && percentage >= 80)
            System.out.println("Grade E ");
        else if (percentage < 80 && percentage >= 70)
            System.out.println("Grade A ");
        else if (percentage < 70 && percentage >= 60)
            System.out.println("Grade B ");
        else if (percentage < 60 && percentage >= 50)
            System.out.println("Grade C ");
         else if (percentage < 50 && percentage >= 40)
            System.out.println("Grade D ");
        else {
            System.out.println("Grade F/FAILED");
        }
        System.out.println("[ O = Outstanding, E = Excellent, A = Very Good, B = Good, C = Average, D = Below Average ]");
    }

}

