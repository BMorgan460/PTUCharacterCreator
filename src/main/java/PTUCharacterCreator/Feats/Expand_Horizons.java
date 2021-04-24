package PTUCharacterCreator.Feats;
import PTUCharacterCreator.Trainer;
import PTUCharacterCreator.Feature;
public class Expand_Horizons extends Feature {
	{
		name = "Expand Horizons";
		tags = "";
		frequency = "At-Will - Extended Action";
		effect = "Target: Your Pokemon Effect: Your Pokemon gains 3 Tutor Points. A Pokemon may be targeted by Expand Horizons only once.";
		prereqs.put("Mentor", -1);
	}
	public Expand_Horizons(){}
	@Override
	public boolean checkPrereqs(Trainer t) {
		return t.hasFeat("Mentor");
	}
}