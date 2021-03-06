package PTUCharacterCreator.Feats;
import PTUCharacterCreator.Trainer;
import PTUCharacterCreator.Feature;
public class Fountain_of_Life extends Feature {
	{
		name = "Fountain of Life";
		tags = "";
		frequency = "Daily x3 - Free Action";
		effect = "Trigger: Your Water-Type Pokemon hits with a damaging Water-Type attack Effect: You may choose to take a penalty to the Damage Roll for the attack up to triple your Type-Linked Skill Rank or up to half the rolled damage for the triggering attack, whichever is lower. Your Pokemon gains twice that value in Temporary Hit Points and may cure themselves of one Status Affliction. Fountain of Life may only be used once per Scene per Pokemon.";
		prereqs.put("Flood!", -1);
		prereqs.put("Type-Linked Skill at Expert", 0);
	}
	public Fountain_of_Life(){}
	@Override
	public boolean checkPrereqs(Trainer t) {
		return t.hasFeat("Flood!");
	}
}