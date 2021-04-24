package PTUCharacterCreator.Feats;
import PTUCharacterCreator.Trainer;
import PTUCharacterCreator.Feature;
public class Flood extends Feature {
	{
		name = "Flood!";
		tags = "";
		frequency = "At-Will - Free Action";
		effect = "Your Water-Type Pokemon may activate Flood! as a Shift Action to use a damaging Water-Type Move as if had a range of Line 4 or Close Blast 2 instead of its usual range.";
		prereqs.put("Type Ace", -1);
		prereqs.put("Water as Chosen Type", 0);
	}
	public Flood(){}
	@Override
	public boolean checkPrereqs(Trainer t) {
		return t.hasFeat("Type Ace");
	}
}