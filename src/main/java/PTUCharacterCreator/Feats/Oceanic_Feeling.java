package PTUCharacterCreator.Feats;
import PTUCharacterCreator.Trainer;
import PTUCharacterCreator.Feature;
public class Oceanic_Feeling extends Feature {
	{
		name = "Oceanic Feeling";
		tags = "[+Speed]";
		frequency = "Scene x2 - Free Action";
		effect = "You may activate Oceanic Feeling when either Wash Away or Storm Drain would be triggered to gain that Ability for 1 full round, if you do not already have it, and immediately Trigger it. Activating an Ability this way ignores its usual Frequency. You may use each Ability once per Scene this way.";
		prereqs.put("Water's Shroud", -1);
		prereqs.put("Acrobatics", 6);
		prereqs.put("Athletics", 6);
	}
	public Oceanic_Feeling(){}
	@Override
	public boolean checkPrereqs(Trainer t) {
		return t.hasFeat("Water's Shroud") && t.checkSkillRank("Acrobatics",6) && t.checkSkillRank("Athletics",6);
	}
}