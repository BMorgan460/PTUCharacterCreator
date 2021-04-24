package PTUCharacterCreator.Feats;
import PTUCharacterCreator.Trainer;
import PTUCharacterCreator.Feature;
public class Shrug_Off extends Feature {
	{
		name = "Shrug Off";
		tags = "";
		frequency = "Static";
		effect = "Once per day, each of your Pokemon may spend Shift Action to remove 1 Injury from themselves, this may also be activated as a Free Action whenever your Pokemon Take a Breather.";
		prereqs.put("Staying Power", -1);
	}
	public Shrug_Off(){}
	@Override
	public boolean checkPrereqs(Trainer t) {
		return t.hasFeat("Staying Power");
	}
}