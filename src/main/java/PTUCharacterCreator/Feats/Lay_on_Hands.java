package PTUCharacterCreator.Feats;
import PTUCharacterCreator.Trainer;
import PTUCharacterCreator.Feature;
public class Lay_on_Hands extends Feature {
	{
		name = "Lay on Hands";
		tags = "[+HP]";
		frequency = "Static";
		effect = "Choose Blessed Touch or Healer. You gain the Chosen Ability.";
		prereqs.put("Sage", -1);
		prereqs.put("Ocu Edu", 5);
	}
	public Lay_on_Hands(){}
	@Override
	public boolean checkPrereqs(Trainer t) {
		return t.hasFeat("Sage") && t.checkSkillRank("Ocu Edu",5);
	}
}