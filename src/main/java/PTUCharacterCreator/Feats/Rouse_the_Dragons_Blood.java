package PTUCharacterCreator.Feats;
import PTUCharacterCreator.Trainer;
import PTUCharacterCreator.Feature;
public class Rouse_the_Dragons_Blood extends Feature {
	{
		name = "Rouse the Dragon's Blood";
		tags = "[+Attack]";
		frequency = "Scene x2 - Free Action ";
		effect = "Trigger: You suffer a Critical Hit or gain an Injury from a foes attack Effect: For 1 full round, the next Herald of Pride Move you use against the triggering foe cannot miss, cannot be Intercepted, and effects that would cause it to miss cannot be activated against it.";
		prereqs.put("Herald of Pride", -1);
		prereqs.put("Command", 5);
		prereqs.put("Intimidate", 5);
	}
	public Rouse_the_Dragons_Blood(){}
	@Override
	public boolean checkPrereqs(Trainer t) {
		return t.hasFeat("Herald of Pride") && t.checkSkillRank("Command",5) && t.checkSkillRank("Intimidate",5);
	}
}