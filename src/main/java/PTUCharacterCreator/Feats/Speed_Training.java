package PTUCharacterCreator.Feats;
import PTUCharacterCreator.Trainer;
import PTUCharacterCreator.Feature;
public class Speed_Training extends Feature {
	{
		name = "Speed Training";
		tags = "[Branch]";
		frequency = "At-Will - Extended Action";
		effect = "Target: Your Pokemon with at least 1 Tutor Point Effect: Your Pokemon loses 1 Tutor Point and learns Agility or After You, even if your Pokemon cannot normally learn this Move.";
		prereqs.put("Stat Ace", -1);
	}
	public Speed_Training(){}
	@Override
	public boolean checkPrereqs(Trainer t) {
		return t.hasFeat("Speed Ace");
	}
}