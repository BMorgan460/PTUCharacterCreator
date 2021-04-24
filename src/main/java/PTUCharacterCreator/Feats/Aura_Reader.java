package PTUCharacterCreator.Feats;
import PTUCharacterCreator.Trainer;
import PTUCharacterCreator.Feature;
public class Aura_Reader extends Feature {
	{
		name = "Aura Reader";
		tags = "[+Attack or Special Attack]";
		frequency = "2 AP - Swift Action";
		effect = "You gain the Aura Reader Capability for the rest of the scene. If your Intuition is Adept Rank or higher, you also gain the Aura Pulse Capability.";
		prereqs.put("Aura Guardian", -1);
	}
	public Aura_Reader(){}
	@Override
	public boolean checkPrereqs(Trainer t) {
		return t.hasFeat("Aura Guardian");
	}
}