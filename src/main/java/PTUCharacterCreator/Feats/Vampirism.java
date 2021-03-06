package PTUCharacterCreator.Feats;
import PTUCharacterCreator.Trainer;
import PTUCharacterCreator.Feature;
public class Vampirism extends Feature {
	{
		name = "Vampirism";
		tags = "";
		frequency = "Scene x2 - Free Action";
		effect = "Trigger: Your Pokemon hits an adjacent foe with a Ghost-Type Move Effect: Choose a Stat. The triggering foe loses a Tick of Hit Points and a Combat Stage in that Stat. Your Pokemon gains 1 Combat Stage in the chosen Stat, and a Tick of Temporary Hit Points.";
		prereqs.put("Ghost Step", -1);
		prereqs.put("Type-Linked Skill at Expert", 0);
	}
	public Vampirism(){}
	@Override
	public boolean checkPrereqs(Trainer t) {
		return t.hasFeat("Ghost Step");
	}
}