package PTUCharacterCreator.Feats;
import PTUCharacterCreator.Trainer;
import PTUCharacterCreator.Feature;
public class Passing_Waltz extends Feature {
	{
		name = "Passing Waltz";
		tags = "[+Speed]";
		frequency = "1 AP - Free Action";
		effect = "Trigger: You or one of your Pokemon with Own Tempo or Spinning Dance uses a Dance Move Effect: Choose an ally within 3 meters of the triggering target. That ally gains Combat Stages from the triggering Move instead of the user.";
		prereqs.put("Dance Practice", -1);
		prereqs.put("Acrobatics", 6);
	}
	public Passing_Waltz(){}
	@Override
	public boolean checkPrereqs(Trainer t) {
		return t.hasFeat("Dance Practice") && t.checkSkillRank("Acrobatics",6);
	}
}