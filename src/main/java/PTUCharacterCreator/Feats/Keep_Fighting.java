package PTUCharacterCreator.Feats;
import PTUCharacterCreator.Trainer;
import PTUCharacterCreator.Feature;
public class Keep_Fighting extends Feature {
	{
		name = "Keep Fighting!";
		tags = "";
		frequency = "Daily x2 - Free Action";
		effect = "Trigger: Your Pokemon or an Ally Trainer with over 1 Hit Point is reduced to 0 Hit Points or lower:  Effect: That Allys Hit Point count is reduced to 1 instead, and then gains Temporary Hit Points equal to your charm rank doubled.";
		prereqs.put("5 Cheerleader Features", 0);
		prereqs.put("Charm", 6);
	}
	public Keep_Fighting(){}
	@Override
	public boolean checkPrereqs(Trainer t) {
		return t.checkSkillRank("Charm",6) && t.hasFeat("Cheerleader");
	}
}