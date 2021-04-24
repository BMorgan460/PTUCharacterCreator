package PTUCharacterCreator.Feats;
import PTUCharacterCreator.Trainer;
import PTUCharacterCreator.Feature;
public class Lessons_In_Rage__Pain extends Feature {
	{
		name = "Lessons In Rage & Pain";
		tags = "[+HP]";
		frequency = "Static";
		effect = "While you have at least 1 Injury, add +X to your Damage Rolls with Rage, Flail, Fury Swipes, Thrash, and Weapon Attacks. X is equal to your Intimidate Rank plus the number of Injuries you have. You do not lose Hit Points from being Heavily Injured, and Injuries beyond the 5th do not lower your Maximum Hit Points.";
		prereqs.put("Berserker", -1);
		prereqs.put("Intimidate", 4);
	}
	public Lessons_In_Rage__Pain(){}
	@Override
	public boolean checkPrereqs(Trainer t) {
		return t.hasFeat("Berserker") && t.checkSkillRank("Intimidate",4);
	}
}