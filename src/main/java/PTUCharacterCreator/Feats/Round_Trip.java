package PTUCharacterCreator.Feats;
import PTUCharacterCreator.Trainer;
import PTUCharacterCreator.Feature;
public class Round_Trip extends Feature {
	{
		name = "Round Trip";
		tags = "[+Speed]";
		frequency = "1 AP - Free Action";
		effect = "Trigger: Your Pokemon uses a Move Effect: You may immediately switch your Pokemon that just performed a Move for another of your Pokemon. This effect lets Pokemon with the Trapped condition switch out.";
		prereqs.put("Juggler", -1);
		prereqs.put("Acrobatics", 4);
		prereqs.put("Guile", 4);
	}
	public Round_Trip(){}
	@Override
	public boolean checkPrereqs(Trainer t) {
		return t.hasFeat("Juggler") && t.checkSkillRank("Acrobatics",4) && t.checkSkillRank("Guile",4);
	}
}