/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package abo_sncf;

import java.io.IOException;
import java.util.Scanner;

/**
 *
 * @author kane
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws IOException {

        System.out.println("Abonnement SNCF\n---------------------------");
        int num = 0;
        Scanner sc = new Scanner(System.in);

        TestSNCF t = null;

        System.out.println(
                    "1-Lancer le jeu d'essai initial\n"+
                    "2-Lister toutes les gares connues\n"+
                    "3-Lister tous les abonnements\n"+
                    "4-Description de l'abonnement N° X\n"+
                    "5-Liste des abonnements correspondant au nom de client « X »\n"+
                    "6-Distance de la gare « X »\n"+
                    "7-Nombre total d'abonnements\n"+
                    "8-Modifier les paramètres (frais de dossier, tarifKmAnnuel, tarifKmMensuel, mention)\n"+
                    "9-Ajouter une nouvelle gare avec sa distance\n"+
                    "10-Créer un nouvel abonnement mensuel\n"+
                    "11-Créer un nouvel abonnement annuel\n"+
                    "12-Reconduire l'abonnement mensuel N°X\n"+
                    "13-Quitter\n"+
                    "14-Lancer le jeu de test public\n---------------------------");
        
        boolean b = true;
        do
        {
            System.out.println("Entrez le numéro de l'action voulue : ");
            num = sc.nextInt();
            switch(num)
            {
                case 1 :
                        t = new TestSNCF();
                        t.initJeuEssai();
                        System.out.println("Jeu d'essai initialisé, vous pouvez lancer les autres fonctions...\n");
                    break;

                case 2 :
                        if(t!=null)
                        {
                            t.listerGares();
                        }
                        else
                        {
                            System.out.println("Vous devez initialiser le jeu d'essai avant d'utiliser cette fonction.\n");
                        }
                    break;

                case 3 :
                        if(t!=null)
                        {
                            t.listerAbos();
                        }
                        else
                        {
                            System.out.println("Vous devez initialiser le jeu d'essai avant d'utiliser cette fonction.\n");
                        }
                    break;

                case 4 :
                        if(t!=null)
                        {
                            System.out.println("Numéro de l'abonnement voulu : ");
                            int n = sc.nextInt();
                            t.descAboX(n);
                        }
                        else
                        {
                            System.out.println("Vous devez initialiser le jeu d'essai avant d'utiliser cette fonction.\n");
                        }
                    break;

                case 5 :
                        if(t!=null)
                        {
                            System.out.println("Nom de la personne : ");
                            sc.nextLine();
                            String str = sc.nextLine();
                            t.descAboNom(str);

                        }
                        else
                        {
                            System.out.println("Vous devez initialiser le jeu d'essai avant d'utiliser cette fonction.\n");
                        }
                    break;

                case 6 :
                        if(t!=null)
                        {
                            System.out.println("Nom de la gare : ");
                            sc.nextLine();
                            String str = sc.nextLine();
                            t.distanceGareNom(str);
                        }
                        else
                        {
                            System.out.println("Vous devez initialiser le jeu d'essai avant d'utiliser cette fonction.\n");
                        }
                    break;

                case 7 :
                        if(t!=null)
                        {
                            t.nbTotalAbo();
                        }
                        else
                        {
                            System.out.println("Vous devez initialiser le jeu d'essai avant d'utiliser cette fonction.\n");
                        }
                    break;

                case 8 :
                        if(t!=null)
                        {
                            System.out.println("Frais de dossier : ");
                            int f = sc.nextInt();
                            System.out.println("Tarif Kilométrique mensuel : ");
                            int Tm = sc.nextInt();
                            System.out.println("Tarif Kilométrique annuel : ");
                            int Ta = sc.nextInt();
                            System.out.println("Nouvelle mention (annuel) : ");
                            sc.nextLine();
                            String ma = sc.nextLine();
                            System.out.println("Nouvelle mention (mensuel) : ");
                            String mm = sc.nextLine();
                            t.modifParams(f, Ta, Tm, ma, mm);
                        }
                        else
                        {
                            System.out.println("Vous devez initialiser le jeu d'essai avant d'utiliser cette fonction.\n");
                        }
                    break;

                case 9 :
                        if(t!=null)
                        {
                            System.out.println("Nom de la gare : ");
                            sc.nextLine();
                            String nom = sc.nextLine();
                            System.out.println("Distance : ");
                            int dist = sc.nextInt();
                            t.newGareD(nom, dist);
                        }
                        else
                        {
                            System.out.println("Vous devez initialiser le jeu d'essai avant d'utiliser cette fonction.\n");
                        }
                    break;

                case 10 :
                        if(t!=null)
                        {
                            System.out.println("Nom de la personne : ");
                            sc.nextLine();
                            String nom = sc.nextLine();
                            System.out.println("Numéro du mois : ");
                            int mois = sc.nextInt();
                            System.out.println("Nom de la gare distante : ");
                            sc.nextLine();
                            String nomG = sc.nextLine();
                            t.newAboM(nom, mois, nomG);
                        }
                        else
                        {
                            System.out.println("Vous devez initialiser le jeu d'essai avant d'utiliser cette fonction.\n");
                        }
                    break;

                case 11 :
                        if(t!=null)
                        {
                            System.out.println("Nom de la personne : ");
                            sc.nextLine();
                            String nom = sc.nextLine();
                            System.out.println("Date (JJ/MM/AAAA) : ");
                            String date = sc.nextLine();
                            System.out.println("Nom de la gare distante : ");
                            String nomG = sc.nextLine();
                            t.newAboA(nom, date, nomG);
                        }
                        else
                        {
                            System.out.println("Vous devez initialiser le jeu d'essai avant d'utiliser cette fonction.\n");
                        }
                    break;

                case 12 :
                        if(t!=null)
                        {
                            System.out.println("Numéro de l'abonnement à reconduire : ");
                            int n = sc.nextInt();
                            t.reconduireX(n);
                        }
                        else
                        {
                            System.out.println("Vous devez initialiser le jeu d'essai avant d'utiliser cette fonction.\n");
                        }
                    break;

                case 13 :
                        t.quitter();
                        b = false;
                    break;

                case 14 :
                    // Jeu de test public
                        t = new TestSNCF();
                        t.initJeuEssai();
                        t.listerGares();
                        t.listerAbos();
                        t.reconduireX(3);
                        t.descAboX(3);
                        t.descAboNom("Bob");
                        t.distanceGareNom("str");
                        t.nbTotalAbo();
                        t.modifParams(20, 40, 4, "year", "month");
                        t.listerAbos();
                        t.newGareD("mul", 60);
                        t.listerGares();
                        t.newAboM("max",12,"mul");
                        t.newAboA("Sue", "31/09/09","str");
                        t.nbTotalAbo();
                        t.listerAbos();
                        t.reconduireX(6);
                        t.descAboX(6);
                        t.quitter();
                        t = null;
                    break;

                default :
                       System.out.println("Numéro non attribué !\n");
                    break;

            }

        }while(b);
    }

    

}
