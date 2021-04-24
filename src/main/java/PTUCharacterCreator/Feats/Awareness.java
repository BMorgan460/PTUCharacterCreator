package PTUCharacterCreator.Feats;
import PTUCharacterCreator.Trainer;
import PTUCharacterCreator.Feature;
public class Awareness extends Feature {
	{
		name = "Awareness";
		tags = "";
		frequency = "Static";
		effect = "Your Pokemon add +2 to all Save Checks.";
		prereqs.put("Enduring Soul", -1);
		prereqs.put("3 Pokemon with a Defensive Ability*", 0);
	}
	public Awareness(){}
	@Override
	public boolean checkPrereqs(Trainer t) {
		return t.hasFeat("Enduring Soul");
	}
}