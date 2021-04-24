package PTUCharacterCreator.Feats;
import PTUCharacterCreator.Trainer;
import PTUCharacterCreator.Feature;
public class Dont_Look_Away extends Feature {
	{
		name = "Don't Look Away";
		tags = "[+Speed]";
		frequency = "1 AP - Free Action";
		effect = "Trigger: You or your Pokemon with Pack Hunt or Teamwork hits with an Attack of Opportunity Effect: The hit foe loses a Tick of Hit Points, and is Slowed for 1 round. Dont Look Away may be triggered once per round.";
		prereqs.put("Pack Tactics", -1);
		prereqs.put("Stealth", 4);
		prereqs.put("Survival", 4);
	}
	public Dont_Look_Away(){}
	@Override
	public boolean checkPrereqs(Trainer t) {
		return t.hasFeat("Pack Tactics") && t.checkSkillRank("Stealth",4) && t.checkSkillRank("Survival",4);
	}
}