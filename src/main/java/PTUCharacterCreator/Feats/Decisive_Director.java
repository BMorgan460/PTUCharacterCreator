package PTUCharacterCreator.Feats;
import PTUCharacterCreator.Trainer;
import PTUCharacterCreator.Feature;
public class Decisive_Director extends Feature {
	{
		name = "Decisive Director";
		tags = "[Orders]";
		frequency = "At-Will - Standard Action";
		effect = "Target: A Pokemon Effect: Add or subtract X from the targets Initiative until the end of your next turn. X is equal to your Charm Rank doubled.";
		prereqs.put("Coordinator", -1);
	}
	public Decisive_Director(){}
	@Override
	public boolean checkPrereqs(Trainer t) {
		return t.hasFeat("Coordinator");
	}
}