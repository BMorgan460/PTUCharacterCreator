package PTUCharacterCreator.Feats;
import PTUCharacterCreator.Trainer;
import PTUCharacterCreator.Feature;
public class Poke_Ball_Crafter extends Feature {
	{
		name = "Poke Ball Crafter";
		tags = "";
		frequency = "Static";
		effect = "You may craft Dusk, Dive, Heal, Luxury, Net, Nest, Quick, Repeat, or Timer Balls for $700. Requires access to a Poke Ball Tool Box.";
		prereqs.put("Basic Balls", -3);
		prereqs.put("Poke Ball Repair", -3);
		prereqs.put("Tech Edu", 5);
	}
	public Poke_Ball_Crafter(){}
	@Override
	public boolean checkPrereqs(Trainer t) {
		return t.hasEdge("Basic Balls") && t.hasEdge("Poke Ball Repair") && t.checkSkillRank("Tech Edu",5);
	}
}