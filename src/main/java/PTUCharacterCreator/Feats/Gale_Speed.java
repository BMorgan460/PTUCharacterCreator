package PTUCharacterCreator.Feats;
import PTUCharacterCreator.Trainer;
import PTUCharacterCreator.Feature;
public class Gale_Speed extends Feature {
	{
		name = "Gale Speed";
		tags = "[+Speed]";
		frequency = "Static";
		effect = "Choose Celebrate or Gale Wings. You gain the chosen Ability.";
		prereqs.put("Raging Winds Rank 1", -1);
		prereqs.put("Acrobatics", 6);
		prereqs.put("Perception", 6);
	}
	public Gale_Speed(){}
	@Override
	public boolean checkPrereqs(Trainer t) {
		return t.hasFeat("Raging Winds Rank 1") && t.checkSkillRank("Acrobatics",6) && t.checkSkillRank("Perception",6);
	}
}