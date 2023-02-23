package Day6;

// Chapter 6
public class StringPlay {

    public static boolean isDoubloon(String s){

        for (int i = 0; i < s.length(); i++){
            for (int j = 0; j < s.length(); j++) {
                if (s.charAt(i) == s.charAt(j)){
                    return true;
                }
                // TODO finish as a study problem.
            }
        }

        return true;}





    public static boolean isAbecedarian(String s){
        s.toLowerCase();

        for (int i = 0; i < s.length() - 1; i++) {
            if (s.charAt(i) >= s.charAt(i+1)) {
                return false;
            }
        }



        return true;
    }




    public static int countVowels(String s) {
        s = s.toLowerCase();
        int count = 0;

        // Python: for i in  range(len(s)):

        // Java:
        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);

            if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
                count++;

            }
        }
    return count; }




    public static void main(String[] args) {
        String s = "Hello";
        String t = "Hippopotamus";

        // functions vs methods
        // a method is a kind of function but is called
        // on an object.
        // s is a string object. s is an instance
        // of the String class.
        System.out.println(s.length());
        System.out.println(t.length());

        // python way to get character at index 8 in t
        // [7]
        System.out.println(t.charAt(7));

        // python t[len(t) - 1]
        System.out.println(t.charAt(t.length() - 1));
        System.out.println(t.toUpperCase());

        // count vowels in string
        System.out.println(countVowels(s));
        System.out.println(countVowels(t));

        // Every character in "every language"
        // is assigned a unique integer by the
        // Unicode Consortium

        // cast (convert) 'a' to an integer
        System.out.println((int) 'a');

        // Abecedarian test
        System.out.println(isAbecedarian("biopsy"));
        System.out.println(!isAbecedarian("applesauce"));

    }

}
