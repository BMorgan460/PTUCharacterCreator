package PTUCharacterCreator.Feats;
import PTUCharacterCreator.Trainer;
import PTUCharacterCreator.Feature;
public class Hex_Maniac extends Feature {
	{
		name = "Hex Maniac";
		tags = "[Class][+HP]";
		frequency = "Static";
		effect = "Choose Cursed Body or Omen. You gain the Chosen Ability.";
		prereqs.put("Ocu Edu", 3);
	}
	public Hex_Maniac(){}
	@Override
	public boolean checkPrereqs(Trainer t) {
		return t.checkSkillRank("Ocu Edu",3);
	}
}