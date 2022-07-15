import java.util.Scanner;
//이 문제에는 표준 입력으로 두 개의 정수 n과 m이 주어집니다.
//별(*) 문자를 이용해 가로의 길이가 n, 세로의 길이가 m인 직사각형 형태를 출력해보세요.
//https://school.programmers.co.kr/learn/courses/30/lessons/12969

public class Quiz1 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt(); //콘솔창에 숫자 작성
        int b = sc.nextInt(); //콘솔창에 숫자 작성

        for (int i = 0; i < b; i++) { //띄어쓰기 구간
            for (int j = 0; j < a; j++) { //별 체크구간
                System.out.print("*"); //print = 띄어쓰기가 안됨
            }
            System.out.println(); // println = 띄어쓰기
        }


    }
}

