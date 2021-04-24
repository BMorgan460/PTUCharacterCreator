package PTUCharacterCreator.Feats;
import PTUCharacterCreator.Trainer;
import PTUCharacterCreator.Feature;
public class Cool_Conduct_Rank_2 extends Feature {
	{
		name = "Cool Conduct Rank 2";
		tags = "[Ranked 2]";
		frequency = "X AP - Special";
		effect = "Your Pokemon with at least 3d6 in their Cool Stat from Poffins may activate Cool Conduct as a Standard Action to perform one of the following Moves. They must still follow frequency limits as usual for these Moves. X is the Rank of the chosen Move. Rank 2: Roar, Double Team";
		prereqs.put("Command", 5);
	}
	public Cool_Conduct_Rank_2(){}
	@Override
	public boolean checkPrereqs(Trainer t) {
		return t.checkSkillRank("Command",5);
	}
}