
public class Actividad4 {
    public static void main(String[] args) {
        //Creacion de string principal y contadores.
        int i = 0;
        String fullSong = "\nTwelve drummers drumming,\nEleven pipers piping,\nTen lords a-leaping,\nNine ladies dancing,\nEight maids a-milking,\nSeven swans a-swimming,\nSix geese a-laying,\nFive golden rings,\nFour calling birds,\nThree French hens,\nTwo turtle doves\nAnd a partridge in a pear tree!";
        int j = fullSong.length()-34;
        //Creacion de strings auxiliares.
        String cardinal = "first";
        String partdrige = "\nA partdrige in a pear tree";
        String parteActual = "";
        //Iteraciones
        while (i <= 11) {
            String begin = "On the " + cardinal + " day of christmas.\nMy true love sent to me";
            System.out.print(begin);
            if (i == 0) {
                System.out.print(partdrige);
            }
            else{
                while(fullSong.charAt(j)!= '\n'){
                    j -= 1;
                }
                System.out.print(fullSong.substring(j, fullSong.length()-1));
                j -= 1;
            }
            System.out.println("");
            i+=1;
            switch(i){
            case 1:
                cardinal = "second";
                break;
            case 2:
                cardinal = "third";
                break;
            case 3:
                cardinal = "fourth";
                break;
            case 4:
                cardinal = "fifth";
                break;
            case 5:
                cardinal = "sixth";
                break;
            case 6:
                cardinal = "seventh";
                break;
            case 7:
                cardinal = "eighth";
                break;
            case 8:
                cardinal = "ninth";
                break;
            case 9:
                cardinal = "tenth";
                break;
            case 10:
                cardinal = "eleventh";
                break;
            case 11:
                cardinal = "twelfth";
                break;
            }
        }

    }
}
