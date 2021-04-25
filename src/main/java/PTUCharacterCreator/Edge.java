package PTUCharacterCreator;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Objects;

/**
 * Class used to store Edges
 * @author Blake Morgan
 */
public abstract class Edge {
    protected String name;
    protected HashMap<String,Integer> prereqs = new HashMap();
    protected String effect;
    
    public String getName(){
        return name;
    }
    
    public abstract boolean checkPrereqs(Trainer t);
    
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
    
    public String getEffect(){
        return effect;
    }
    
    @Override
    public boolean equals(Object o){
        if(o.getClass() == this.getClass()){
            Edge m = (Edge) o;
            
            return this.name.equals(m.getName());
        }
        return false;
    }

    @Override
    public int hashCode() {
        int hash = 3;
        hash = 37 * hash + Objects.hashCode(this.name);
        return hash;
    }
}
