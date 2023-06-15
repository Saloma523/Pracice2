public class day13 {

    public static void main(String[] args) {

        //System.out.println(combine("Salma", "Ahmed"));

       int frequency =frequencyOfWord("Java java jAvA", "java");
        System.out.println(frequency);
    }


    public static String combine(String one , String two){

        return one + two;


    }

    public static int frequencyOfWord(String sentence, String word){


        sentence = sentence.toLowerCase();
       word = word.toLowerCase();

        sentence =sentence.replace(" ","");

       int startLength = sentence.length();

       sentence = sentence.replace(word,"");

       int endLength = sentence.length();


        return (startLength - endLength) / word.length();



    }

}
