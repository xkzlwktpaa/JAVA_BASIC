package day3;

import java.util.Scanner;

public class Day3Operator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("첫번째 숫자를 입력해주세요: ");
        int num1 =  sc.nextInt();
        System.out.print("두번째 숫자를 입력해주세요: ");
        int num2 = sc.nextInt();
//        System.out.println("덧셈: " + (num1 + num2));
//        System.out.println("뺄셈: " + (num1 - num2));
//        System.out.println("곱셈: " + (num1 * num2));
//        System.out.println("나눗셈 " + (num1 / num2));
//        System.out.println("나머지: " + (num1 % num2));



//        // 비교 연산
//        System.out.println("두 값이 같은가요? " + (num1 == num2));
//        System.out.println("두 값이 다른가요? " + (num1 != num2));
//        System.out.println("첫 번째 값이 두번째 값보다  큰가요? " + (num1 > num2));
//        System.out.println("첫 번째 값이 두 번째 값보다 작은가요? " + (num1 < num2));
//        System.out.println("첫 번째 값이 두 번째 값보다 크거나 같은가요? " + (num1 >= num2));
//        System.out.println("첫 번째 값이 두 번째 값보다 작거나 같은가요? " + (num1 <= num2));


//        // 논리 연산
//        System.out.println("첫 번째 값이 10보다 크고 두 번째 값이 20보다 작은가요? " + (num1 > 10 && num2 < 20));
//        System.out.println("첫 번째 값이 10보다 크거나 두 번째 값이 20보다 작은가요? " + (num1 > 10 || num2 < 20));
//        System.out.println("첫 번째 값이 10보다 크지 않나요? " + !(num1 > 10));



//        //증감 연산
//        int n = 1;
//        System.out.println("n++ (후위 증가): " + n++);
//        System.out.println("n (증가 후): " + n);
//        System.out.println("++n (선위 증가): " + ++n);
//        System.out.println("n-- (후위 감소): " + n--);
//        System.out.println("n (감소 후): " + n);
//        System.out.println("--n (선위 감소): " + --n);



        // 대입 연산자
        System.out.print("초기 숫자를 입력하세요: ");
        int num = sc.nextInt();

        num +=  5; // num = num + 5
        System.out.println("num += 5 -> " + num);

        num -= 3; // num = num - 3
        System.out.println("num -= 3 -> " + num);

        num *= 2; // num = num * 2
        System.out.println("num *= 2 -> " + num);

        num /= 4; // num = num / 4
        System.out.println("num /= 4 -> " + num);

        num %= 3; // num = num % 3
        System.out.println("num %= 3 -> " + num);




    }
}
