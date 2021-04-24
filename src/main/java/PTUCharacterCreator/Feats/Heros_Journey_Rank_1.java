package PTUCharacterCreator.Feats;
import PTUCharacterCreator.Trainer;
import PTUCharacterCreator.Feature;
public class Heros_Journey_Rank_1 extends Feature {
	{
		name = "Hero's Journey Rank 1";
		tags = "[Ranked 4] [+Speed] [5-15 Playtest]";
		frequency = "Static";
		effect = "Each Rank, you may gain two Backpacker Talents for which you qualify. Talents: Call to Adventure, Hat Trick, Frisk, Handyman, Movement Mastery, Sole Power, Wayfarer, Wear It Better";
		prereqs.put("Backpacker", -1);
	}
	public Heros_Journey_Rank_1(){}
	@Override
	public boolean checkPrereqs(Trainer t) {
		return t.hasFeat("Backpacker");
	}
}