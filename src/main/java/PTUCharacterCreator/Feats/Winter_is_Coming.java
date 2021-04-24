package PTUCharacterCreator.Feats;
import PTUCharacterCreator.Trainer;
import PTUCharacterCreator.Feature;
public class Winter_is_Coming extends Feature {
	{
		name = "Winter is Coming";
		tags = "[+Attack or Special Attack]";
		frequency = "Static";
		effect = "You gain the Frostbite Ability";
		prereqs.put("Athletics", 6);
		prereqs.put("Survival", 6);
	}
	public Winter_is_Coming(){}
	@Override
	public boolean checkPrereqs(Trainer t) {
		return t.checkSkillRank("Athletics",6) && t.checkSkillRank("Survival",6);
	}
}