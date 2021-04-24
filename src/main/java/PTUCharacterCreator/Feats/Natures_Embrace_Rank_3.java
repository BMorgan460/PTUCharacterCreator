package PTUCharacterCreator.Feats;
import PTUCharacterCreator.Trainer;
import PTUCharacterCreator.Feature;
public class Natures_Embrace_Rank_3 extends Feature {
	{
		name = "Nature's Embrace Rank 3";
		tags = "[Special] [Ranked 3]";
		frequency = "Static";
		effect = "You learn 2 Moves chosen from the list below, marked with the Rank of this Feature you are gaining or lower.  Moves marked with an Oath require that Oath to be chosen. Rank 3 Moves: Leech Seed, Petal Blizzard(Wood), Petal Dance(Flower), Power Whip, Solar Beam, Spore(Fungal)";
		prereqs.put("Gen Edu", 5);
		prereqs.put("Survival", 5);
	}
	public Natures_Embrace_Rank_3(){}
	@Override
	public boolean checkPrereqs(Trainer t) {
		return t.checkSkillRank("Gen Edu",5) && t.checkSkillRank("Survival",5);
	}
}