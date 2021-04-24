package PTUCharacterCreator.Feats;
import PTUCharacterCreator.Trainer;
import PTUCharacterCreator.Feature;
public class Silent_Assassin extends Feature {
	{
		name = "Silent Assassin";
		tags = "[+Attack] [Weapon]";
		frequency = "Bind 2 AP - Standard Action";
		effect = "While this Feature is Bound, your Struggle Attacks and Weapon Attacks deal Ghost-Type Damage, and you gain the Dead Silent Capability.";
		prereqs.put("Apparition", -1);
		prereqs.put("Ocu Edu", 4);
		prereqs.put("Intimidate", 4);
	}
	public Silent_Assassin(){}
	@Override
	public boolean checkPrereqs(Trainer t) {
		return t.hasFeat("Apparition") && t.checkSkillRank("Ocu Edu",4) && t.checkSkillRank("Intimidate",4);
	}
}