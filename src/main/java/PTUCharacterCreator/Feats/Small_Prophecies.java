package PTUCharacterCreator.Feats;
import PTUCharacterCreator.Trainer;
import PTUCharacterCreator.Feature;
public class Small_Prophecies extends Feature {
	{
		name = "Small Prophecies";
		tags = "[+Special Defense]";
		frequency = "1 AP - Swift Action";
		effect = "Roll 1d20 and note the result. Until the end of your next turn, you may choose to replace a single d20 roll you or a willing ally makes with the noted result.";
		prereqs.put("Divination", -1);
		prereqs.put("Perception", 4);
	}
	public Small_Prophecies(){}
	@Override
	public boolean checkPrereqs(Trainer t) {
		return t.hasFeat("Divination") && t.checkSkillRank("Perception",4);
	}
}