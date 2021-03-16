package PTUCharacterCreator;

/**
 * Class to store the parent class that stores all moves
 * Originally used in PTU Random Pokemon Generator.
 * @author Blake Morgan
 */
public class Moves {
    protected String name;
    protected String type;
    protected String category;
    protected String frequency;
    protected String range;
    protected String effects;
    protected int AC;
    protected int mDamageBase;
    protected int damageBase;

    public String getName() {
        return name;
    }
    public String getType() {
        return type;
    }
    public String getCategory() {
        return category;
    }
    public String getFreq() {
        return frequency;
    }
    public String getRange() {
        return range;
    }
    public String getEffect() {
        return effects;
    }
    public int getAC() {
        return AC;
    }
    public int getDB() {
        return damageBase;
    }

    public void increaseDB(int add) {
        if(damageBase != 0) {
            mDamageBase += add;
        }
    }

    @Override
    public String toString() {
        String result;
        if(name.equals("Rollout") || name.equals("Ice Ball")) {
            result = String.format("\"strike\":\"Rollout\",\"DB2\":%d,\"DB3\":%d,\"DB4\":%d,\"DB5\":%d,\"Name\":\"%s\",\"Type\":\"%s\",\"DType\":\"%s\",\"DB\":%d,\"Freq\":\"%s\",\"AC\":%d,\"Range\":\"%s\",\"Effects\":\"%s\""
                , mDamageBase + damageBase, mDamageBase + damageBase*2, mDamageBase + damageBase*3, mDamageBase + damageBase*4, name, type, category, mDamageBase, frequency, AC, range, effects);
        }else if(range.contains("Five Strike")) {
            result = String.format("\"strike\":\"Five\",\"DB2\":%d,\"DB3\":%d,\"DB4\":%d,\"DB5\":%d,\"Name\":\"%s\",\"Type\":\"%s\",\"DType\":\"%s\",\"DB\":%d,\"Freq\":\"%s\",\"AC\":%d,\"Range\":\"%s\",\"Effects\":\"%s\""
                , mDamageBase + damageBase, mDamageBase + damageBase*2, mDamageBase + damageBase*3  , mDamageBase + damageBase*4, name, type, category, mDamageBase, frequency, AC, range, effects);
        }else if(range.contains("Double Strike")) {
            result = String.format("\"strike\":\"Double\",\"DB2\":%d,\"Name\":\"%s\",\"Type\":\"%s\",\"DType\":\"%s\",\"DB\":%d,\"Freq\":\"%s\",\"AC\":%d,\"Range\":\"%s\",\"Effects\":\"%s\""
                , mDamageBase*2, name, type, category, mDamageBase, frequency, AC, range, effects);
        }else {
            result = String.format("\"Name\":\"%s\",\"Type\":\"%s\",\"DType\":\"%s\",\"DB\":%d,\"Freq\":\"%s\",\"AC\":%d,\"Range\":\"%s\",\"Effects\":\"%s\""
                , name, type, category, mDamageBase, frequency, AC, range, effects.replace('\"', '\''));
        }
        return result;
    }
}
