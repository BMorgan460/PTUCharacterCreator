package PTUCharacterCreator.Feats;
import PTUCharacterCreator.Trainer;
import PTUCharacterCreator.Feature;
public class Bare_the_Dragons_Claws extends Feature {
	{
		name = "Bare the Dragon's Claws";
		tags = "[+Attack][Weapon]";
		frequency = "Static";
		effect = "Your learn the Moves Dragon Claw and Dragon Tail. You may use these Moves as Weapon Attacks when wielding Melee Weapons.";
		prereqs.put("Herald of Pride", -1);
		prereqs.put("Command", 4);
		prereqs.put("Intimidate", 4);
	}
	public Bare_the_Dragons_Claws(){}
	@Override
	public boolean checkPrereqs(Trainer t) {
		return t.hasFeat("Herald of Pride") && t.checkSkillRank("Command",4) && t.checkSkillRank("Intimidate",4);
	}
}