package PTUCharacterCreator.Feats;
import PTUCharacterCreator.Trainer;
import PTUCharacterCreator.Feature;
public class Lean_In extends Feature {
	{
		name = "Lean In";
		tags = "[+Speed]";
		frequency = "Scene x2 - Free Action";
		effect = "Trigger: You and your Mount both take Damage from a Burst, Blast, Cone, or Line Effect: Both you and your Mount Resist the attack one step further.";
		prereqs.put("Ride as One", -1);
	}
	public Lean_In(){}
	@Override
	public boolean checkPrereqs(Trainer t) {
		return t.hasFeat("Ride as One");
	}
}