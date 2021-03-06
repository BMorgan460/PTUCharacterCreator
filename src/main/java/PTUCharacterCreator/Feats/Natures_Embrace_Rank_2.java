package PTUCharacterCreator.Feats;
import PTUCharacterCreator.Trainer;
import PTUCharacterCreator.Feature;
public class Natures_Embrace_Rank_2 extends Feature {
	{
		name = "Nature's Embrace Rank 2";
		tags = "[Special] [Ranked 3]";
		frequency = "Static";
		effect = "You learn 2 Moves chosen from the list below, marked with the Rank of this Feature you are gaining or lower.  Moves marked with an Oath require that Oath to be chosen. Rank 2 Moves: Aromatherapy(Flower), Energy Ball, Giga Drain(Fungal), Magical Leaf, Seed Bomb, Spiky Shield(Wood)";
		prereqs.put("Gen Edu", 4);
		prereqs.put("Survival", 4);
	}
	public Natures_Embrace_Rank_2(){}
	@Override
	public boolean checkPrereqs(Trainer t) {
		return t.checkSkillRank("Gen Edu",4) && t.checkSkillRank("Survival",4);
	}
}