package PTUCharacterCreator.Feats;
import PTUCharacterCreator.Trainer;
import PTUCharacterCreator.Feature;
public class Fistful_of_Force extends Feature {
	{
		name = "Fistful of Force";
		tags = "[Artificer Research Field] [Branch]";
		frequency = "Scene - Standard Action";
		effect = "Condition: You must have a Shard in your Main Hand or Off-Hand to use Fistful of Force. Effect: You may destroy the Shard to use the Move Judgment. Judgments Type must be one of the Types associated with the used Shard. Instead of adding your Special Attack when using this attack, you may choose to add your Occult Education Rank tripled.";
		prereqs.put("Crystal Artificer", -1);
		prereqs.put("Ocu Edu", 6);
	}
	public Fistful_of_Force(){}
	@Override
	public boolean checkPrereqs(Trainer t) {
		return t.hasFeat("Crystal Artificer") && t.checkSkillRank("Ocu Edu",6);
	}
}