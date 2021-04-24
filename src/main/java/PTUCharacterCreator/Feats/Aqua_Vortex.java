package PTUCharacterCreator.Feats;
import PTUCharacterCreator.Trainer;
import PTUCharacterCreator.Feature;
public class Aqua_Vortex extends Feature {
	{
		name = "Aqua Vortex";
		tags = "";
		frequency = "Scene x2 - Free Action";
		effect = "Trigger: Your Pokemon hits with a damaging Water- Type attack Effect: All targets of the attack are put in a Vortex, and take a penalty to all Damage Rolls equal to your Type-Linked Skill Rank while in the Vortex.";
		prereqs.put("Flood!", -1);
		prereqs.put("Type-Linked Skill at Master", 0);
	}
	public Aqua_Vortex(){}
	@Override
	public boolean checkPrereqs(Trainer t) {
		return t.hasFeat("Flood!");
	}
}