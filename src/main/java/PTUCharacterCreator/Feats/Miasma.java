package PTUCharacterCreator.Feats;
import PTUCharacterCreator.Trainer;
import PTUCharacterCreator.Feature;
public class Miasma extends Feature {
	{
		name = "Miasma";
		tags = "";
		frequency = "Scene x2 - Free Action";
		effect = "Trigger: Your Pokemon misses with a Poison-Type Move Effect: Your Pokemon may use either Smokescreen or Poison Gas as if they were on their Move List. When used this way, these Moves ignore Frequency Limitations, and are used as a Ranged Blast 3, with the blast centered on the square targeted by the triggering attack. Poison-Type Pokemon are not negatively affected by Smoke Screens created this way. Your Pokemon may also trigger Miasma deliberately as a Standard Action.";
		prereqs.put("Potent Venom", -1);
		prereqs.put("Type-Linked Skill at Expert", 0);
	}
	public Miasma(){}
	@Override
	public boolean checkPrereqs(Trainer t) {
		return t.hasFeat("Potent Venom");
	}
}