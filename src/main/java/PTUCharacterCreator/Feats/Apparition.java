package PTUCharacterCreator.Feats;
import PTUCharacterCreator.Trainer;
import PTUCharacterCreator.Feature;
public class Apparition extends Feature {
	{
		name = "Apparition";
		tags = "[Class] [+Attack] [Weapon]";
		frequency = "Static";
		effect = "When wielding Melee Weapons, you may use Occult Education or Intimidate instead of Combat to determine the Damage Base of your Struggle Attacks, to resist Disarm Maneuvers, and to qualify for a Weapons Moves. Your Weapon Attacks always treat you as having the Reach Capability, and foes may not activate Reaction effects against them that specify being hit by a Melee Attack.";
		prereqs.put("Elemental Connection (Ghost)", 0);
		prereqs.put("Intimidate", 3);
		prereqs.put("Ocu Edu", 3);
	}
	public Apparition(){}
	@Override
	public boolean checkPrereqs(Trainer t) {
		return t.checkSkillRank("Intimidate",3) && t.checkSkillRank("Ocu Edu",3);
	}
}