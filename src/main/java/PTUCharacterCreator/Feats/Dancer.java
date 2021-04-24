package PTUCharacterCreator.Feats;
import PTUCharacterCreator.Trainer;
import PTUCharacterCreator.Feature;
public class Dancer extends Feature {
	{
		name = "Dancer";
		tags = "[Class] [+Speed]";
		frequency = "Static";
		effect = "Choose Spinning Dance or Own Tempo. You gain the chosen Ability.";
		prereqs.put("Acrobatics", 3);
		prereqs.put("Athletics", 3);
		prereqs.put("Charm", 3);
	}
	public Dancer(){}
	@Override
	public boolean checkPrereqs(Trainer t) {
		return t.checkSkillRank("Acrobatics",3) && t.checkSkillRank("Athletics",3) && t.checkSkillRank("Charm",3);
	}
}