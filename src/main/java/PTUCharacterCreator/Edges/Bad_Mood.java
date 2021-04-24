package PTUCharacterCreator.Edges;
import PTUCharacterCreator.Trainer;
import PTUCharacterCreator.Edge;
public class Bad_Mood extends Edge {
	{
		name = "Bad Mood";
		effect = "Your Critical Hit Range is increased by +1 if you are suffering from a Persistent Status Affliction. Your Critical Hit Range is increased by +1 if you are suffering from a Volatile Status Affliction. These stack with each other, giving a total of +2 to Critical Hit Range if you are suffering from both a Persistant and a Volatile Status Affliction.";
		prereqs.put("Intimidate", 5);
	}
	public Bad_Mood(){}
	@Override
	public boolean checkPrereqs(Trainer t) {
		return t.checkSkillRank("Intimidate",5) && true;
	}
}