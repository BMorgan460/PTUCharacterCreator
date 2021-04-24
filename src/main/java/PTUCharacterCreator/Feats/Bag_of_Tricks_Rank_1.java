package PTUCharacterCreator.Feats;
import PTUCharacterCreator.Trainer;
import PTUCharacterCreator.Feature;
public class Bag_of_Tricks_Rank_1 extends Feature {
	{
		name = "Bag of Tricks Rank 1";
		tags = "[Ranked 2]";
		frequency = "Static";
		effect = "You gain two Trickster Techniques of your choice. Trickster Techniques: Mind Games, Escape Artist, Shell Game, Impromptu Trick";
		prereqs.put("Trickster", -1);
	}
	public Bag_of_Tricks_Rank_1(){}
	@Override
	public boolean checkPrereqs(Trainer t) {
		return t.hasFeat("Trickster");
	}
}