package PTUCharacterCreator.Feats;
import PTUCharacterCreator.Trainer;
import PTUCharacterCreator.Feature;
public class Channeler extends Feature {
	{
		name = "Channeler";
		tags = "[Class]";
		frequency = "At-Will - Swift Action";
		effect = "Target: A Pokemon. Effect: You Channel the target Pokemon. If you attempt to Channel a Hostile Pokemon, you must make an Intuition Check with a DC of 15 to Channel the target. You may stop Channeling a Pokemon as a Free Action at any time. You may Channel a number of Pokemon at a time up to your Intuition Rank. If a Channeled Pokemon goes further than 20 meters from you, they stop being Channeled.  See Extras - Class Mechanics for Channel details.";
		prereqs.put("Mystic Senses", -3);
	}
	public Channeler(){}
	@Override
	public boolean checkPrereqs(Trainer t) {
		return t.hasEdge("Mystic Senses");
	}
}