package PTUCharacterCreator.Feats;
import PTUCharacterCreator.Trainer;
import PTUCharacterCreator.Feature;
public class Poison_Weapon extends Feature {
	{
		name = "Poison Weapon";
		tags = "[+Speed] [Weapon]";
		frequency = "1 AP - Free Action";
		effect = "Trigger: You make a Weapon Attack. Effect: The attack or Move Poisons its targets on 16+, and you may have it deal Poison-Type Damage if you wish.";
		prereqs.put("Ninja", -1);
		prereqs.put("Stealth", 4);
	}
	public Poison_Weapon(){}
	@Override
	public boolean checkPrereqs(Trainer t) {
		return t.hasFeat("Ninja") && t.checkSkillRank("Stealth",4);
	}
}