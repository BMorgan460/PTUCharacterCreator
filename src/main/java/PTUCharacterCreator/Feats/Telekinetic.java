package PTUCharacterCreator.Feats;
import PTUCharacterCreator.Trainer;
import PTUCharacterCreator.Feature;
public class Telekinetic extends Feature {
	{
		name = "Telekinetic";
		tags = "[Class][+Special Attack]";
		frequency = "Static";
		effect = "You gain the Telekinetic Capability.";
		prereqs.put("Elemental Connection (Psychic)", 0);
		prereqs.put("Iron Mind", -3);
	}
	public Telekinetic(){}
	@Override
	public boolean checkPrereqs(Trainer t) {
		return t.hasEdge("Iron Mind");
	}
}