package PTUCharacterCreator.Feats;
import PTUCharacterCreator.Trainer;
import PTUCharacterCreator.Feature;
public class Signature_Manipulations_Rank_2 extends Feature {
	{
		name = "Signature Manipulations Rank 2";
		tags = "[Ranked 2][+Special Attack]";
		frequency = "Static";
		effect = "Select a Power Manipulation marked Rank 2 or lower. For Rank 1 Manipulations, this Manipulation may be used twice per Scene without spending AP to activate. For Rank 2 Manipulations, this Manipulation may be used once per Scene without activating Authentic Thaumaturgys Frequency.";
		prereqs.put("Authentic Thaumaturgy", -1);
	}
	public Signature_Manipulations_Rank_2(){}
	@Override
	public boolean checkPrereqs(Trainer t) {
		return t.hasFeat("Authentic Thaumaturgy");
	}
}