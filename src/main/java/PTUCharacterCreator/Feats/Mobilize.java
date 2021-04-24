package PTUCharacterCreator.Feats;
import PTUCharacterCreator.Trainer;
import PTUCharacterCreator.Feature;
public class Mobilize extends Feature {
	{
		name = "Mobilize";
		tags = "[Orders]";
		frequency = "At-Will - Free Action";
		effect = "Target: Any Ally Effect: The target cannot provoke Attacks of Opportunity on their next turn. Mobilize may target an Ally only once per encounter.";
		prereqs.put("Commander", -1);
	}
	public Mobilize(){}
	@Override
	public boolean checkPrereqs(Trainer t) {
		return t.hasFeat("Commander");
	}
}