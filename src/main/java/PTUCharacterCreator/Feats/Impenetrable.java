package PTUCharacterCreator.Feats;
import PTUCharacterCreator.Trainer;
import PTUCharacterCreator.Feature;
public class Impenetrable extends Feature {
	{
		name = "Impenetrable";
		tags = "[+Defense]";
		frequency = "Static";
		effect = "You gain the Bulletproof Ability.";
		prereqs.put("Steelheart", -1);
		prereqs.put("Athletics", 5);
		prereqs.put("Focus", 5);
	}
	public Impenetrable(){}
	@Override
	public boolean checkPrereqs(Trainer t) {
		return t.hasFeat("Steelheart") && t.checkSkillRank("Athletics",5) && t.checkSkillRank("Focus",5);
	}
}