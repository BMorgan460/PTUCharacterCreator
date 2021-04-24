package PTUCharacterCreator.Feats;
import PTUCharacterCreator.Trainer;
import PTUCharacterCreator.Feature;
public class Warper extends Feature {
	{
		name = "Warper";
		tags = "[Class] [+Speed]";
		frequency = "Static";
		effect = "You gain the Probability Control Ability.";
		prereqs.put("Elemental Connection (Psychic)", 0);
		prereqs.put("Guile", 3);
	}
	public Warper(){}
	@Override
	public boolean checkPrereqs(Trainer t) {
		return t.checkSkillRank("Guile",3);
	}
}