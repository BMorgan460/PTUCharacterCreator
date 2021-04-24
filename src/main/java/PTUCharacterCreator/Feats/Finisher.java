package PTUCharacterCreator.Feats;
import PTUCharacterCreator.Trainer;
import PTUCharacterCreator.Feature;
public class Finisher extends Feature {
	{
		name = "Finisher";
		tags = "[+Speed]";
		frequency = "Static";
		effect = "You and your Pokemon gain a +5 bonus to Damage Rolls against Fainted, Flinched, Sleeping, Stuck, Slowed, Trapped, or Tripped targets.";
		prereqs.put("Hunter", -1);
		prereqs.put("Stealth", 4);
		prereqs.put("Survival", 4);
	}
	public Finisher(){}
	@Override
	public boolean checkPrereqs(Trainer t) {
		return t.hasFeat("Hunter") && t.checkSkillRank("Stealth",4) && t.checkSkillRank("Survival",4);
	}
}