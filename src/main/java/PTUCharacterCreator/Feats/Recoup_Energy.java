package PTUCharacterCreator.Feats;
import PTUCharacterCreator.Trainer;
import PTUCharacterCreator.Feature;
public class Recoup_Energy extends Feature {
	{
		name = "Recoup Energy";
		tags = "[+Special Attack]";
		frequency = "Scene x2 - Free Action ";
		effect = "Trigger: Your Special Move misses all targets Effect: You do not expend the Frequency of the triggering Move. If you applied a Power Manipulation to the triggering Move, you are refunded the AP for the Manipulation or do not expend the Frequency for it.";
		prereqs.put("Arcanist", -1);
		prereqs.put("Ocu Edu", 5);
	}
	public Recoup_Energy(){}
	@Override
	public boolean checkPrereqs(Trainer t) {
		return t.hasFeat("Arcanist") && t.checkSkillRank("Ocu Edu",5);
	}
}