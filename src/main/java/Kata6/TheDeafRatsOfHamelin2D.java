package Kata6;

public class TheDeafRatsOfHamelin2D {
    public static void main(String[] args) {
        countDeafRats( new char[][] {
                "        ↗".toCharArray(),
                "P ↓   ↖ ↑".toCharArray(),
                "    ←   ↓".toCharArray(),
                "  ↖ ↙   ↙".toCharArray(),
                "↓ ↓ ↓    ".toCharArray()
        });
    }

    public static int countDeafRats(char[][] townSquare) {
        int deafRats = 0;
        int[] pipe = new int[2];
        int maxRow = townSquare[0].length;
        int maxColumn = townSquare.length;

        for (int i = 0; i < townSquare.length; i++) {
            for (int j = 0; j < townSquare[i].length; j++) {
                if(townSquare[i][j] == 'P'){
                    pipe[0] = i;
                    pipe[1] = j;
                }

            }
        }

        for (int i = 0; i < townSquare.length; i++) {
            for (int j = 0; j < townSquare[i].length; j++) {
                if(townSquare[i][j] == 'P'){
                 
                }

            }
        }



        System.out.println(pipe[0] + " " + pipe[1]);
            return deafRats;
    }

}
