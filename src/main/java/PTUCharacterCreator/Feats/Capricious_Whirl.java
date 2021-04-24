package PTUCharacterCreator.Feats;
import PTUCharacterCreator.Trainer;
import PTUCharacterCreator.Feature;
public class Capricious_Whirl extends Feature {
	{
		name = "Capricious Whirl";
		tags = "[Orders][Stratagem]";
		frequency = "Bind 2 AP - Standard Action";
		effect = "Target: Your Pokemon Effect: While this Feature is Bound, the target has a +3 bonus to its Evasion but deals 5 less damage with all damaging attacks.";
		prereqs.put("Trickster Orders", -1);
	}
	public Capricious_Whirl(){}
	@Override
	public boolean checkPrereqs(Trainer t) {
		return t.hasFeat("Trickster Orders");
	}
}