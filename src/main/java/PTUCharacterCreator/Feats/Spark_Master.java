package PTUCharacterCreator.Feats;
import PTUCharacterCreator.Trainer;
import PTUCharacterCreator.Feature;
public class Spark_Master extends Feature {
	{
		name = "Spark Master";
		tags = "[Class][+Speed]";
		frequency = "Static";
		effect = "Choose Static or Electrodash. You gain the Chosen Ability.";
		prereqs.put("Elemental Connection (Electric)", 0);
		prereqs.put("Focus", 3);
		prereqs.put("Acrobatics", 3);
	}
	public Spark_Master(){}
	@Override
	public boolean checkPrereqs(Trainer t) {
		return t.checkSkillRank("Focus",3) && t.checkSkillRank("Acrobatics",3);
	}
}