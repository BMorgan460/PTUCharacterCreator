package PTUCharacterCreator.Feats;
import PTUCharacterCreator.Trainer;
import PTUCharacterCreator.Feature;
public class Im_A_Doctor_Rank_2 extends Feature {
	{
		name = "I'm A Doctor Rank 2";
		tags = "[Ranked 2] [Gift] [9-15 Playtest]";
		frequency = "Static";
		effect = "Each Rank, you gain one of Field Clinic or Medic Training and one of Nurse or First Aid Expertise.";
		prereqs.put("Medic", -1);
		prereqs.put("Med Edu", 4);
	}
	public Im_A_Doctor_Rank_2(){}
	@Override
	public boolean checkPrereqs(Trainer t) {
		return t.hasFeat("Medic") && t.checkSkillRank("Med Edu",4);
	}
}