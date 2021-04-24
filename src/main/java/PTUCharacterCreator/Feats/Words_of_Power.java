package PTUCharacterCreator.Feats;
import PTUCharacterCreator.Trainer;
import PTUCharacterCreator.Feature;
public class Words_of_Power extends Feature {
	{
		name = "Words of Power";
		tags = "[+Attack or Special Attack]";
		frequency = "Static";
		effect = "Trigger: You or your Pokemon use Hidden Power Effect: Instead of a Burst, you may choose to have Hidden Power be a 1 Target Melee, 1 Target 6m, or Cone 2. Additionally, you and your Prime Unown always have STAB on Hidden Power as if you or they were of the same Type.";
		prereqs.put("Ocu Edu", 4);
		prereqs.put("Hidden Power", -1);
	}
	public Words_of_Power(){}
	@Override
	public boolean checkPrereqs(Trainer t) {
		return t.checkSkillRank("Ocu Edu",4) && t.hasFeat("Hidden Power");
	}
}