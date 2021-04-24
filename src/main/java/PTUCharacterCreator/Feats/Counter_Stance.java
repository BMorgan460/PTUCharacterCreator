package PTUCharacterCreator.Feats;
import PTUCharacterCreator.Trainer;
import PTUCharacterCreator.Feature;
public class Counter_Stance extends Feature {
	{
		name = "Counter Stance";
		tags = "[+Speed]";
		frequency = "At-Will - Free Action - Interrupt";
		effect = "Trigger: An adjacent foe misses you with an attack Effect: You perform an Attack of Opportunity against them.";
		prereqs.put("Skirmisher", -1);
	}
	public Counter_Stance(){}
	@Override
	public boolean checkPrereqs(Trainer t) {
		return t.hasFeat("Skirmisher");
	}
}