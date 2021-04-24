package PTUCharacterCreator.Feats;
import PTUCharacterCreator.Trainer;
import PTUCharacterCreator.Feature;
public class Ghost_Step extends Feature {
	{
		name = "Ghost Step";
		tags = "";
		frequency = "At-Will - Free Action";
		effect = "Your Ghost-Type Pokemon may activate this Feature by spending a Shift Action to remove themselves from the field. They may not be targeted in any way during this time. At the beginning of their next turn, they reappear in any square of their choice that they could have Shifted to from their previous location. Each Pokemon may activate Ghost Step only once per Scene.";
		prereqs.put("Type Ace", -1);
		prereqs.put("Ghost as Chosen Type", 0);
	}
	public Ghost_Step(){}
	@Override
	public boolean checkPrereqs(Trainer t) {
		return t.hasFeat("Type Ace");
	}
}