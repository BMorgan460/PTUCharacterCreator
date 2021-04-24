package PTUCharacterCreator.Feats;
import PTUCharacterCreator.Trainer;
import PTUCharacterCreator.Feature;
public class Enduring_Bloom extends Feature {
	{
		name = "Enduring Bloom";
		tags = "";
		frequency = "Scene x2 - Free Action";
		effect = "Trigger: Your Grass-Type Pokemon is hit by a damaging Bug, Fire, Flying, Ice, or Poison attack that deals Super-Effective Damage Effect: Your Pokemon gains Temporary Hit Points equal to twice your Type-Linked Skill Rank, and gains +1 Combat Stage in the Stat of your choice. If it is Sunny, they may gain +1 Combat Stage in a second, different Stat. You may activate Enduring Bloom only once per Scene per Pokemon.";
		prereqs.put("Foiling Foliage", -1);
		prereqs.put("Type-Linked Skill at Expert", 0);
	}
	public Enduring_Bloom(){}
	@Override
	public boolean checkPrereqs(Trainer t) {
		return t.hasFeat("Foiling Foliage");
	}
}