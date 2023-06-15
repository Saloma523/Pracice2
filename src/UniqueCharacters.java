public class UniqueCharacters {

    public static void main(String[] args) {

        String s = "AABCCD";

        String result = "";

        for(int i = 0; i < s.length() ; i ++){
            int count = 0;
            char chi = s.charAt(i);
            for (int j = 0; j < s.length(); j++) {
                char chj = s.charAt(j);

                if(chi == chj){
                    count++;
                }
            }

            if(count == 1){
                result += s.charAt(i);
            }


        }
        System.out.println(result);
    }
}
/*
. Create a class called UniqueCharacters, Write a program that can return the unique characters from a String

	            Ex:
	                input:
	                    AABCCD

	                output:
	                    BD

 */