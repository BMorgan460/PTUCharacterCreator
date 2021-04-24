package PTUCharacterCreator.Feats;
import PTUCharacterCreator.Trainer;
import PTUCharacterCreator.Feature;
public class Ninjas_Arsenal extends Feature {
	{
		name = "Ninja's Arsenal";
		tags = "";
		frequency = "At-Will - Extended Action";
		effect = "You may craft an Antidote, Smoke Ball, Caltrops, or Toxic Caltrops for $100.";
		prereqs.put("Ninja", -1);
	}
	public Ninjas_Arsenal(){}
	@Override
	public boolean checkPrereqs(Trainer t) {
		return t.hasFeat("Ninja");
	}
}