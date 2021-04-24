package PTUCharacterCreator.Feats;
import PTUCharacterCreator.Trainer;
import PTUCharacterCreator.Feature;
public class Advanced_Capture_Techniques_Rank_4 extends Feature {
	{
		name = "Advanced Capture Techniques Rank 4";
		tags = "[Ranked 4][+Speed]";
		frequency = "Static";
		effect = "You gain two Capture Techniques of your choice. You must meet any prerequisites of the Technique. You may qualify for Advanced Capture Techniques prerequisites with the Acrobatics, Athletics, Stealth, Survival, Guile, or Perception Skills only.";
		prereqs.put("Capture Specialist", -1);
		prereqs.put("any 3 Skills at Expert Rank", 0);
	}
	public Advanced_Capture_Techniques_Rank_4(){}
	@Override
	public boolean checkPrereqs(Trainer t) {
		String[] s = {"Acrobatics", "Athletics", "Stealth", "Survival", "Perception", "Guile"};
		return t.hasFeat("Capture Specialist") && checkMultipleSkills(t,s,5,3);
	}
}