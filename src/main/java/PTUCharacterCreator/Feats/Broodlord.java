package PTUCharacterCreator.Feats;
import PTUCharacterCreator.Trainer;
import PTUCharacterCreator.Feature;
public class Broodlord extends Feature {
	{
		name = "Broodlord";
		tags = "";
		frequency = "Static";
		effect = "You gain the following Ability based on your Embrace. Arachnids Embrace: Tinted Lens Monarchs Embrace: Compound Eyes";
		prereqs.put("Enhanced Embrace Rank 2", -1);
		prereqs.put("Command", 5);
		prereqs.put("Survival", 5);
	}
	public Broodlord(){}
	@Override
	public boolean checkPrereqs(Trainer t) {
		return t.hasFeat("Enhanced Embrace Rank 2") && t.checkSkillRank("Command",5) && t.checkSkillRank("Survival",5);
	}
}