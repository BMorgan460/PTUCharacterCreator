package PTUCharacterCreator.Feats;
import PTUCharacterCreator.Trainer;
import PTUCharacterCreator.Feature;
public class Raging_Winds_Rank_1 extends Feature {
	{
		name = "Raging Winds Rank 1";
		tags = "[Ranked 3][+Speed]";
		frequency = "Static";
		effect = "You may learn two Moves from the list below. Rank 1 Moves: Aerial Ace, Air Cutter, Gust, Tailwind";
		prereqs.put("Wind Runner", -1);
	}
	public Raging_Winds_Rank_1(){}
	@Override
	public boolean checkPrereqs(Trainer t) {
		return t.hasFeat("Wind Runner");
	}
}