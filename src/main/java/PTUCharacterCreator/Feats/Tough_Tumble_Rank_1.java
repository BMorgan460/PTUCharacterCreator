package PTUCharacterCreator.Feats;
import PTUCharacterCreator.Trainer;
import PTUCharacterCreator.Feature;
public class Tough_Tumble_Rank_1 extends Feature {
	{
		name = "Tough Tumble Rank 1";
		tags = "[Ranked 2]";
		frequency = "X AP - Special";
		effect = "Your Pokemon with at least 3d6 in their Tough Stat from Poffins may activate Tough Tumble as a Standard Action to perform one of the following Moves. They must still follow frequency limits as usual for these Moves. X is the Rank of the chosen Move. Rank 1: Scary Face, Spite";
		prereqs.put("Style Expert", -1);
		prereqs.put("Tough as Chosen Stat", 0);
		prereqs.put("Intimidate", 3);
	}
	public Tough_Tumble_Rank_1(){}
	@Override
	public boolean checkPrereqs(Trainer t) {
		return t.hasFeat("Style Expert") && t.checkSkillRank("Intimidate",3);
	}
}