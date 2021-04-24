package PTUCharacterCreator.Feats;
import PTUCharacterCreator.Trainer;
import PTUCharacterCreator.Feature;
public class Quick_Healing extends Feature {
	{
		name = "Quick Healing";
		tags = "";
		frequency = "At-Will - Extended Action";
		effect = "Your Hardened Pokemon may use Quick Healing to remove up to three injuries, and gains two Ticks of Hit Points for each Injury removed this way.";
		prereqs.put("Taskmaster", -1);
	}
	public Quick_Healing(){}
	@Override
	public boolean checkPrereqs(Trainer t) {
		return t.hasFeat("Taskmaster");
	}
}