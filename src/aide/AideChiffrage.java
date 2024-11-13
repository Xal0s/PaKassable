package aide;

import java.util.Scanner;

public class AideChiffrage {
    public static void afficherAideChiffrage(){
        boolean choix = true;
        while (choix) {

            System.out.println(
                "Sur quelle methode de chiffrement avez vous besoin d'aide ? :\n" +
                "1 - Rotation(x) \n" +
                "2 - Vigenère\n" +
                "3 - Carré de Polybe\n" +
                "4 - Enigma\n" +
                "5 - RC4\n" +
                "6 - Retour\n" +
                "7 - Quitter\n"
            );

            Scanner scan = new Scanner(System.in);
            try{
                switch (scan.nextInt()) {
                    case 1:
                        choix = false;
                        RotaX.afficherAideRotaX();
                        break;
                    case 2:
                        choix = false;
                        Vigenere.afficherAideVigenere();
                        break;
                    case 3:
                        choix = false;
                        Polybe.afficherAidePolybe();
                        break;
                    case 4:
                        choix = false;
                        Enigma.afficherAideEnigma();
                        break;
                    case 5:
                        RC4.afficherAideRC4();
                        break;
                    case 6:
                        Aide.afficherAide();
                        break;
                    case 7:
                        System.exit(0);
                    default: System.out.println("\nVotre choix n'est pas disponible\n");
                }
            }catch(Exception e){
                System.out.println("\nVeuillez entrer un choix valide\n");
            }
        }
    }
}
