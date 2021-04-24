package PTUCharacterCreator.Feats;
import PTUCharacterCreator.Trainer;
import PTUCharacterCreator.Feature;
public class Push_it_to_the_Limit extends Feature {
	{
		name = "Push it to the Limit";
		tags = "[+HP]";
		frequency = "At-Will - Free Action";
		effect = "Trigger: You hit with a Berserker Move or Weapon Attack Effect: Immediately gain one Injury before resolving the triggering attack. You gain a Tick of Temporary Hit Points and may cure yourself of a Persistent Status Affliction. The triggering attack doubles your damage bonus from Lessons in Rage and Pain.";
		prereqs.put("Lessons in Rage & Pain", 0);
		prereqs.put("Intimidate", 5);
	}
	public Push_it_to_the_Limit(){}
	@Override
	public boolean checkPrereqs(Trainer t) {
		return t.checkSkillRank("Intimidate",5);
	}
}