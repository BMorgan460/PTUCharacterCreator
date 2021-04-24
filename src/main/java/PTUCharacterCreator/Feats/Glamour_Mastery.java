package PTUCharacterCreator.Feats;
import PTUCharacterCreator.Trainer;
import PTUCharacterCreator.Feature;
public class Glamour_Mastery extends Feature {
	{
		name = "Glamour Mastery";
		tags = "[+Special Attack]";
		frequency = "Static";
		effect = "Choose Magic Guard or Magic Bounce. You gain the Chosen Ability.";
		prereqs.put("4 Glamour Weaver Features", 0);
	}
	public Glamour_Mastery(){}
	@Override
	public boolean checkPrereqs(Trainer t) {
		return false;
	}
}