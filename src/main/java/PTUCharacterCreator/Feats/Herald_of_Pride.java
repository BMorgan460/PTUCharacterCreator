package PTUCharacterCreator.Feats;
import PTUCharacterCreator.Trainer;
import PTUCharacterCreator.Feature;
public class Herald_of_Pride extends Feature {
	{
		name = "Herald of Pride";
		tags = "[Class][+Attack][Weapon]";
		frequency = "Static";
		effect = "Static Effect: When wielding Melee Weapons, you may use Command or Intimidate instead of Combat to determine the Damage Base of your Struggle Attacks, to resist Disarm Maneuvers, and to qualify for a Weapons Moves. Your Weapon Attacks ignore Damage Reduction up to your Command or Intimidate Rank.";
		prereqs.put("Elemental Connection (Dragon)", 0);
		prereqs.put("Command", 3);
		prereqs.put("Intimidate", 3);
	}
	public Herald_of_Pride(){}
	@Override
	public boolean checkPrereqs(Trainer t) {
		return t.checkSkillRank("Command",3) && t.checkSkillRank("Intimidate",3);
	}
}