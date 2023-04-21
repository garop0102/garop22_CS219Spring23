package OOP;

public class IntegerCheckSum implements CheckSum<Integer>{

    @Override
    public int checksum(Integer n) {
        int sum = 0;
        while (n > 0){
            sum = sum + (n % 10);
            n = n / 10;
        }
        return sum;
    }
}
