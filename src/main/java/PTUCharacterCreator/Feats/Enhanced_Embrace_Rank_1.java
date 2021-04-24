package PTUCharacterCreator.Feats;
import PTUCharacterCreator.Trainer;
import PTUCharacterCreator.Feature;
public class Enhanced_Embrace_Rank_1 extends Feature {
	{
		name = "Enhanced Embrace Rank 1";
		tags = "[Ranked 3]";
		frequency = "Static";
		effect = "Learn two Moves from the list below. Moves marked with an Embrace require that Embrace to be chosen. Rank 1 Moves: Defend Order, Fury Cutter, Fell Needle, Struggle Bug(Monarch), Sticky Web(Arachnid)";
		prereqs.put("Swarmlord", -1);
	}
	public Enhanced_Embrace_Rank_1(){}
	@Override
	public boolean checkPrereqs(Trainer t) {
		return t.hasFeat("Swarmlord");
	}
}