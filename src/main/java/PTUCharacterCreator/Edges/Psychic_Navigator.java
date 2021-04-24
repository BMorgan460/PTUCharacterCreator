package PTUCharacterCreator.Edges;
import PTUCharacterCreator.Trainer;
import PTUCharacterCreator.Edge;
public class Psychic_Navigator extends Edge {
	{
		name = "Psychic Navigator";
		effect = "You gain the Psychic Navigator Capability.";
		prereqs.put("Elemental Connection (Psychic)", 0);
	}
	public Psychic_Navigator(){}
	@Override
	public boolean checkPrereqs(Trainer t) {
		return true;
	}
}