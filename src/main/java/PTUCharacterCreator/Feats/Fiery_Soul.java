package PTUCharacterCreator.Feats;
import PTUCharacterCreator.Trainer;
import PTUCharacterCreator.Feature;
public class Fiery_Soul extends Feature {
	{
		name = "Fiery Soul";
		tags = "[+Special Attack or Attack]";
		frequency = "Static";
		effect = "You gain the Heater Capability, and are immune to the Burn condition.";
		prereqs.put("Fire Bringer", -1);
	}
	public Fiery_Soul(){}
	@Override
	public boolean checkPrereqs(Trainer t) {
		return t.hasFeat("Fire Bringer");
	}
}