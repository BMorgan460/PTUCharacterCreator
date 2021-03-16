package PTUCharacterCreator;

import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.logging.Level;
import java.util.logging.Logger;
import PTUCharacterCreator.Feats.*;
import PTUCharacterCreator.Edges.*;

/**
 * Storage for Trainer Information
 * @author Blake Morgan
 */
public class Trainer {
    //constants
    private static final String SPECIES = "Human";
    private static final int MAX_EXP = 10;
    private static final int BASE_HP = 10;
    private static final int BASE_ATK = 5;
    private static final int BASE_DEF = 5;
    private static final int BASE_SPATK = 5;
    private static final int BASE_SPDEF = 5;
    private static final int BASE_SPD = 5;
    
    //bio info
    private String name;
    private String gender;
    private String height;
    private int WC;
    
    //level related stats
    private int level;
    private int exp;
    private int AP;
    private int statPoints;
    
    //stats points
    private int lHP;
    private int lAtk;
    private int lDef;
    private int lSpAtk;
    private int lSpDef;
    private int lSpd;
    //stats from feats
    private int fHP;
    private int fAtk;
    private int fDef;
    private int fSpAtk;
    private int fSpDef;
    private int fSpd;
    
    //capabilities
    private int overland;
    private int swim;
    private int lJump;
    private int hJump;
    private int power;
    private int throwRange;
    private ArrayList<String> otherCapabilities;
    
    //moves and abilities
    private ArrayList<Moves> moves;
    private ArrayList<Ability> abilities;
    
    //Features and Edges
    private ArrayList<Edge> edges;
    private ArrayList<Feature> features;
    
    //Pokemon
    private ArrayList<Pokemon> pc;
    
    //skills
    private HashMap<String, Integer> skills;
    private HashMap<String, Integer> skillBonuses;
    
    //Inventory
    private int currency;
    private ArrayList<Item> inventory;
    
    public Trainer(){
        level = 1;
        statPoints = 10;
        lHP = 0;
        fHP = 0;
        lAtk = 0;
        fAtk = 0;
        lDef = 0;
        fDef = 0;
        lSpAtk = 0;
        fSpAtk = 0;
        lSpDef = 0;
        fSpDef = 0;
        lSpd = 0;
        fSpd = 0;
        pc = new ArrayList<>();
        inventory = new ArrayList<>();
        currency = 0;
        setMaps();
    }
    
    private void setMaps(){
        skills = new HashMap<>();
        skillBonuses = new HashMap<>();
        setSkills();
        setBonuses();
    }
    
    private void setSkills(){
        skills.put("Acrobatics", 2);
        skills.put("Athletics", 2);
        skills.put("Charm", 2);
        skills.put("Combat", 2);
        skills.put("Command", 2);
        skills.put("Gen Edu", 2);
        skills.put("Med Edu", 2);
        skills.put("Ocu Edu", 2);
        skills.put("Pokemon Edu", 2);
        skills.put("Tech Edu", 2);
        skills.put("Focus", 2);
        skills.put("Guile", 2);
        skills.put("Intimidate", 2);
        skills.put("Intuition", 2);
        skills.put("Perception", 2);
        skills.put("Stealth", 2);
        skills.put("Survival", 2);
    }
    
    private void setBonuses(){
        skillBonuses.put("Acrobatics", 0);
        skillBonuses.put("Athletics", 0);
        skillBonuses.put("Charm", 0);
        skillBonuses.put("Combat", 0);
        skillBonuses.put("Command", 0);
        skillBonuses.put("Gen Edu", 0);
        skillBonuses.put("Med Edu", 0);
        skillBonuses.put("Ocu Edu", 0);
        skillBonuses.put("Pokemon Edu", 0);
        skillBonuses.put("Tech Edu", 0);
        skillBonuses.put("Focus", 0);
        skillBonuses.put("Guile", 0);
        skillBonuses.put("Intimidate", 0);
        skillBonuses.put("Intuition", 0);
        skillBonuses.put("Perception", 0);
        skillBonuses.put("Stealth", 0);
        skillBonuses.put("Survival", 0);
    }
    
    public void setName(String name){
        this.name = name;
    }
    
    public void setGender(String gender){
        this.gender = gender;
    }
    
    public void setHeight(String height){
        this.height = height;
    }
    
    public void setWC(int weight){
        if(weight <= 25){
            WC = 1;
        }else if(weight <= 55){
            WC = 2;
        }else if(weight <= 110){
            WC = 3;
        }else if(weight <= 220){
            WC = 4;
        }else if(weight <= 440){
            WC = 5;
        }else{
            WC = 6;
        }
    }
    
