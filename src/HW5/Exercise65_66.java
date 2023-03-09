package HW5;

public class Exercise65_66 {
    public static boolean isDoubloon(String s){
        String lower = s.toLowerCase();
        int count = 0;

        for (int i = 0; i < lower.length(); i++) {
            for (int j = 0; j < lower.length(); j++) {
                if (lower.charAt(i) == lower.charAt(j)){
                    count++;
                    }
                }
            if (count % 2 != 0){
                return false;
                }
            }
        return true;
    }

    public static boolean canSpell(String word, String tiles){
        word = word.toLowerCase();
        tiles = tiles.toLowerCase();

        for (int i = 0; i < word.length(); i++){
            int rturn = tiles.indexOf(word.charAt(i));
            if (rturn != -1){
                tiles = tiles.substring(0,rturn) + tiles.substring(rturn + 1);
            }
            else {
                return false;
            }
        }
        return true;
    }


    public static void main(String[] args) {
        // Doubloon tests
        System.out.println(isDoubloon("Abba"));
        System.out.println(isDoubloon("appeases"));
        System.out.println(isDoubloon("esophagographers"));
        System.out.println(isDoubloon("Dada"));
        System.out.println(isDoubloon("Mama"));
        System.out.println(isDoubloon("Bandband"));
        System.out.println(isDoubloon("ClamClam"));

        // Negative tests for doubloons
        System.out.println(!isDoubloon("esophagographer"));
        System.out.println(!isDoubloon("bananab"));
        System.out.println(!isDoubloon("applesauce"));
        System.out.println(!isDoubloon("bouchee"));
        System.out.println(!isDoubloon("MoneyHeist"));
        System.out.println(!isDoubloon("hello"));

        // canSpell tests
        System.out.println(canSpell("boot", "axobasrto"));
        System.out.println(canSpell("happy", "hoayzpkpi"));
        System.out.println(!canSpell("zopo", "ziopg"));

        // Negative tests for canSpell
        System.out.println(!canSpell("hippo", "haxobapsrito"));
        System.out.println(!canSpell("Steamrolled", "abcdefhijklmnop"));

    }


}
