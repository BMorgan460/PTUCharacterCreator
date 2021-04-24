package PTUCharacterCreator.Feats;
import PTUCharacterCreator.Trainer;
import PTUCharacterCreator.Feature;
public class Tag_In extends Feature {
	{
		name = "Tag In";
		tags = "[+Speed]";
		frequency = "1 AP - Free Action";
		effect = "Trigger: You recall a Pokemon Effect: The next Pokemon you send out is treated as if the recalled Pokemon had used Baton Pass on it.";
		prereqs.put("Round Trip", -1);
		prereqs.put("Acrobatics", 5);
		prereqs.put("Guile", 5);
	}
	public Tag_In(){}
	@Override
	public boolean checkPrereqs(Trainer t) {
		return t.hasFeat("Round Trip") && t.checkSkillRank("Acrobatics",5) && t.checkSkillRank("Guile",5);
	}
}