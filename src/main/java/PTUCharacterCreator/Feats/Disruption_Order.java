package PTUCharacterCreator.Feats;
import PTUCharacterCreator.Trainer;
import PTUCharacterCreator.Feature;
public class Disruption_Order extends Feature {
	{
		name = "Disruption Order";
		tags = "";
		frequency = "Daily x3 - Free Action";
		effect = "Trigger: Your Pokemon hits with a Bug-Type Move Effect: Until the end of users next turn, all targets hit by the Move are Slowed, suffer a -X to Accuracy Rolls, and are Flinched by Damaging Attacks on 16+.";
		prereqs.put("Insectoid Utility", -1);
		prereqs.put("Type-Linked Skill at Master", 0);
	}
	public Disruption_Order(){}
	@Override
	public boolean checkPrereqs(Trainer t) {
		return t.hasFeat("Insectoid Utility");
	}
}