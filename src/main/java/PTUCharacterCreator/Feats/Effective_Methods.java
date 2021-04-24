package PTUCharacterCreator.Feats;
import PTUCharacterCreator.Trainer;
import PTUCharacterCreator.Feature;
public class Effective_Methods extends Feature {
	{
		name = "Effective Methods";
		tags = "";
		frequency = "At-Will - Extended Action";
		effect = "Target: Your Pokemon with at least 2 Tutor Points remaining Effect: Your Pokemon loses 2 Tutor Points and gains your choice of the Exploit or Tolerance Ability. You may only target a Pokemon once with Effective Methods.";
		prereqs.put("Duelist", -1);
	}
	public Effective_Methods(){}
	@Override
	public boolean checkPrereqs(Trainer t) {
		return t.hasFeat("Duelist");
	}
}