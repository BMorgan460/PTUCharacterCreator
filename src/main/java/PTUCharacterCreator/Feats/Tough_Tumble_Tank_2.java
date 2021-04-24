package PTUCharacterCreator.Feats;
import PTUCharacterCreator.Trainer;
import PTUCharacterCreator.Feature;
public class Tough_Tumble_Tank_2 extends Feature {
	{
		name = "Tough Tumble Tank 2";
		tags = "[Ranked 2]";
		frequency = "X AP - Special";
		effect = "Your Pokemon with at least 3d6 in their Tough Stat from Poffins may activate Tough Tumble as a Standard Action to perform one of the following Moves. They must still follow frequency limits as usual for these Moves. X is the Rank of the chosen Move. Rank 2: Glare, Bide";
		prereqs.put("Intimidate", 5);
	}
	public Tough_Tumble_Tank_2(){}
	@Override
	public boolean checkPrereqs(Trainer t) {
		return t.checkSkillRank("Intimidate",5);
	}
}