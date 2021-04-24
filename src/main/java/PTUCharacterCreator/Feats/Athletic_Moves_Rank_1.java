package PTUCharacterCreator.Feats;
import PTUCharacterCreator.Trainer;
import PTUCharacterCreator.Feature;
public class Athletic_Moves_Rank_1 extends Feature {
	{
		name = "Athletic Moves Rank 1";
		tags = "[+HP] [Ranked 3]";
		frequency = "Static";
		effect = "You learn two Rank 1 Athlete Moves. Rank 1: Bind, Block, Slam, Strength";
		prereqs.put("Athlete", -1);
	}
	public Athletic_Moves_Rank_1(){}
	@Override
	public boolean checkPrereqs(Trainer t) {
		return t.hasFeat("Athlete");
	}
}