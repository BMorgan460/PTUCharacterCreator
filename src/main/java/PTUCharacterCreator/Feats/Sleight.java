package PTUCharacterCreator.Feats;
import PTUCharacterCreator.Trainer;
import PTUCharacterCreator.Feature;
public class Sleight extends Feature {
	{
		name = "Sleight";
		tags = "";
		frequency = "Scene x2 - Free Action";
		effect = "Your Pokemon may activate Sleight as an Interrupt to immediately take their turn and use a Status-Class Move as a Standard Action. If this Move targets a foe, it ignores Substitute and Defensive Abilities, and Blessings may not be activated against the Move.";
		prereqs.put("4 Trickster Features", 0);
		prereqs.put("Guile", 6);
	}
	public Sleight(){}
	@Override
	public boolean checkPrereqs(Trainer t) {
		return t.checkSkillRank("Guile",6) && t.hasFeat("Trickster");
	}
}