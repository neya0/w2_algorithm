class Solution {
    public String solution(String s) {
        int leng = s.length()/2;
        
        String result = 
            s.length() % 2 == 0 ? 
            s.substring(leng -1, leng +1) : s.substring(leng, leng +1);
        
        return result;
    }
    
    public static void main(String[] args){
        Solution go = new Solution();
        System.out.print(go.solution("power"));
    }
}