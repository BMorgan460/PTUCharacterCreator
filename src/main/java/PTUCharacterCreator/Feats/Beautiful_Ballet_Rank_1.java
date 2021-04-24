package PTUCharacterCreator.Feats;
import PTUCharacterCreator.Trainer;
import PTUCharacterCreator.Feature;
public class Beautiful_Ballet_Rank_1 extends Feature {
	{
		name = "Beautiful Ballet Rank 1";
		tags = "[Ranked 2]";
		frequency = "X AP - Special";
		effect = "Your Pokemon with at least 3d6 in their Beauty Stat from Poffins may activate Beautiful Ballet as a Standard Action to perform one of the following Moves. They must still follow frequency limits as usual for these Moves. X is the Rank of the chosen Move. Rank 1: Captivate, Mist";
		prereqs.put("Style Expert", -1);
		prereqs.put("Beauty as Chosen Stat", 0);
		prereqs.put("Intuition", 3);
	}
	public Beautiful_Ballet_Rank_1(){}
	@Override
	public boolean checkPrereqs(Trainer t) {
		return t.hasFeat("Style Expert") && t.checkSkillRank("Intuition",3);
	}
}