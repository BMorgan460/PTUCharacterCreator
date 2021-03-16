package PTUCharacterCreator;

/**
 * Parent Class used to store all Abilities
 * @author Blake Morgan
 */
public class Ability {
    protected String name;
    protected String freq;
    protected String effect;
    
    public String getName(){
        return name;
    }
    
    public String getFreq(){
        return freq;
    }
    
    public String getEffect(){
        return effect;
    }
}
