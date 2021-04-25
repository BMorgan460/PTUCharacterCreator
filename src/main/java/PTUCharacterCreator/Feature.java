package PTUCharacterCreator;

import java.util.ArrayList;
import java.util.HashMap;

/**
 * This serves as a parent class for every Feature
 * @author Blake Morgan
 */
public abstract class Feature {
    protected String name;
    protected String tags;
    protected HashMap<String,Integer> prereqs = new HashMap();
    protected String frequency;
    protected String effect;
    protected String target;
    
    public Feature(){ }
    
    public String getName(){
        return name;
    }
    
    public String getTags(){
        return tags;
    }
    
    public String getTarget(){
        return target;
    }
    
    public abstract boolean checkPrereqs(Trainer t);
    
    protected boolean checkMultipleSkills(Trainer t, String[] skills, int rank, int required){
        int flags = 0;
        for(String skill : skills){
            if(t.checkSkillRank(skill, rank)){
                flags++;
            }
        }
        return flags >= required;
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
    
    @Override
    public boolean equals(Object o){
        if(o.getClass() == this.getClass()){
            Feature m = (Feature) o;
            return this.name.equals(m.getName());
        }
        return false;
    }
}
