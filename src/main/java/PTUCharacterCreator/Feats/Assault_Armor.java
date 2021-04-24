package PTUCharacterCreator.Feats;
import PTUCharacterCreator.Trainer;
import PTUCharacterCreator.Feature;
public class Assault_Armor extends Feature {
	{
		name = "Assault Armor";
		tags = "";
		frequency = "Scene x2 - Free Action";
		effect = "Trigger: Your Pokemon hits with a Steel-Type attack Effect: Your Pokemon may add its Defense Stat to their Damage Roll in place of the attacks normal offensive stat.";
		prereqs.put("Polished Shine", -1);
		prereqs.put("Type-Linked Skill at Expert", 0);
	}
	public Assault_Armor(){}
	@Override
	public boolean checkPrereqs(Trainer t) {
		return t.hasFeat("Polished Shine");
	}
}