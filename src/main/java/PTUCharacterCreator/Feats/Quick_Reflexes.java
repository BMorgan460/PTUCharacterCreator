package PTUCharacterCreator.Feats;
import PTUCharacterCreator.Trainer;
import PTUCharacterCreator.Feature;
public class Quick_Reflexes extends Feature {
	{
		name = "Quick Reflexes";
		tags = "[+Speed]";
		frequency = "Static";
		effect = "You gain the Dodge Ability.";
		prereqs.put("Tumbler", -1);
		prereqs.put("Acrobatics", 5);
	}
	public Quick_Reflexes(){}
	@Override
	public boolean checkPrereqs(Trainer t) {
		return t.hasFeat("Tumbler") && t.checkSkillRank("Acrobatics",5);
	}
}