package PTUCharacterCreator.Feats;
import PTUCharacterCreator.Trainer;
import PTUCharacterCreator.Feature;
public class Fossil_Restoration extends Feature {
	{
		name = "Fossil Restoration";
		tags = "[Paleontology Research Field] [Branch]";
		frequency = "At-Will - Extended Action";
		effect = "Target: A Fossil you are reviving Effect: The resulting Pokemon is born with 2 fewer Tutor Points, and gains its second Basic Ability. If it has only has one Basic Ability, it gains one of its Advanced Abilities, chosen by the GM. This Feature does not affect how the Pokemon continues to gain Abilities.";
		prereqs.put("Paleontologist", -3);
		prereqs.put("Poke Edu", 3);
	}
	public Fossil_Restoration(){}
	@Override
	public boolean checkPrereqs(Trainer t) {
		return t.hasEdge("Paleontologist") && t.checkSkillRank("Poke Edu",3);
	}
}