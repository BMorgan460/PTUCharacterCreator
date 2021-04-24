package PTUCharacterCreator.Feats;
import PTUCharacterCreator.Trainer;
import PTUCharacterCreator.Feature;
public class Warped_Transmission extends Feature {
	{
		name = "Warped Transmission";
		tags = "[+Speed]";
		frequency = "2 AP - Swift Action";
		effect = "Trigger: You activate the Teleporter Capability or use the Move Ally Switch Effect: All adjacent foes to the square you end in after teleporting or using Ally Switch have their Evasion lowered by 3 for one full round and cannot trigger Attacks of Opportunity against you for Shifting until the end of your next turn.";
		prereqs.put("Farcast", -1);
		prereqs.put("Guile", 6);
	}
	public Warped_Transmission(){}
	@Override
	public boolean checkPrereqs(Trainer t) {
		return t.hasFeat("Farcast") && t.checkSkillRank("Guile",6);
	}
}