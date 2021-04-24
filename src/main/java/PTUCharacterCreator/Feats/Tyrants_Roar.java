package PTUCharacterCreator.Feats;
import PTUCharacterCreator.Trainer;
import PTUCharacterCreator.Feature;
public class Tyrants_Roar extends Feature {
	{
		name = "Tyrants Roar";
		tags = "";
		frequency = "Scene x2 - Free Action";
		effect = "Trigger: Your Pokemon hits with a Dragon-Type Move Effect: Your Pokemon creates a Burst 2, Slowing all Foes in the area and causing those foes to lose 1 Combat Stage in any Stat in which they have positive Combat Stages.";
		prereqs.put("Type Ace", -1);
		prereqs.put("Dragon as Chosen Type", 0);
	}
	public Tyrants_Roar(){}
	@Override
	public boolean checkPrereqs(Trainer t) {
		return t.hasFeat("Type Ace");
	}
}