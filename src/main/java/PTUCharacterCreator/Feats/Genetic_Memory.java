package PTUCharacterCreator.Feats;
import PTUCharacterCreator.Trainer;
import PTUCharacterCreator.Feature;
public class Genetic_Memory extends Feature {
	{
		name = "Genetic Memory";
		tags = "[Paleontology Research Field] [Branch]";
		frequency = "Daily x2 - Extended Action";
		effect = "Target: Your Fossil Pokemon with at least 2 Tutor Points remaining Effect: The target loses 2 Tutor Points and learns any Move from its Egg Move or Tutor Move List. Genetic Memory may target a Pokemon only twice: once with a Tutor Move and once with an Egg Move. Egg Moves tutored this way do not count against the limit of 3 for TM and Tutor Moves.";
		prereqs.put("Ancient Heritage", -1);
		prereqs.put("Poke Edu", 5);
	}
	public Genetic_Memory(){}
	@Override
	public boolean checkPrereqs(Trainer t) {
		return t.hasFeat("Ancient Heritage") && t.checkSkillRank("Poke Edu",5);
	}
}