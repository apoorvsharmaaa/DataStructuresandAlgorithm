package Leetcode.top_interview_150;

public class Leetcodee151 {
    public static void main(String[] args) {
      String  s = "the sky is blue";
        System.out.println(reverseWords(s));
    }
    public static String reverseWords(String s) {
        String ans ="";
        String[] words = s.trim().split(" +");
        for (int i= words.length-1; i>=0;i--)
        {
            ans+=words[i];
            if(i!=0)
                ans+=" ";
        }
        return ans;
    }
}
