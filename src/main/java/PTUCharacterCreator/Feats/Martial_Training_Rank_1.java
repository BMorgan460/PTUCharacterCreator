package PTUCharacterCreator.Feats;
import PTUCharacterCreator.Trainer;
import PTUCharacterCreator.Feature;
public class Martial_Training_Rank_1 extends Feature {
	{
		name = "Martial Training Rank 1";
		tags = "[Ranked 3] [Special]";
		frequency = "Static";
		effect = "Learn two Martial Artist Moves. You may choose any Move marked with the Martial Training Rank you are taking or lower. Moves marked with an Ability require that Ability to be chosen. Rank 1 Moves: Acupressure(Limber), Arm Thrust(Technician), Double Kick, Focus Energy, Karate Chop(inner Focus), Low Sweep, Mach Punch(Iron Fist), Rolling Kick(Reckless), Vital Throw(Guts)";
		prereqs.put("Martial Artist", -1);
	}
	public Martial_Training_Rank_1(){}
	@Override
	public boolean checkPrereqs(Trainer t) {
		return t.hasFeat("Martial Artist");
	}
}