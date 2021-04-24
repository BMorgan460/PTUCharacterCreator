package PTUCharacterCreator.Feats;
import PTUCharacterCreator.Trainer;
import PTUCharacterCreator.Feature;
public class Deep_Cold extends Feature {
	{
		name = "Deep Cold";
		tags = "";
		frequency = "Daily x3 - Free Action";
		effect = "Trigger: Your Pokemon hits with a damaging Ice-Type Move Effect: The target is Frozen, and has their Attack, Special Attack, and Speed Combat Stages lowered by 1 each. The target is automatically cured of the Frozen Condition after 1 full round. A foe may be affected by Deep Cold only once per Scene.";
		prereqs.put("Glacial Ice", -1);
		prereqs.put("Type-Linked Skill at Master", 0);
	}
	public Deep_Cold(){}
	@Override
	public boolean checkPrereqs(Trainer t) {
		return t.hasFeat("Glacial Ice");
	}
}