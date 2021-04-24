package PTUCharacterCreator.Feats;
import PTUCharacterCreator.Trainer;
import PTUCharacterCreator.Feature;
public class Enhanced_Embrace_Rank_3 extends Feature {
	{
		name = "Enhanced Embrace Rank 3";
		tags = "[Ranked 3]";
		frequency = "Static";
		effect = "Learn two Moves from the list below at the Rank of Enhanced Embrace you are taking or lower. Moves marked with an Embrace require that Embrace to be chosen. Rank 3 Moves: Bug Buzz, Mega Horn, Quiver Dance(Monarch), Spider Web(Arachnid)";
		prereqs.put("Command", 5);
		prereqs.put("Survival", 5);
	}
	public Enhanced_Embrace_Rank_3(){}
	@Override
	public boolean checkPrereqs(Trainer t) {
		return t.checkSkillRank("Command",5) && t.checkSkillRank("Survival",5);
	}
}