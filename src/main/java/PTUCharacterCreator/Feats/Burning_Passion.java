package PTUCharacterCreator.Feats;
import PTUCharacterCreator.Trainer;
import PTUCharacterCreator.Feature;
public class Burning_Passion extends Feature {
	{
		name = "Burning Passion";
		tags = "[+Special Attack or Attack]";
		frequency = "Static";
		effect = "Choose Flash Fire or Flame Body. You gain the chosen Ability.";
		prereqs.put("Fire Bringer", -1);
		prereqs.put("Combat", 5);
		prereqs.put("Focus", 5);
	}
	public Burning_Passion(){}
	@Override
	public boolean checkPrereqs(Trainer t) {
		return t.hasFeat("Fire Bringer") && t.checkSkillRank("Combat",5) && t.checkSkillRank("Focus",5);
	}
}