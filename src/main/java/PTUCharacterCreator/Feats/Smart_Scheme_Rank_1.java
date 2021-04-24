package PTUCharacterCreator.Feats;
import PTUCharacterCreator.Trainer;
import PTUCharacterCreator.Feature;
public class Smart_Scheme_Rank_1 extends Feature {
	{
		name = "Smart Scheme Rank 1";
		tags = "[Ranked 2]";
		frequency = "X AP - Special";
		effect = "Your Pokemon with at least 3d6 in their Smart Stat from Poffins may activate Smart Scheme as a Standard Action to perform one of the following Moves. They must still follow frequency limits as usual for these Moves. X is the Rank of the chosen Move. Rank 1: Fake Tears, Calm Mind";
		prereqs.put("Style Expert", -1);
		prereqs.put("Smart as Chosen Stat", 0);
		prereqs.put("Guile", 3);
	}
	public Smart_Scheme_Rank_1(){}
	@Override
	public boolean checkPrereqs(Trainer t) {
		return t.hasFeat("Style Expert") && t.checkSkillRank("Guile",3);
	}
}