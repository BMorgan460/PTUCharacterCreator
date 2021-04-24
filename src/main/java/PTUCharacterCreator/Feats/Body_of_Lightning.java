package PTUCharacterCreator.Feats;
import PTUCharacterCreator.Trainer;
import PTUCharacterCreator.Feature;
public class Body_of_Lightning extends Feature {
	{
		name = "Body of Lightning";
		tags = "[+Speed]";
		frequency = "Static";
		effect = "Choose Volt Absorb or Motor Drive. You gain the Chosen Ability.";
		prereqs.put("Acrobatics", 6);
		prereqs.put("Focus", 6);
	}
	public Body_of_Lightning(){}
	@Override
	public boolean checkPrereqs(Trainer t) {
		return t.checkSkillRank("Acrobatics",6) && t.checkSkillRank("Focus",6);
	}
}