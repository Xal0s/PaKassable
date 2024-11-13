package aide;

import menu.Menu;

import java.util.Scanner;

public class Aide {
    public static void afficherAide(){

        Scanner sc = new Scanner(System.in);
        Boolean choix = true;

        System.out.println(
                "Sur PaKassable, vous avez la possibilité de chiffrer/déchiffrer et de hacher un mot de passe avec plusieurs methode differentes:\n"+
                "Sur quelle fonction souhaitez vous de l'aide ? \n"
        );
        while(choix){
            System.out.println(
                "1 - Chiffrage/Déchiffrage\n" +
                "2 - Hachage\n" +
                "3 - Retour\n" +
                "4 - Quitter\n"
            );
            try{
                switch (sc.nextInt()) {
                    case 1:
                        choix = false;
                        AideChiffrage.afficherAideChiffrage();
                        break;
                    case 2:
                        choix = false;
                        AideHachage.afficherAideHachage();
                        break;
                    case 3 :
                        choix = false;
                        Menu.afficherMenu();
                        break;
                    case 4 :
                        choix = false;
                        System.exit(0);
                }
            }catch(Exception e){
                System.out.println("Ce n'est pas un choix valide");
            }
        }


    }
}
