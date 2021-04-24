package PTUCharacterCreator.Feats;
import PTUCharacterCreator.Trainer;
import PTUCharacterCreator.Feature;
public class Earthen_Bond extends Feature {
	{
		name = "Earthen Bond";
		tags = "[+Defense]";
		frequency = "Static";
		effect = "You gain the Tremorsense Capability, and you gain Naturewalk for Cave, Mountain and Desert.";
		prereqs.put("Earth Shaker", -1);
	}
	public Earthen_Bond(){}
	@Override
	public boolean checkPrereqs(Trainer t) {
		return t.hasFeat("Earth Shaker");
	}
}