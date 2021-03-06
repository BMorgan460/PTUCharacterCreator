package PTUCharacterCreator.Feats;
import PTUCharacterCreator.Trainer;
import PTUCharacterCreator.Feature;
public class Stat_Training extends Feature {
	{
		name = "Stat Training";
		tags = "[Branch]";
		frequency = "At-Will - Extended Action";
		effect = "Target: Your Pokemon with at least 1 Tutor Point Effect: Your Pokemon loses 1 Tutor Point, and learns a Move based on your Chosen Stat, even if your Pokemon cannot normally learn this Move: ?? Attack: Swords Dance or Rage ?? Defense: Iron Defense or Reflect ?? Special Attack: Nasty Plot or Hidden Power ?? Special Defense: Amnesia or Light Screen ?? Speed: Agility or After You";
		prereqs.put("Stat Ace", -1);
	}
	public Stat_Training(){}
	@Override
	public boolean checkPrereqs(Trainer t) {
		return t.hasFeat("Stat Ace");
	}
}