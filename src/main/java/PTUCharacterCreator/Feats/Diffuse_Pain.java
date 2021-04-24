package PTUCharacterCreator.Feats;
import PTUCharacterCreator.Trainer;
import PTUCharacterCreator.Feature;
public class Diffuse_Pain extends Feature {
	{
		name = "Diffuse Pain";
		tags = "[+HP]";
		frequency = "2 AP - Swift Action";
		effect = "Trigger: You use a Status-Class Move gained from Hex Maniac Studies Effect: Choose an additional target for the Move.";
		prereqs.put("Hex Maniac Studies Rank 1", -1);
	}
	public Diffuse_Pain(){}
	@Override
	public boolean checkPrereqs(Trainer t) {
		return t.hasFeat("Hex Maniac Studies Rank 1");
	}
}