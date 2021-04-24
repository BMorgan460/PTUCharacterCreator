package PTUCharacterCreator.Feats;
import PTUCharacterCreator.Trainer;
import PTUCharacterCreator.Feature;
public class Arcane_Favor extends Feature {
	{
		name = "Arcane Favor";
		tags = "";
		frequency = "Scene x2 - Free Action";
		effect = "Trigger: Your Pokemon uses a Fairy-Type Move Effect: Your Pokemon and all allies on the Field gain a +1 Bonus to all rolls for one full round.";
		prereqs.put("Fairy Lights", -1);
		prereqs.put("Type-Linked Skill at Adept", 0);
	}
	public Arcane_Favor(){}
	@Override
	public boolean checkPrereqs(Trainer t) {
		return t.hasFeat("Fairy Lights");
	}
}