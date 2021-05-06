package edu.ithaca;

import java.io.File;
import java.io.FileWriter;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.EnumMap;
import java.util.InputMismatchException;
import java.util.Iterator;
import java.util.Scanner;
import java.util.Set;
import java.util.Map.Entry;

public class UserInterfaceMain {

    public static void main(String[] args) throws IOException {

        Scanner scan = new Scanner(System.in);
        Alignment alignChoice = null;
        boolean isHumanoidChoice = false;
        Difficulty difficultyChoice = null;
        MovementType movementChoice = null;

        System.out.println("Welcome to the DND Enemy Recommender!\n");
        System.out.println("First, we'll need some of your preferences to determine the best monster for your party.\n");
        //Preferences uiPref = new Preferences(alignment, isHumanoid, difficulty, movementType);

        System.out.println("Would you like your enemy to have a specific alignment?\n");
        System.out.println("For unaligned, press 0\n");
        System.out.println("For chaotic evil, press 1\n");
        System.out.println("For lawful evil, press 2\n");
        System.out.println("For neutral evil, press 3\n");
        System.out.println("For chaotic good, press 4\n");
        System.out.println("For lawful good, press 5\n");
        System.out.println("For neutral good, press 6\n");
        System.out.println("For chaotic neutral, press 7\n");
        System.out.println("For lawful neutral, press 8\n");
        System.out.println("For true neutral, press 9\n");
        //System.out.println("For random, press any other character\n");
        int choice1 = scan.nextInt();
        if(choice1 == 0){   
            alignChoice = Alignment.UNALIGNED;
        }
        else if(choice1 == 1){
            alignChoice = Alignment.CHAOTICEVIL;
        }
        else if(choice1 == 2){
            alignChoice = Alignment.LAWFULEVIL;
        }
        else if(choice1 == 3){
            alignChoice = Alignment.NEUTRALEVIL;
        }
        else if(choice1 == 4){
            alignChoice = Alignment.CHAOTICGOOD;
        }
        else if(choice1 == 5){
            alignChoice = Alignment.LAWFULGOOD;
        }
        else if(choice1 == 6){
            alignChoice = Alignment.NEUTRALGOOD;
        }
        else if(choice1 == 7){
            alignChoice = Alignment.CHAOTICNEUTRAL;
        }
        else if(choice1 == 8){
            alignChoice = Alignment.LAWFULNEUTRAL;
        }
        else if(choice1 == 9){
            alignChoice = Alignment.TRUENEUTRAL;
        }
        

        System.out.println("Would you like your enemy to be a humanoid?\n");
        System.out.println("For yes, press 1\n");
        System.out.println("For no, press 2\n");
        int choice2 = scan.nextInt();
        if(choice2 == 1){
            isHumanoidChoice = true;
        }


        System.out.println("Would you like your enemy to have a difficulty level?\n");
        System.out.println("For easy, press 1\n");
        System.out.println("For medium, press 2\n");
        System.out.println("For hard, press 3\n");
        System.out.println("For deadly, press 4\n");
        int choice3 = scan.nextInt();
        if(choice3 == 1){
            difficultyChoice = Difficulty.EASY;
        }
        else if(choice3 == 2){
            difficultyChoice = Difficulty.MEDIUM;
        }
        else if(choice3 == 3){
            difficultyChoice = Difficulty.HARD;
        }
        else if(choice3 == 4){
            difficultyChoice = Difficulty.DEADLY;
        }


        System.out.println("Would you like your enemy to have a movement type?\n");
        System.out.println("For ground, press 1\n");
        System.out.println("For flying, press 2\n");
        System.out.println("For swinning, press 3\n");
        int choice4 = scan.nextInt();
        if(choice4 == 1){
            movementChoice = MovementType.GROUND;
        }
        else if(choice4 == 2){
            movementChoice = MovementType.FLY;
        }
        else if(choice4 == 3){
            movementChoice = MovementType.SWIM;
        }

        Preferences pref = new Preferences(alignChoice, isHumanoidChoice, difficultyChoice, movementChoice);

        System.out.println("Got it! Your preferences have been recorded.\n");
        System.out.println("Next, we'll need your party information to determine what stats to give your enemy.\n");
        //take in stats here

        Party party = new Party("src/main/resources/party.json");
        EnemyDataBaseList edbl = new EnemyDataBaseList("src/main/resources/EnemyDB.csv");

        EnemyRecommenderAgent newRecommender = new EnemyRecommenderAgent();

        Enemy bestEnemyResult = newRecommender.recommendEnemy(party, pref, edbl);

        String enemyName = bestEnemyResult.getName();
        Boolean enemyHumanoid = bestEnemyResult.getIsHumanoid();
        Boolean enemyMagic = bestEnemyResult.getIsMagicUser();
        String enemyTerrainString = bestEnemyResult.getStringTerrains();
        String enemyMovementString = bestEnemyResult.getStringMovementTypes();
        Alignment enemyAlignment = bestEnemyResult.getAlignment();
        String enemyAlignmentString = enemyAlignment.toString();
        Size enemySize = bestEnemyResult.getSize();
        String enemySizeString = enemySize.toString();
        int enemyAC = bestEnemyResult.getArmorClass();
        int enemyHp = bestEnemyResult.getHP();
        int enemyCon = bestEnemyResult.getCon();
        int enemyStr = bestEnemyResult.getStr();
        int enemyWis = bestEnemyResult.getWis();
        int enemyInt = bestEnemyResult.getIntel();
        int enemyDex = bestEnemyResult.getDex();
        int enemyCha = bestEnemyResult.getCha();
        double enemyCr = bestEnemyResult.getCr();
        



        System.out.println("Here is your chosen enemy:\n");
        System.out.println("QUALITATIVE STATS:\n");
        System.out.println("Enemy type: " + enemyName + "\n");
        System.out.println("Humanoid?: " + enemyHumanoid  + "\n");
        System.out.println("Magic user?: " + enemyMagic + "\n");
        System.out.println("Terrain(s): " + enemyTerrainString + "\n");
        System.out.println("Movement Type: " + enemyMovementString + "\n");
        System.out.println("Alignment: " + enemyAlignmentString + "\n");
        System.out.println("Size: " + enemySizeString + "\n");
        System.out.println("QUANTITATIVE STATS:\n");
        System.out.println("Challenge Rating: "+enemyCr+"\n");
        System.out.println("Armor Class: " + enemyAC +"\n");
        System.out.println("HP: " + enemyHp +"\n");
        System.out.println("Constitution: " + enemyCon +"\n");
        System.out.println("Strength: " + enemyStr +"\n");
        System.out.println("Wisdom: " + enemyWis +"\n");
        System.out.println("Intelligence: " + enemyInt +"\n");
        System.out.println("Dexterity: " + enemyDex +"\n");
        System.out.println("Charisma: " + enemyCha +"\n");








        
        
        // double crToFind = newRecommender.calcCrToFind(null, pref);
        // newRecommender.crSearch(crToFind);

        




        /*String username = getProperUsernameLogin();
        DungeonMaster dm = new DungeonMaster(username);
        Party p = new Party(new ArrayList<PartyMember>());
        Scanner scan = new Scanner(System.in);
        try{
            p = readPartyFile("/Users/erb/Comp354_AI/COMP354_finalProject/src/main/java/edu/ithaca/resources/party.csv");
        }
        catch(RuntimeException e){}
        if(p.getPartySize()==0){
            System.out.println("No pre existing party info. Enter 'done' to stop or any key to continue:\n");
            String doneOrElse = scan.nextLine();
            while(!doneOrElse.equalsIgnoreCase("done")){
                PartyMember pm = getPartyMemberEntered();
                p.addCharacter(pm);
                System.out.println("No pre existing party info. Enter 'done' to stop or any key to continue:\n");
                doneOrElse = scan.nextLine();
            }
            writePartyFile("/Users/erb/Comp354_AI/COMP354_finalProject/src/main/java/edu/ithaca/resources/party.csv", p);
        }*/
        
        //Interface code for making a recommendation

    }

}
