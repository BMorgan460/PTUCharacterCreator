package PTUCharacterCreator.Feats;
import PTUCharacterCreator.Trainer;
import PTUCharacterCreator.Feature;
public class Swift_Strikes extends Feature {
	{
		name = "Swift Strikes";
		tags = "[+Speed] [Weapon]";
		frequency = "1 AP - Standard Action";
		effect = "Use a Weapon Attack as if it had the Priority Keyword. If the Move already had the Priority Keyword, use it as if it had the Priority (Advanced) Keyword instead.";
		prereqs.put("4 Skirmisher Features", 0);
		prereqs.put("Acrobatics", 6);
		prereqs.put("Combat", 6);
	}
	public Swift_Strikes(){}
	@Override
	public boolean checkPrereqs(Trainer t) {
		return t.checkSkillRank("Acrobatics",6) && t.checkSkillRank("Combat",6);
	}
}