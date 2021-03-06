package PTUCharacterCreator.Feats;
import PTUCharacterCreator.Trainer;
import PTUCharacterCreator.Feature;
public class Martial_Training_Rank_3 extends Feature {
	{
		name = "Martial Training Rank 3";
		tags = "[Ranked 3] [Special]";
		frequency = "Static";
		effect = "Learn two Martial Artist Moves. You may choose any Move marked with the Martial Training Rank you are taking or lower. Moves marked with an Ability require that Ability to be chosen. Rank 3 Moves: Cross Chop(Inner Focus), Close Combat, Triple Kick(Technician), High Jump Kick(Reckless), Sky Uppercut(Iron Fist), Storm Throw(Guts)";
		prereqs.put("Martial Artist", -1);
		prereqs.put("Combat", 6);
	}
	public Martial_Training_Rank_3(){}
	@Override
	public boolean checkPrereqs(Trainer t) {
		return t.hasFeat("Martial Artist") && t.checkSkillRank("Combat",6);
	}
}