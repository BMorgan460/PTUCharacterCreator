package PTUCharacterCreator.Feats;
import PTUCharacterCreator.Trainer;
import PTUCharacterCreator.Feature;
public class Magical_Burst extends Feature {
	{
		name = "Magical Burst";
		tags = "[+Special Attack]";
		frequency = "Scene - Standard Action";
		effect = "Condition: You must have Enchanting Transformation Bound to use Magical Burst Effect: Use a Glamour Weaver Move as if it had the range Burst 3, Friendly, Exhaust, Smite. All allies within the area-of-effect gain a Tick of Temporary Hit Points or cure themselves of one Volatile Affliction. Enchanting Transformation immediately becomes Unbound, and the AP used to bind it becomes spent instead of becoming available again.";
		prereqs.put("Enchanting Transformation", -1);
		prereqs.put("Passionato Harmony", -1);
	}
	public Magical_Burst(){}
	@Override
	public boolean checkPrereqs(Trainer t) {
		return t.hasFeat("Enchanting Transformation") && t.hasFeat("Passionato Harmony");
	}
}