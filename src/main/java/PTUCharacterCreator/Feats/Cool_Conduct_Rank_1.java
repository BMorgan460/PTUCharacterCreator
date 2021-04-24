package PTUCharacterCreator.Feats;
import PTUCharacterCreator.Trainer;
import PTUCharacterCreator.Feature;
public class Cool_Conduct_Rank_1 extends Feature {
	{
		name = "Cool Conduct Rank 1";
		tags = "[Ranked 2]";
		frequency = "X AP - Special";
		effect = "Your Pokemon with at least 3d6 in their Cool Stat from Poffins may activate Cool Conduct as a Standard Action to perform one of the following Moves. They must still follow frequency limits as usual for these Moves. X is the Rank of the chosen Move. Rank 1: Focus Energy, Noble Roar";
		prereqs.put("Style Expert", -1);
		prereqs.put("Cool as Chosen Stat", 0);
		prereqs.put("Command", 3);
	}
	public Cool_Conduct_Rank_1(){}
	@Override
	public boolean checkPrereqs(Trainer t) {
		return t.hasFeat("Style Expert") && t.checkSkillRank("Command",3);
	}
}