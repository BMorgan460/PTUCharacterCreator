package PTUCharacterCreator.Feats;
import PTUCharacterCreator.Trainer;
import PTUCharacterCreator.Feature;
public class Call_the_Dragons_Rage extends Feature {
	{
		name = "Call the Dragon's Rage";
		tags = "[+Attack][Weapon]";
		frequency = "Static";
		effect = "You learn the Moves Dragon Rush and Outrage. You may use these Moves as Weapon Attacks when wielding Melee Weapons.";
		prereqs.put("Bare the Dragon's Claws", -1);
		prereqs.put("Command", 6);
		prereqs.put("Intimidate", 6);
	}
	public Call_the_Dragons_Rage(){}
	@Override
	public boolean checkPrereqs(Trainer t) {
		return t.hasFeat("Bare the Dragon's Claws") && t.checkSkillRank("Command",6) && t.checkSkillRank("Intimidate",6);
	}
}