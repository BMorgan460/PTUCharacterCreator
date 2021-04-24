package PTUCharacterCreator.Feats;
import PTUCharacterCreator.Trainer;
import PTUCharacterCreator.Feature;
public class Fan_The_Flames extends Feature {
	{
		name = "Fan The Flames";
		tags = "";
		frequency = "Scene x2 - Free Action";
		effect = "Trigger: Your Pokemon uses a 1-Target Fire-Type Move Effect: Instead of its usual range, the attack may be performed as if it had a range of Burst 1 if melee, or Cone 2 if ranged.";
		prereqs.put("Brightest Flame", -1);
		prereqs.put("Type-Linked Skill at Master", 0);
	}
	public Fan_The_Flames(){}
	@Override
	public boolean checkPrereqs(Trainer t) {
		return t.hasFeat("Brightest Flame");
	}
}