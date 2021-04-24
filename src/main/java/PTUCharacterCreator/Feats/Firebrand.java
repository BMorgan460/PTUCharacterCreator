package PTUCharacterCreator.Feats;
import PTUCharacterCreator.Trainer;
import PTUCharacterCreator.Feature;
public class Firebrand extends Feature {
	{
		name = "Firebrand";
		tags = "[+Special Attack or Attack]";
		frequency = "Static";
		effect = "Your Fire-Type Moves Burn Targets on a roll of 19+. If a move already has a chance of Burning foes, Firebrand increases the effect range by +2.";
		prereqs.put("Fire Bringer", -1);
		prereqs.put("Combat", 4);
		prereqs.put("Focus", 4);
	}
	public Firebrand(){}
	@Override
	public boolean checkPrereqs(Trainer t) {
		return t.hasFeat("Fire Bringer") && t.checkSkillRank("Combat",4) && t.checkSkillRank("Focus",4);
	}
}