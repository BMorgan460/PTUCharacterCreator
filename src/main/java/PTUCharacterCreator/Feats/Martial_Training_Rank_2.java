package PTUCharacterCreator.Feats;
import PTUCharacterCreator.Trainer;
import PTUCharacterCreator.Feature;
public class Martial_Training_Rank_2 extends Feature {
	{
		name = "Martial Training Rank 2";
		tags = "[Ranked 3] [Special]";
		frequency = "Static";
		effect = "Learn two Martial Artist Moves. You may choose any Move marked with the Martial Training Rank you are taking or lower. Moves marked with an Ability require that Ability to be chosen. Rank 2 Moves: Brick Break, Circle Throw(Guts), Comet Punch(Iron Fist), Counter(Limber), Low Kick(Inner Focus), Jump Kick(Reckless), Power Trick(Limber), Quick Guard(Technician)";
		prereqs.put("Martial Artist", -1);
		prereqs.put("Combat", 5);
	}
	public Martial_Training_Rank_2(){}
	@Override
	public boolean checkPrereqs(Trainer t) {
		return t.hasFeat("Martial Artist") && t.checkSkillRank("Combat",5);
	}
}