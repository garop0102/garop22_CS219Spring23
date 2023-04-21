package OOP;

public class StringCheckSum implements CheckSum<String>{
    @Override
    public int checksum(String s) {
        int sum = 0;
        for(int i = 0; i < s.length(); i++){
            sum = sum + s.charAt(i);
        }
        return sum;
    }
}
