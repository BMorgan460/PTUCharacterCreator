package PTUCharacterCreator.Feats;
import PTUCharacterCreator.Trainer;
import PTUCharacterCreator.Feature;
public class Bookworm_Playtest extends Feature {
	{
		name = "Bookworm [Playtest]";
		tags = "[General Research Field] [Branch] [5-15 Playtest]";
		frequency = "Static";
		effect = "You gain X Study Points, where X is equal to 2 plus one more for every other General Research Feature you have. You may Drain Study Points to benefit from studying Books, instead of Draining your Action Points. Study Points are restored to your maximum after an Extended Rest, just like Action Points.";
		prereqs.put("Breadth of Knowledge", -1);
	}
	public Bookworm_Playtest(){}
	@Override
	public boolean checkPrereqs(Trainer t) {
		return t.hasFeat("Breadth of Knowledge");
	}
}