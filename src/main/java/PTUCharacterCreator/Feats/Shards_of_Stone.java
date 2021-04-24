package PTUCharacterCreator.Feats;
import PTUCharacterCreator.Trainer;
import PTUCharacterCreator.Feature;
public class Shards_of_Stone extends Feature {
	{
		name = "Shards of Stone";
		tags = "[+Defense]";
		frequency = "Static";
		effect = "You learn the Moves Rock Slide and Stealth Rock";
		prereqs.put("Combat", 5);
		prereqs.put("Survival", 5);
	}
	public Shards_of_Stone(){}
	@Override
	public boolean checkPrereqs(Trainer t) {
		return t.checkSkillRank("Combat",5) && t.checkSkillRank("Survival",5);
	}
}