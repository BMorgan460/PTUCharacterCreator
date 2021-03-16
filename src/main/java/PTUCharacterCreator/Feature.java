package PTUCharacterCreator;

import PTUCharacterCreator.Edge;
import java.util.ArrayList;
import java.util.HashMap;

/**
 * This serves as a parent class for every Feature
 * @author Blake Morgan
 */
public class Feature {
    protected String name;
    protected String tags;
    protected HashMap<String,Integer> prereqs;
    protected String frequency;
    protected String effect;
    
    public Feature(){ }
    
    public String getName(){
        return name;
    }
    
    public String getTags(){
        return tags;
    }
    
    public boolean checkPrereqs(HashMap<String,Integer> skills, ArrayList<Feature> feats, ArrayList<Edge> edges, int level){
        ArrayList<Boolean> flags = new ArrayList<Boolean>();
        for (String key : prereqs.keySet()) {
            if(skills.containsKey(key)){
                if(skills.get(key) >= prereqs.get(key)){
                    flags.add(true);
                }
            }else if (prereqs.get(key) == 9){
                for(Edge e : edges){
                    if(e.getName().equals(key)){
                        flags.add(true);
                        continue;
                    }
                }
            }else if(prereqs.get(key) == 9){
                for(Feature f : feats){
                    if(f.getName().equals(key)){
                        flags.add(true);
                        continue;
                    }
                }
            }else if(key.equals("Level")){
                if(level >= prereqs.get(key)){
                    flags.add(true);
                }
            }
        }
        boolean flag = flags.size() == prereqs.size();
        return flag;
    }
    
    public String getPrereqs(){
        String result = "";
        for(String key : prereqs.keySet()){
            if(prereqs.get(key) != 0){
                switch(prereqs.get(key)){
                    case 1:
                        result += "Pathetic " + key + ", ";
                        break;
                    case 2:
                        result += "Untrained " + key + ", ";
                        break;
                    case 3:
                        result += "Novice " + key + ", ";
                        break;
                    case 4:
                        result += "Adept " + key + ", ";
                        break;
                    case 5:
                        result += "Expert " + key + ", ";
                        break;
                    case 6:
                        result += "Master " + key + ", ";
                        break;
                    case 8:
                        result += "Virtuoso " + key + ", ";
                        break;
                }
            }else{
                result += key;
            }
        }
        return result;
    }
    
    public String getFreq(){
        return frequency;
    }
    
    public String getEffect(){
        return effect;
    }
}
