package PTUCharacterCreator.Feats;
import PTUCharacterCreator.Trainer;
import PTUCharacterCreator.Feature;
public class Natures_Embrace_Rank_1 extends Feature {
	{
		name = "Nature's Embrace Rank 1";
		tags = "[Special] [Ranked 3]";
		frequency = "Static";
		effect = "You learn 2 Moves chosen from the list below.  Moves marked with an Oath require that Oath to be chosen. Rank 1 Moves: Cotton Spore, Ingrain(Wood), Mega Drain, Razor Leaf, Stun Spore(Fungal), Sweet Scent(Flower)";
		prereqs.put("Druid", -1);
	}
	public Natures_Embrace_Rank_1(){}
	@Override
	public boolean checkPrereqs(Trainer t) {
		return t.hasFeat("Druid");
	}
}