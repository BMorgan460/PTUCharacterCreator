package PTUCharacterCreator.Feats;
import PTUCharacterCreator.Trainer;
import PTUCharacterCreator.Feature;
public class Signature_Manipulations_Rank_1 extends Feature {
	{
		name = "Signature Manipulations Rank 1";
		tags = "[Ranked 2][+Special Attack]";
		frequency = "Static";
		effect = "Select a Rank 1 Power Manipulation. This Manipulation may be used twice per Scene without spending AP to activate.";
		prereqs.put("Metamagic", -1);
	}
	public Signature_Manipulations_Rank_1(){}
	@Override
	public boolean checkPrereqs(Trainer t) {
		return t.hasFeat("Metamagic");
	}
}