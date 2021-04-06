package PTUCharacterCreator;

import java.util.ArrayList;
import java.util.HashMap;

/**
 * Class used to store Edges
 * @author Blake Morgan
 */
public class Edge {
    protected String name;
    protected HashMap<String,Integer> prereqs;
    protected String effect;
    
    public String getName(){
        return name;
    }
    
    public boolean checkPrereqs(HashMap<String,Integer> skills, ArrayList<Edge> edges, int level){
        boolean flag = true;
        for (String key : prereqs.keySet()) {
            if(skills.containsKey(key)){
                if(skills.get(key) < prereqs.get(key)){
                    flag = false;
                    break;
                }
            }else{
                boolean edgeFlag = false;
                for(Edge e : edges){
                    if(e.getName().equals(key)){
                        edgeFlag = true;
                    }
                }
                if(!edgeFlag){
                    flag = false;
                    break;
                }
            }
        }
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
    
    public String getEffect(){
        return effect;
    }
    
    @Override
    public boolean equals(Object o){
        if(o.getClass() == Edge.class){
            Edge m = (Edge) o;
            return this.name.equals(m.getName());
        }
        return false;
    }
}
