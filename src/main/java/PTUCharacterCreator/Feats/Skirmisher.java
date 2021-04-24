package PTUCharacterCreator.Feats;
import PTUCharacterCreator.Trainer;
import PTUCharacterCreator.Feature;
public class Skirmisher extends Feature {
	{
		name = "Skirmisher";
		tags = "[Class] [+Speed] [Weapon]";
		frequency = "Static";
		effect = "Choose Flutter or Vanguard. You gain the Chosen Ability.";
		prereqs.put("Combat", 3);
		prereqs.put("Acrobatics", 3);
	}
	public Skirmisher(){}
	@Override
	public boolean checkPrereqs(Trainer t) {
		return t.checkSkillRank("Combat",3) && t.checkSkillRank("Acrobatics",3);
	}
}