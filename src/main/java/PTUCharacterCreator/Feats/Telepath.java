package PTUCharacterCreator.Feats;
import PTUCharacterCreator.Trainer;
import PTUCharacterCreator.Feature;
public class Telepath extends Feature {
	{
		name = "Telepath";
		tags = "[Class][+Special Defense]";
		frequency = "2 AP - Swift Action";
		effect = "You gain the Telepathy Capability for the rest of the scene.";
		prereqs.put("Elemental Connection (Psychic)", 0);
		prereqs.put("Iron Mind", -3);
		prereqs.put("Intuition", 3);
	}
	public Telepath(){}
	@Override
	public boolean checkPrereqs(Trainer t) {
		return t.hasEdge("Iron Mind") && t.checkSkillRank("Intuition",3);
	}
}