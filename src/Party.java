package src;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Iterator;

public class Party {

<<<<<<< HEAD:party.java
    private ArrayList<partyMember> characters;
    private int partySize;

    // /**
    //  * Default constructor
    //  */
    // public party(){
    //     characters = null;
    //     partySize = 5;
=======
    private List<PartyMember> characters;
    private int partySize;

    /**
     * Default constructor
     */
    public Party(){
        characters = null;
        partySize = 5;
>>>>>>> d9e2c802cf42c5559e494caf624764e1dcff7c75:src/Party.java
        
    // }

    public void addCharacter(partyMember newMember){
        characters.add(newMember);
    }

    public int getPartySize(){
        return partySize;
    }

    public partyMember getCharacter(int placeInList){
        return characters.get(placeInList);
    }

    public partyMember findCharacterByName(String name){
        for(int i = 0; i < characters.size(); i++){
            partyMember currentCharacter = characters.get(i);
            if(currentCharacter.getName().equals(name)){
                return currentCharacter;
            }
        }
        return null;

    }

    public partyMember findCharacterByClass(CharacterClass cc){
        for(int i = 0; i < characters.size(); i++){
            partyMember currentCharacter = characters.get(i);
            if(currentCharacter.getCharacterClass().equals(cc)){
                return currentCharacter;
            }
        }
        return null;
    }


    
}
