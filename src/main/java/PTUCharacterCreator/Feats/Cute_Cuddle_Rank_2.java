package PTUCharacterCreator.Feats;
import PTUCharacterCreator.Trainer;
import PTUCharacterCreator.Feature;
public class Cute_Cuddle_Rank_2 extends Feature {
	{
		name = "Cute Cuddle Rank 2";
		tags = "[Ranked 2]";
		frequency = "X AP - Special";
		effect = "Your Pokemon with at least 3d6 in their Cute Stat from Poffins may activate Cute Cuddle as a Standard Action to perform one of the following Moves. They must still follow frequency limits as usual for these Moves. X is the Rank of the chosen Move. Rank 2: Teeter Dance, Attract";
		prereqs.put("Charm", 5);
	}
	public Cute_Cuddle_Rank_2(){}
	@Override
	public boolean checkPrereqs(Trainer t) {
		return t.checkSkillRank("Charm",5);
	}
}