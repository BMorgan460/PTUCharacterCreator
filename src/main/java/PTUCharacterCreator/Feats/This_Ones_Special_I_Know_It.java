package PTUCharacterCreator.Feats;
import PTUCharacterCreator.Trainer;
import PTUCharacterCreator.Feature;
public class This_Ones_Special_I_Know_It extends Feature {
	{
		name = "This One's Special, I Know It";
		tags = "[Pokemon Caretaking Research Field] [Branch]";
		frequency = "Special - Free Action";
		effect = "Target: A hatching egg. Effect: The Pokemon is born with special qualities, determined by the GM. This Feature may be activated one time per Pokemon Education Rank above Untrained.";
		prereqs.put("Pusher", -1);
	}
	public This_Ones_Special_I_Know_It(){}
	@Override
	public boolean checkPrereqs(Trainer t) {
		return t.hasFeat("Pusher");
	}
}