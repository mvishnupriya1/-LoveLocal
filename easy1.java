//Given a string s consisting of words and spaces, return the length of the last word in the string.
//A word is a maximal
//substring consisting of non-space characters only.

public class wordcount {
    public static void main(String[] args) {
        String str="luffy is still joyboy";
        System.out.println(count(str));

    }
    static int count(String Str){
       String str=Str.trim();
        int count=0;

        for(int i=str.length()-1;i>=0;i--)
        {
            if(str.charAt(i)!=' ')
            {
                count++;
            }
            else
                break;
        }
        return count;
    }
}
