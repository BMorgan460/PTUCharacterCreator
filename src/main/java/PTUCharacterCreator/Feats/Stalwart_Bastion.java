package PTUCharacterCreator.Feats;
import PTUCharacterCreator.Trainer;
import PTUCharacterCreator.Feature;
public class Stalwart_Bastion extends Feature {
	{
		name = "Stalwart Bastion";
		tags = "[+Defense]";
		frequency = "Bind 2 AP - Standard Action";
		effect = "While this Feature is Bound, you and all cardinally adjacent allies gain Damage Reduction equal to your Combat or Focus Rank.";
		prereqs.put("Fortress", -1);
	}
	public Stalwart_Bastion(){}
	@Override
	public boolean checkPrereqs(Trainer t) {
		return t.hasFeat("Fortress");
	}
}