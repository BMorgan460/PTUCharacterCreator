package PTUCharacterCreator.Feats;
import PTUCharacterCreator.Trainer;
import PTUCharacterCreator.Feature;
public class Attack_Training extends Feature {
	{
		name = "Attack Training";
		tags = "[Branch]";
		frequency = "At-Will - Extended Action";
		effect = "Target: Your Pokemon with at least 1 Tutor Point Effect: Your Pokemon loses 1 Tutor Point and learns Swords Dance or Rage, even if your Pokemon cannot normally learn this Move.";
		prereqs.put("Stat Ace", -1);
	}
	public Attack_Training(){}
	@Override
	public boolean checkPrereqs(Trainer t) {
		return t.hasFeat("Attack Ace");
	}
}