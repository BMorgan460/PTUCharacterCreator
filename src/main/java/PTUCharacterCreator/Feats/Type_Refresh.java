package PTUCharacterCreator.Feats;
import PTUCharacterCreator.Trainer;
import PTUCharacterCreator.Feature;
public class Type_Refresh extends Feature {
	{
		name = "Type Refresh";
		tags = "[Branch] [Orders]";
		frequency = "2 AP - Standard Acrion";
		effect = "Target: Your Pokemon Effect: The target regains one use of a Scene-Frequency Move of your Chosen Type, and refreshes the Frequency of all EOT-Frequency Moves of your chosen Type. A Target can be affected by Type Refresh only once per Scene.";
		prereqs.put("Type Ace", -1);
	}
	public Type_Refresh(){}
	@Override
	public boolean checkPrereqs(Trainer t) {
		return t.hasFeat("Type Ace");
	}
}