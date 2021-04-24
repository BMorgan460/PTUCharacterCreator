package PTUCharacterCreator.Feats;
import PTUCharacterCreator.Trainer;
import PTUCharacterCreator.Feature;
public class Mettle extends Feature {
	{
		name = "Mettle";
		tags = "[+Defense]";
		frequency = "Scene x2 - Free Action";
		effect = "Target: You take Massive Damage or Intercept a Damaging Attack. Effect: Resolve Damage as if the triggering attack was resisted one step. The triggering foe then loses 2 Combat Stages in the Attack Stat used by the triggering Attack.";
		prereqs.put("Roughneck", -1);
	}
	public Mettle(){}
	@Override
	public boolean checkPrereqs(Trainer t) {
		return t.hasFeat("Roughneck");
	}
}