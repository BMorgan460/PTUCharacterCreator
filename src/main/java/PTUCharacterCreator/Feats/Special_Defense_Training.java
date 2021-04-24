package PTUCharacterCreator.Feats;
import PTUCharacterCreator.Trainer;
import PTUCharacterCreator.Feature;
public class Special_Defense_Training extends Feature {
	{
		name = "Special Defense Training";
		tags = "[Branch]";
		frequency = "At-Will - Extended Action";
		effect = "Target: Your Pokemon with at least 1 Tutor Point Effect: Your Pokemon loses 1 Tutor Point and learns Amnesia or Light Screen, even if your Pokemon cannot normally learn this Move.";
		prereqs.put("Stat Ace", -1);
	}
	public Special_Defense_Training(){}
	@Override
	public boolean checkPrereqs(Trainer t) {
		return t.hasFeat("Special Defense Ace");
	}
}