    public void setLevel(int level){
        this.level = level;
    }
    
    public void incLHP(int lHP){
        this.lHP = lHP;
    }
    
    public void incLAtk(int lAtk){
        this.lAtk = lAtk;
    }
    
    public void incLDef(int lDef){
        this.lDef = lDef;
    }
    
    public void incLSpAtk(int lSpAtk){
        this.lSpAtk = lSpAtk;
    }
    
    public void incLSpDef(int lSpDef){
        this.lSpDef = lSpDef;
    }
    
    public void incLSpd(int lSpd){
        this.lSpd = lSpd;
    }
    
    public int getStatPointsRemaining(){
        return statPoints - lHP - lAtk - lDef - lSpAtk - lSpDef - lSpd;
    }
    
    public void addFeature(String feature){
        try {
            Class<Feature> feat = (Class<Feature>)Class.forName(feature);
            Feature tempFeat = (Feature) feat.getDeclaredConstructor().newInstance();
            features.add(tempFeat);
            String tags = tempFeat.getTags();
            if(tags.contains("[+HP]")){
                fHP++;
            }
            if(tags.contains("[+Attack]")){
                fAtk++;
            }
            if(tags.contains("[+Defense]")){
                fDef++;
            }
            if(tags.contains("[+Special Attack]")){
                fSpAtk++;
            }
            if(tags.contains("[+Special Defense]")){
                fSpDef++;
            }
            if(tags.contains("[+Speed]")){
                fSpd++;
            }
            //TODO Add in [+Attack or Special Attack]
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(Trainer.class.getName()).log(Level.SEVERE, null, ex);
        } catch (NoSuchMethodException ex) {
            Logger.getLogger(Trainer.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SecurityException ex) {
            Logger.getLogger(Trainer.class.getName()).log(Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            Logger.getLogger(Trainer.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            Logger.getLogger(Trainer.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IllegalArgumentException ex) {
            Logger.getLogger(Trainer.class.getName()).log(Level.SEVERE, null, ex);
        } catch (InvocationTargetException ex) {
            Logger.getLogger(Trainer.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    private void skillUpBasic(String e){
        int temp = skills.get(e);
        skills.put(e, temp + 1);
    }
    
    private void skillUpAdept(String e){
        skills.put(e, 4);
    }
    
    private void skillUpExpert(String e){
        skills.put(e, 5);
    }
    
    private void skillUpMaster(String e){
        skills.put(e, 6);
    }
    
    private void skillUpVirtuoso(String e){
        skills.put(e, 8);
    }
    
    public boolean addEdge(String e){
        try {
            Class<Edge> edge = (Class<Edge>)Class.forName(e);
            Edge tempEdge = (Edge) edge.getDeclaredConstructor().newInstance();
            if(tempEdge.checkPrereqs(skills, edges, level)){
                if(e.contains("Basic Skills")){
                    skillUpBasic(e.substring(13));
                }else if(e.contains("Adept Skills")){
                    skillUpAdept(e.substring(13));
                }else if(e.contains("Expert Skills")){
                    skillUpExpert(e.substring(14));
                }else if(e.contains("Master Skills")){
                    skillUpMaster(e.substring(14));
                }else if(e.contains("Virtuoso")){
                    skillUpVirtuoso(e.substring(9));
                }
                edges.add(tempEdge);
                return true;
            }else{
                return false;
            }
            
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(Trainer.class.getName()).log(Level.SEVERE, null, ex);
        } catch (NoSuchMethodException ex) {
            Logger.getLogger(Trainer.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SecurityException ex) {
            Logger.getLogger(Trainer.class.getName()).log(Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            Logger.getLogger(Trainer.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            Logger.getLogger(Trainer.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IllegalArgumentException ex) {
            Logger.getLogger(Trainer.class.getName()).log(Level.SEVERE, null, ex);
        } catch (InvocationTargetException ex) {
            Logger.getLogger(Trainer.class.getName()).log(Level.SEVERE, null, ex);
        }
        return false;
    }
    
    
    
    public String generateJSON(){
        String json = "{\"CharType\":1,\"nickname\":\"\",\"species\":\"Human\",\"type1\":\"\",\"type2\":\"\",\"Level\":1,\"EXP\":0,\"EXP_max\":10,\"AP\":5,\"AP_max\":5,\"HeldItem\":\"\",\"Gender\":\"\",";
        
        return json;
    }
    
}
