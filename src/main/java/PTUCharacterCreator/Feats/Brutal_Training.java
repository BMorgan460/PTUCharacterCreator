package PTUCharacterCreator.Feats;
import PTUCharacterCreator.Trainer;
import PTUCharacterCreator.Feature;
public class Brutal_Training extends Feature {
	{
		name = "Brutal Training";
		tags = "[Training][Orders]";
		frequency = "At-Will - Special";
		effect = "The target becomes Brutal until the end of the effect duration. Brutal Pokemon increase the Critical-Hit and Effect Range of all attacks by +1.";
		prereqs.put("Intimidate", 3);
		prereqs.put("Command", 2);
	}
	public Brutal_Training(){}
	@Override
	public boolean checkPrereqs(Trainer t) {
		return t.checkSkillRank("Intimidate",3) && t.checkSkillRank("Command",2);
	}
}