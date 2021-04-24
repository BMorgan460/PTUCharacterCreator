package PTUCharacterCreator.Feats;
import PTUCharacterCreator.Trainer;
import PTUCharacterCreator.Feature;
public class BlackOut_Strike extends Feature {
	{
		name = "Black-Out Strike";
		tags = "";
		frequency = "Daily x3 - Free Action";
		effect = "Trigger: Your Pokemon hits with a damaging Dark- Type Move Effect: After the triggering attack is resolved, the target of the attack gains an Injury and falls asleep. If this attack would put them are 3 or more injuries or at or under 25% of their maximum Hit Points, the target instead becomes Fainted. Black-Out Strike may be used only once per Scene.";
		prereqs.put("Clever Ruse", -1);
		prereqs.put("Type-Linked Skill at Master", 0);
	}
	public BlackOut_Strike(){}
	@Override
	public boolean checkPrereqs(Trainer t) {
		return t.hasFeat("Clever Ruse");
	}
}