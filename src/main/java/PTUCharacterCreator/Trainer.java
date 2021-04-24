package PTUCharacterCreator;

import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.Iterator;
import javax.swing.JOptionPane;
import PTUCharacterCreator.Feats.*;
import PTUCharacterCreator.Edges.*;
import PTUCharacterCreator.Abilities.*;

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
    
    //stats from feats and other bonuses
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
    private ArrayList<Move> moves;
    private ArrayList<Ability> abilities;
    private int struggleDB;
    private String stab1;
    private String stab2;
    
    //Features and Edges
    private ArrayList<Edge> edges;
    private ArrayList<Feature> features;
    private ArrayList<Edge> bEdges;
    private ArrayList<Feature> bFeatures;
    
    
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
        struggleDB = 4;
        pc = new ArrayList<>();
        inventory = new ArrayList<>();
        moves = new ArrayList();
        abilities = new ArrayList();
        edges = new ArrayList();
        features = new ArrayList();
        bEdges = new ArrayList();
        bFeatures = new ArrayList();
        otherCapabilities = new ArrayList();
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
        this.statPoints = level + 9;
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
    
    public boolean hasFeat(String feature){
        for(Feature feat : features){
            if(feat.getName().equals(feature)){
                return true;
            }
        }
        return false;
    }
    
    public boolean hasEdge(String edge){
        for(Edge e : edges){
            if(e.getName().equals(edge)){
                return true;
            }
        }
        return false;
    }
    
    public boolean checkSkillRank(String skill, int rank){
        return skills.get(skill) >= rank;
    }
    
    public boolean aboveLevel(int l){
        return level >= l;
    }
    
    public boolean addFeature(String feature, int bonus){
        try {
            Class<Feature> feat = (Class<Feature>)Class.forName("PTUCharacterCreator.Feats." + feature.replace(" ", "_"));
            Feature tempFeat = (Feature) feat.getDeclaredConstructor().newInstance();
            
            if(features.contains(tempFeat) || bFeatures.contains(tempFeat)){
                JOptionPane.showMessageDialog(null, "You already have this feature.");
                return false;
            }
            if(bonus == JOptionPane.YES_OPTION){
                bFeatures.add(tempFeat);
            }
            else{
                if(tempFeat.checkPrereqs(this)){
                    features.add(tempFeat);
                }else{
                    JOptionPane.showMessageDialog(null,"You do not meet the prerequisites for this feature.");
                }
            }
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
            if(tags.contains("[+Attack or Special Attack]")){
                String input = "";
                do{
                    input = JOptionPane.showInputDialog(null, "Attack or Special Attack?");
                }while(!input.equals("Attack") || !input.equals("Special Attack"));
                switch (input){
                    case "Attack":
                        fAtk++;
                        break;
                    case "Special Attack":
                        fSpAtk++;
                        break;
                }
            }if(tags.contains("[+Any]")){
                String input = "";
                do{
                    input = JOptionPane.showInputDialog(null, "Which stat?");
                }while(!input.equals("HP") && !input.equals("Attack") && !input.equals("Defense") && !input.equals("Special Attack") && !input.equals("Special Defense") && !input.equals("Speed"));
                switch (input){
                    case "HP":
                        fHP++;
                        break;
                    case "Attack":
                        fAtk++;
                        break;
                    case "Defense":
                        fDef++;
                        break;
                    case "Special Attack":
                        fSpAtk++;
                        break;
                    case "Special Defense":
                        fSpDef++;
                        break;
                    case "Speed":
                        fSpd++;
                        break;
                }
            }
            
        } catch (ClassNotFoundException | NoSuchMethodException | SecurityException | InstantiationException | IllegalAccessException | IllegalArgumentException | InvocationTargetException ex) {
            JOptionPane.showMessageDialog(null,"Not a Feature. Make sure you spelled it correctly.");
            Logger.getLogger(Trainer.class.getName()).log(Level.SEVERE, null, ex);
        }
        return false;
    }
    public boolean removeFeat(String feature){
        try {
            Class<Feature> feat = (Class<Feature>)Class.forName("PTUCharacterCreator.Feats." + feature.replace(" ", "_"));
            Feature tempFeat = (Feature) feat.getDeclaredConstructor().newInstance();
            
            if(!features.contains(tempFeat) && !bFeatures.contains(tempFeat)){
                JOptionPane.showMessageDialog(null, "You do not have this feature.");
                return false;
            }else if(features.contains(tempFeat)){
                features.remove(tempFeat);
            }else{
                bFeatures.remove(tempFeat);
            }
            String tags = tempFeat.getTags();
            if(tags.contains("[+HP]")){
                fHP--;
            }
            if(tags.contains("[+Attack]")){
                fAtk--;
            }
            if(tags.contains("[+Defense]")){
                fDef--;
            }
            if(tags.contains("[+Special Attack]")){
                fSpAtk--;
            }
            if(tags.contains("[+Special Defense]")){
                fSpDef--;
            }
            if(tags.contains("[+Speed]")){
                fSpd--;
            }
            if(tags.contains("[+Attack or Special Attack]")){
                String input = "";
                do{
                    input = JOptionPane.showInputDialog(null, "Attack or Special Attack?");
                }while(!input.equals("Attack") || !input.equals("Special Attack"));
                switch (input){
                    case "Attack":
                        fAtk--;
                        break;
                    case "Special Attack":
                        fSpAtk--;
                        break;
                }
            }if(tags.contains("[+Any]")){
                String input = "";
                do{
                    input = JOptionPane.showInputDialog(null, "Which stat?");
                }while(!input.equals("HP") && !input.equals("Attack") && !input.equals("Defense") && !input.equals("Special Attack") && !input.equals("Special Defense") && !input.equals("Speed"));
                switch (input){
                    case "HP":
                        fHP--;
                        break;
                    case "Attack":
                        fAtk--;
                        break;
                    case "Defense":
                        fDef--;
                        break;
                    case "Special Attack":
                        fSpAtk--;
                        break;
                    case "Special Defense":
                        fSpDef--;
                        break;
                    case "Speed":
                        fSpd--;
                        break;
                }
            }
            return true;
        } catch (ClassNotFoundException | NoSuchMethodException | SecurityException | InstantiationException | IllegalAccessException | IllegalArgumentException | InvocationTargetException ex) {
            JOptionPane.showMessageDialog(null,"Not a Feature. Make sure you spelled it correctly.");
            Logger.getLogger(Trainer.class.getName()).log(Level.SEVERE, null, ex);
        }
        return false;
    }
    
    public int getFeaturesTotal(){
        return features.size();
    }
    
    public int getFeaturesRemaining(){
        return level + 3 - features.size();
    }
    
    public int getEdgesTotal(){
        return edges.size();
    }
    
    public int getEdgesRemaining(){
        return level + 3 - edges.size();
    }
    
    private void skillUpBasic(String e, boolean up){
        int temp = skills.get(e);
        if(up)
            skills.put(e, temp + 1);
        else
            skills.put(e, temp - 1);
    }
    
    private void skillUpAdept(String e, boolean up){
        if(up)
            skills.put(e, 4);
        else
            skills.put(e, 3);
    }
    
    private void skillUpExpert(String e, boolean up){
        if(up)
            skills.put(e, 5);
        else
            skills.put(e, 4);
    }
    
    private void skillUpMaster(String e, boolean up){
        if(up)
            skills.put(e, 6);
        else
            skills.put(e, 5);
    }
    
    private void skillUpVirtuoso(String e, boolean up){
        if(up)
            skills.put(e, 8);
        else
            skills.put(e, 6);
    }
    
    private void skillBonusUp(String skills, boolean up){
        String[] s = skills.split(", ");
        if(up){
            skillBonuses.put(s[0], skillBonuses.get(s[0]) + 2);
            skillBonuses.put(s[1], skillBonuses.get(s[1]) + 2);
        }
        else{
            skillBonuses.put(s[0], skillBonuses.get(s[0]) - 2);
            skillBonuses.put(s[1], skillBonuses.get(s[1]) - 2);
        }
    }
    
    public int getSkill(String key){
        if(skills.get(key) == 8){
            return 6;
        }
        return skills.get(key);
    }
    
    public boolean addEdge(String e, int bonus){
        try {
            Class<Edge> edge = (Class<Edge>)Class.forName("PTUCharacterCreator.Edges." + e);
            Edge tempEdge = (Edge) edge.getDeclaredConstructor().newInstance();
            
            if(edges.contains(tempEdge)){
                JOptionPane.showMessageDialog(null, "You already have this Edge.");
                return false;
            }
            if(bonus == JOptionPane.YES_OPTION){
                bEdges.add(tempEdge);
            }else if(tempEdge.checkPrereqs(this)){
                edges.add(tempEdge);
            }else{
                JOptionPane.showMessageDialog(null,"You do not meet the prerequisites.");
                return false;
            }
            if(e.contains("Basic_Skills")){
                skillUpBasic(e.substring(13), true);
            }else if(e.contains("Adept_Skills")){
                skillUpAdept(e.substring(13), true);
            }else if(e.contains("Expert_Skills")){
                skillUpExpert(e.substring(14), true);
            }else if(e.contains("Master_Skills")){
                skillUpMaster(e.substring(14), true);
            }else if(e.contains("Virtuoso")){
                skillUpVirtuoso(e.substring(9), true);
            }
            if(e.contains("Skill_Enhancement")){
                skillBonusUp(tempEdge.getName().substring(18), true);
            }
            return true;
        } catch (ClassNotFoundException | NoSuchMethodException | SecurityException | InstantiationException | IllegalAccessException | IllegalArgumentException | InvocationTargetException ex) {
            JOptionPane.showMessageDialog(null,"Not an Edge. Make sure you spelled it correctly.");
            Logger.getLogger(Trainer.class.getName()).log(Level.SEVERE, null, ex);
        }
        return false;
    }
    
    public boolean removeEdge(String e){
        try {
            Class<Edge> edge = (Class<Edge>)Class.forName("PTUCharacterCreator.Edges." + e);
            Edge tempEdge = (Edge) edge.getDeclaredConstructor().newInstance();
            
            if(!edges.contains(tempEdge) && !bEdges.contains(tempEdge)){
                JOptionPane.showMessageDialog(null, "You do not have this Edge.");
                return false;
            }
            
            if(e.contains("Basic_Skills")){
                skillUpBasic(e.substring(13), false);
            }else if(e.contains("Adept_Skills")){
                skillUpAdept(e.substring(13), false);
            }else if(e.contains("Expert_Skills")){
                skillUpExpert(e.substring(14), false);
            }else if(e.contains("Master_Skills")){
                skillUpMaster(e.substring(14), false);
            }else if(e.contains("Virtuoso")){
                skillUpVirtuoso(e.substring(9), false);
            }
            if(e.contains("Skill_Enhancement")){
                skillBonusUp(e.substring(18), false);
            }
            if(edges.contains(tempEdge)){
                edges.remove(tempEdge);
            }else{
                bEdges.remove(tempEdge);
            }
            return true;
        } catch (ClassNotFoundException | NoSuchMethodException | SecurityException | InstantiationException | IllegalAccessException | IllegalArgumentException | InvocationTargetException ex) {
            JOptionPane.showMessageDialog(null,"Not an Edge. Make sure you spelled it correctly.");
            Logger.getLogger(Trainer.class.getName()).log(Level.SEVERE, null, ex);
        }
        return true;
    }
    
    public boolean addMove(String name){
        try {
            Class<Move> temp =
                    (Class<Move>)Class.forName(name);
            Move move = (Move)temp.getDeclaredConstructor().newInstance();
            if(!moves.contains(move)){
                moves.add(move);
                return true;
            }
            return false;
        } catch (NoSuchMethodException | SecurityException | ClassNotFoundException | InstantiationException | IllegalAccessException | IllegalArgumentException | InvocationTargetException ex) {
            Logger.getLogger(Trainer.class.getName()).log(Level.SEVERE, null, ex);
        }
        return false;
    }
    
    public int getSpeed(){
        return BASE_SPD + lSpd + fSpd;
    }
    
    public boolean addMove(String name, int pos){
        if(moves.size() >= pos){
            moves.remove(pos);
        }
        try {
            Class<Move> temp =
                    (Class<Move>)Class.forName(name);
            Move move = (Move)temp.getDeclaredConstructor().newInstance();
            if(!moves.contains(move)){
                moves.add(move);
                return true;
            }
            return false;
        } catch (NoSuchMethodException | SecurityException | ClassNotFoundException | InstantiationException | IllegalAccessException | IllegalArgumentException | InvocationTargetException ex) {
            Logger.getLogger(Trainer.class.getName()).log(Level.SEVERE, null, ex);
        }
        return false;
    }
    
    public boolean addAbility(String name){
        try {
            Class<Ability> temp =
                    (Class<Ability>)Class.forName(name);
            Ability ability = (Ability)temp.getDeclaredConstructor().newInstance();
            if(!abilities.contains(ability)){
                abilities.add(ability);
                return true;
            }
            return false;
        } catch (NoSuchMethodException | SecurityException | ClassNotFoundException | InstantiationException | IllegalAccessException | IllegalArgumentException | InvocationTargetException ex) {
            Logger.getLogger(Trainer.class.getName()).log(Level.SEVERE, null, ex);
        }
        return false;
    }
    
    private String movesJSON(){
        String json = "";
        for(int i = 1; i <= moves.size(); i++){
            Move move = moves.get(i - 1);
            json += String.format("\"Move%d\":{%s},\n", i, move.toString());
        }
        return json;
    }
    
    private String edgesJSON(){
        String json = "";
        int i = 1;
        for(; i <= edges.size(); i++){
            Edge edge = edges.get(i - 1);
            json += String.format("\"Edge%d\":{\"Name\":\"%s\",\"Cost\":0,\"Prereq\":\"%s\",\"Info\":\"%s\"},\n", i, edge.getName(), edge.getPrereqs(), edge.getEffect());
        }
        for(int j = 0; j < bEdges.size(); j++){
            Edge edge = bEdges.get(j);
            json += String.format("\"Edge%d\":{\"Name\":\"%s\",\"Cost\":0,\"Prereq\":\"%s\",\"Info\":\"%s\"},\n", i + j, edge.getName(), edge.getPrereqs(), edge.getEffect());
        }
        return json;
    }
    
    private String featsJSON(){
        String json = "";
        int i = 1;
        for(; i <= features.size(); i++){
            Feature feat = features.get(i - 1);
            json += String.format("\"Feat%d\":{\"Name\":\"%s\",\"Freq\":\"%s\",\"Info\":\"%s\",\"Target\":\"%s\"},\n", i, feat.getName(), feat.getFreq(), feat.getEffect(), feat.getTarget());
        }
        for(int j = 0; j < bFeatures.size(); j++){
            Feature feat = bFeatures.get(j);
            json += String.format("\"Feat%d\":{\"Name\":\"%s\",\"Freq\":\"%s\",\"Info\":\"%s\",\"Target\":\"%s\"},\n", i + j, feat.getName(), feat.getFreq(), feat.getEffect(), feat.getTarget());
        }
        return json;
    }
    
    private String abilitiesJSON(){
        String json = "";
        if(abilities.size() == 0){
            json += String.format("\"Ability1\":{\"Name\":\"\",\"Freq\":\"\",\"Info\":\"\"},\n");
        }
        for(int i = 1; i <= abilities.size(); i++){
            Ability ability = abilities.get(i - 1);
            json += String.format("\"Ability%d\":{\"Name\":\"%s\",\"Freq\":\"%s\",\"Info\":\"%s\"},\n", i, ability.getName(), ability.getFreq(), ability.getEffect());
        }
        json += "}";
        return json;
    }
    
    public String generateJSON(){
        //CharType to Gender
        String json = String.format("{\"CharType\":1,\n\"nickname\":\"%s\",\n\"species\":\"Human\",\n\"type1\":\"\",\"type2\":\"\",\n\"Level\":%d,\"EXP\":%d,\"EXP_max\":10,\n\"AP\":%d,\"AP_max\":%d,\n\"HeldItem\":\"\",\n\"Gender\":\"%s\",\n", name, level, exp, AP, AP, gender);
        //Nature, Height, Weight Class
        json += String.format("\"Nature\":\"\",\n\"Height\":\"%s\",\n\"WeightClass\":%d,\n", height, WC);
        //base stats
        json += String.format("\"base_HP\":%d,\"base_ATK\":%d,\"base_DEF\":%d,\"base_SPATK\":%d,\"base_SPDEF\":%d,\"base_SPEED\":%d,\n",BASE_HP, BASE_ATK, BASE_DEF, BASE_SPATK, BASE_SPDEF, BASE_SPD);
        //modified stats
        json += String.format("\"HP\":%d,\"ATK\":%d,\"DEF\":%d,\"SPATK\":%d,\"SPDEF\":%d,\"SPEED\":%d,\n", lHP + fHP, lAtk + fAtk, lDef + fDef, lSpAtk + fSpAtk, lSpDef + fSpDef, lSpd + fSpd);
        //Capabilities Part 1
        json += String.format("\"Capabilities\":{\"Overland\":%d,\"Throwing Range\":%d,\"HJ\":%d,\"LJ\":%d,\"Swim\":%d,\"Power\":%d,",overland,throwRange,hJump,lJump,swim,power);
        //Other Capabilities
        for(String capability : otherCapabilities){
            json += String.format("\"%s\":\"\"", capability);
        }
        json += String.format("}\n");
        //Skills
        for(String key : skills.keySet()){
            String temp = key.replace("Edu","Education").replace("Gen","General").replace("Tech","Technology").replace("Med","Medicine").replace("Ocu","Occult").replace("Poke","Pokemon");
            json += String.format("\"%s\":%d,",temp,skills.get(key));
        }
        json += "\n";
        //Skill Ranks
        for (String key : skillBonuses.keySet()) {
            String temp = key.replace("Edu","Education").replace("Gen","General").replace("Tech","Technology").replace("Med","Medicine").replace("Ocu","Occult").replace("Poke","Pokemon");
            json += String.format("\"%s\":%d,",temp,skillBonuses.get(key));
        }
        json += "\n";
        //Moves
        json += movesJSON();
        //Struggle
        json += String.format("\"Struggle_Type\":\"Normal\",\"Struggle_DType\":\"Physical\",\"Struggle_DB\":%d,\"Struggle_Range\":\"Melee, 1 Target\",\n", struggleDB);
        //Edges
        json += edgesJSON();
        //Features
        json += featsJSON();
        //Abilities
        json += abilitiesJSON();
        
        return json;
    }

    void setMiscExp(int miscExp) {
        this.exp = miscExp;
    }

    public boolean hasEC(String elemental_Connection) {
        boolean flag = false;
        for(Edge edge: edges){
            if(edge.getName().contains("Elemental Connection")){
                flag = true;
            }
        }
        return flag;
    }
    
}
