package PTUCharacterCreator.Feats;
import PTUCharacterCreator.Trainer;
import PTUCharacterCreator.Feature;
public class Keep_Fighting_Playtest extends Feature {
	{
		name = "Keep Fighting! [Playtest]";
		tags = "[9-15 Playtest]";
		frequency = "Daily x2 - Free Action";
		effect = "Trigger: Your Pokemon or an Ally Trainer with over 1 Hit Point is reduced to 0 Hit Points or lower Effect: That Allys Hit Point count is reduced to 1 instead, and then gains Temporary Hit Points equal to your Charm Rank doubled.";
		prereqs.put("5 Cheerleader [Playtest] Features", 0);
		prereqs.put("Charm", 6);
	}
	public Keep_Fighting_Playtest(){}
	@Override
	public boolean checkPrereqs(Trainer t) {
		return t.checkSkillRank("Charm",6)&& t.hasFeat("Cheerleader [Playtest]");
	}
}