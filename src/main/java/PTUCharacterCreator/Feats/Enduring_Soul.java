package PTUCharacterCreator.Feats;
import PTUCharacterCreator.Trainer;
import PTUCharacterCreator.Feature;
public class Enduring_Soul extends Feature {
	{
		name = "Enduring Soul";
		tags = "[Class]";
		frequency = "Static";
		effect = "You may add to your Pokemons HP stat when they level up, ignoring Base Relation, and you do not need to “correct” Stats due to this inflated HP.";
		prereqs.put("Athletics", 3);
		prereqs.put("Focus", 3);
	}
	public Enduring_Soul(){}
	@Override
	public boolean checkPrereqs(Trainer t) {
		return t.checkSkillRank("Athletics",3) && t.checkSkillRank("Focus",3);
	}
}