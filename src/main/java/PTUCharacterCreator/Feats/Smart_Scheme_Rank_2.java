package PTUCharacterCreator.Feats;
import PTUCharacterCreator.Trainer;
import PTUCharacterCreator.Feature;
public class Smart_Scheme_Rank_2 extends Feature {
	{
		name = "Smart Scheme Rank 2";
		tags = "[Ranked 2]";
		frequency = "X AP - Special";
		effect = "Your Pokemon with at least 3d6 in their Smart Stat from Poffins may activate Smart Scheme as a Standard Action to perform one of the following Moves. They must still follow frequency limits as usual for these Moves. X is the Rank of the chosen Move. Rank 2: Taunt, Flatter";
		prereqs.put("Guile", 5);
	}
	public Smart_Scheme_Rank_2(){}
	@Override
	public boolean checkPrereqs(Trainer t) {
		return t.checkSkillRank("Guile",5);
	}
}