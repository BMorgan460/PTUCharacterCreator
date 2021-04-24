package PTUCharacterCreator.Feats;
import PTUCharacterCreator.Trainer;
import PTUCharacterCreator.Feature;
public class Blinding_Brightness extends Feature {
	{
		name = "Blinding Brightness";
		tags = "[+Special Attack]";
		frequency = "Static";
		effect = "You gain the Illuminate Ability.";
		prereqs.put("Prism", -1);
	}
	public Blinding_Brightness(){}
	@Override
	public boolean checkPrereqs(Trainer t) {
		return t.hasFeat("Prism");
	}
}