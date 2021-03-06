package PTUCharacterCreator.Feats;
import PTUCharacterCreator.Trainer;
import PTUCharacterCreator.Feature;
public class Desperate_Strike extends Feature {
	{
		name = "Desperate Strike";
		tags = "";
		frequency = "Scene x2 - Free Action";
		effect = "Trigger: Your Pokemon triggers Cruelty, or scores a Critical Hit with damaging attack. Effect: Your Pokemon may apply the effects of Cruelty to the attack without expending Crueltys Frequency. Crueltys effects may be purchased as if the foe had additional injuries equal to the number of injuries on the user. Desperate Strike may be used once per Scene per Pokemon.";
		prereqs.put("Savage Strike", -1);
		prereqs.put("Intimidate", 5);
	}
	public Desperate_Strike(){}
	@Override
	public boolean checkPrereqs(Trainer t) {
		return t.hasFeat("Savage Strike") && t.checkSkillRank("Intimidate",5);
	}
}