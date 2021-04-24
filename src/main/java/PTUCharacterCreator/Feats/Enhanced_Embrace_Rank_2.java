package PTUCharacterCreator.Feats;
import PTUCharacterCreator.Trainer;
import PTUCharacterCreator.Feature;
public class Enhanced_Embrace_Rank_2 extends Feature {
	{
		name = "Enhanced Embrace Rank 2";
		tags = "[Ranked 3]";
		frequency = "Static";
		effect = "Learn two Moves from the list below at the Rank of Enhanced Embrace you are taking or lower. Moves marked with an Embrace require that Embrace to be chosen. Rank 2 Moves: Attack Order(Arachnid), Infestation, Powder(Monarch), Signal Beam, Steamroller";
		prereqs.put("Command", 4);
		prereqs.put("Survival", 4);
	}
	public Enhanced_Embrace_Rank_2(){}
	@Override
	public boolean checkPrereqs(Trainer t) {
		return t.checkSkillRank("Command",4) && t.checkSkillRank("Survival",4);
	}
}