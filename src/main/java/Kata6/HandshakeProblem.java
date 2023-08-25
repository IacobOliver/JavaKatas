package Kata6;

public class HandshakeProblem {

    public static void main(String[] args) {
        System.out.println(GetParticipants(0));
        System.out.println(GetParticipants(1));
        System.out.println(GetParticipants(3));
        System.out.println(GetParticipants(6));
        System.out.println(GetParticipants(7));

    }

    public static int GetParticipants(int handshakes) {
        if(handshakes == 0) return 0;
        return (int) Math.ceil((1+Math.ceil(Math.sqrt(1+8*handshakes)))/2);
    }


    public static int getFactorial(int number){
        int result = 1;

        for(int i = 2; i <= number; i++){
            result *= i;
        }
        return result;
    }
}
