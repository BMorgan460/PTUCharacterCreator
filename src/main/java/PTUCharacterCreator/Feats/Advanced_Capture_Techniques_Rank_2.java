package PTUCharacterCreator.Feats;
import PTUCharacterCreator.Trainer;
import PTUCharacterCreator.Feature;
public class Advanced_Capture_Techniques_Rank_2 extends Feature {
	{
		name = "Advanced Capture Techniques Rank 2";
		tags = "[Ranked 4][+Speed]";
		frequency = "Static";
		effect = "You gain two Capture Techniques of your choice. You must meet any prerequisites of the Technique. You may qualify for Advanced Capture Techniques prerequisites with the Acrobatics, Athletics, Stealth, Survival, Guile, or Perception Skills only.";
		prereqs.put("Capture Specialist", -1);
		prereqs.put("any 2 Skills at Adept Rank", 0);
	}
	public Advanced_Capture_Techniques_Rank_2(){}
	@Override
	public boolean checkPrereqs(Trainer t) {
            String[] s = {"Acrobatics", "Athletics", "Stealth", "Survival", "Perception", "Guile"};
            return t.hasFeat("Capture Specialist") && checkMultipleSkills(t,s,4,2);
	}
}