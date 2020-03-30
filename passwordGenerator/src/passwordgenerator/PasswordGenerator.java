package passwordgenerator;

import java.util.Scanner;

public class PasswordGenerator {

    public static void main(String[] args) {
//        System.out.println("Válassz erősséget(erős,közepes,gyenge)");
        Scanner bill = new Scanner(System.in);
//        String erő = bill.nextLine();

        System.out.println("Add meg a hosszát!");
        int hossz = bill.nextInt();
        System.out.println(generatePass(hossz));
    }

    static boolean generateTrueFalse() {
        if ((int) ((Math.random() * 2) + 1) == 1) {
            //System.out.println("true");
            return true;
        } else {
            //System.out.println("false");
            return false;
        }
    }

    static char generateChar() {
        char temp = 'a';
        for (int i = 0; i < (int) ((Math.random() * 24) + 1); i++) {
            temp++;
        }
        //System.out.println(temp);
        return temp;
    }

    static int generateNum() {
        int temp = 1;
        for (int i = 0; i < (int) ((Math.random() * 9) + 1); i++) {
            temp++;
        }
        //System.out.println(""+temp);
        return temp;
    }

    static String generatePass(int hossz) {
        String pass = "";
        String[] darabok = new String[hossz];
        for (int i = 0; i < hossz; i++) {
            if (generateTrueFalse()) {
                if (generateTrueFalse()) {
                    
                    darabok[i] = (generateChar() + "").toUpperCase();
                } else {
                    darabok[i]  = (generateChar() + "");
                }
            } else {
                darabok[i] = ("" + generateNum());
            }

        }
        for (int i = 0; i < hossz; i++) {
            pass+= darabok[i];
        }
        return pass;
    }
}
