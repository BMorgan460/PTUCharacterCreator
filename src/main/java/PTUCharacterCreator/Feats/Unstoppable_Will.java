package PTUCharacterCreator.Feats;
import PTUCharacterCreator.Trainer;
import PTUCharacterCreator.Feature;
public class Unstoppable_Will extends Feature {
	{
		name = "Unstoppable Will";
		tags = "[+Defense]";
		frequency = "Static";
		effect = "You gain the Discipline Ability.";
		prereqs.put("Slow or Steady", -1);
		prereqs.put("Combat", 5);
		prereqs.put("Focus", 5);
	}
	public Unstoppable_Will(){}
	@Override
	public boolean checkPrereqs(Trainer t) {
		return t.hasFeat("Slow or Steady") && t.checkSkillRank("Combat",5) && t.checkSkillRank("Focus",5);
	}
}