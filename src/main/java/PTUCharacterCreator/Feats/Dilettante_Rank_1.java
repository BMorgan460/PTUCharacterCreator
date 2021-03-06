package PTUCharacterCreator.Feats;
import PTUCharacterCreator.Trainer;
import PTUCharacterCreator.Feature;
public class Dilettante_Rank_1 extends Feature {
	{
		name = "Dilettante Rank 1";
		tags = "[Ranked 4]";
		frequency = "Static";
		effect = "You gain both an Edge and a General Feature from the lists on page 86 of the Core handbook. You may gain the chosen Edge and Feature even if you do not meet the Skill prerequisites. You must meet any other Prerequisites.  Whenever you gain a Feature or Edge this way, change any Skill Rank applications or Skill Checks mandated directly by the Edge or Feature into your choice of General Education or Perception Skill Checks or Rank applications instead.";
		prereqs.put("Hobbyist", -1);
	}
	public Dilettante_Rank_1(){}
	@Override
	public boolean checkPrereqs(Trainer t) {
		return t.hasFeat("Hobbyist");
	}
}