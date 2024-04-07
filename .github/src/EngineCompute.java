import java.util.List;

/* Assignment 4 instructions: In the 'src' folder, implement the
computation you chose and added to the README in the computation component
of the engine. Remember to use good coding style! Choose descriptive variable names,
and break out sub-routines into their own methods */




//EngineAPI Implementation
public class EngineCompute implements EngineAPI {

    // private static List<Integer> decInputs = new ArrayList<>();


    public String compute(int num) {

        StringBuilder hexNum = new StringBuilder();

        // decInputs.add(num);
        //incase number is 0 (even though it should be only positive numbers if all exceptions are implemented correctly?)
        if(num == 0){
            hexNum.insert(0, 0);
        }else{

            while(num > 0){

                int remainder = num % 16;
                char hexDigit = getHexDigit(remainder);
                hexNum.insert(0, hexDigit);
                num /= 16;
            }
        }

        return "0x" + hexNum.toString();
    }

    private char getHexDigit(int remainder) {

        char digit = '0';

        if(remainder < 10){

            digit = (char) ('0' + remainder); //takes the character 0(ASCII) and adds the remainder to get the remainder ASCII value
        }else if(remainder >= 10){ //can only be betwen 10 & 15 since were dividing by 16

            digit = (char) ('A' + remainder - 10); //finds correct ASCII value
        }

        return digit;
    }

    //finds greatest common divisor of a list of integers
    public int getGCD(List<Integer> decInputs) {

        int gcd = decInputs.get(0);

        for(int i = 1; i < decInputs.size(); i++) {
            gcd = getGCD(gcd, decInputs.get(i));
        }

        return gcd;
    }

    //finds GCD of two numbers using Euclid's algorithmn
    private int getGCD(int numOne, int numTwo) {

        //Euclid's algorithm
        while(numTwo != 0){

            int temp = numTwo;
            numTwo = numOne % numTwo;
            numOne = temp;
        }

        return numOne;
    }

}