package PTUCharacterCreator.Feats;
import PTUCharacterCreator.Trainer;
import PTUCharacterCreator.Feature;
public class Call_the_Current_Rank_1 extends Feature {
	{
		name = "Call the Current Rank 1";
		tags = "[Ranked 3] [+Speed]";
		frequency = "Static";
		effect = "You learn 2 Moves chosen from the list below. Rank 1 Moves: Aqua Jet, Aqua Ring, Water Pulse";
		prereqs.put("Maelstrom", -1);
	}
	public Call_the_Current_Rank_1(){}
	@Override
	public boolean checkPrereqs(Trainer t) {
		return t.hasFeat("Maelstrom");
	}
}