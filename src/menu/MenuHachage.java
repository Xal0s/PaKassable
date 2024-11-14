package menu;

import aide.Aide;
import hash.MD5;
import hash.Sha256;
import sauvegarde.Sauvegarde;

import java.util.Scanner;

public class MenuHachage {

    public static void afficherMenuHachage(String mdp) {

        boolean choix = true;
        while (choix) {

            System.out.println(
                    "Quel algorithme voulez-vous utiliser ? :\n" +
                    "1 - MD5 \n" +
                    "2 - Sha-256\n" +
                    "3 - Sauvegarde\n" +
                    "4 - Avoir de l'aide\n" +
                    "5 - Retour\n" +
                    "6 - Quitter\n"
            );

            System.out.println(mdp);

            Scanner scan = new Scanner(System.in);
            try {
                switch (scan.nextInt()) {
                    case 1:
                        choix = false;
                        mdp = MD5.convertirEnMD5(mdp);
                        Menu.afficherMenu(mdp);
                        break;
                    case 2:
                        choix = false;
                        mdp = Sha256.convertirEnSha256(mdp);
                        Menu.afficherMenu(mdp);
                        break;
                    case 3:
                        choix = false;
                        Sauvegarde.SauvegardeMdp(mdp);
                        break;
                    case 4:
                        choix = false;
                        Aide.afficherAide(mdp);
                        break;
                    case 5 :
                        choix = false;
                        mdp = Menu.afficherMenu(mdp);
                        break;
                    case 6 :
                        System.exit(0);
                    default:
                        System.out.println("\nVotre choix n'est pas disponible\n");
                }
            } catch (Exception e) {
                System.out.println("\nVeuillez entrer un chiffre valide\n");
            }
        }
    }
}
