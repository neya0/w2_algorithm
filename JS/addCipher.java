
/*자연수 N이 주어지면, N의 각 자릿수의 합을 구해서 return 하는 solution 함수를 만들어 주세요.
예를들어 N = 123이면 1 + 2 + 3 = 6을 return 하면 됩니다.*/


public class addCipher {




    public int solution(int n) {
        int answer = 0;
        String number = String.valueOf(n);
        char[] numCharArr = number.toCharArray();

        for(int num =0; num < numCharArr.length; num++){
            answer += Character.getNumericValue(numCharArr[num]);
        }

        return answer;
    }





    public int solution2(int n) {
        int answer = 0;
        String number = String.valueOf(n);
        char[] numCharArr = number.toCharArray();

        for(int num =0; num < numCharArr.length; num++){
            answer += numCharArr[num] - '0';
        }

        return answer;
    }



    public static void main(String[] args) {
        addCipher go = new addCipher();
        System.out.println(go.solution2(123));
    }
}
