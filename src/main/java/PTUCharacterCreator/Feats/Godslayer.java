package PTUCharacterCreator.Feats;
import PTUCharacterCreator.Trainer;
import PTUCharacterCreator.Feature;
public class Godslayer extends Feature {
	{
		name = "Godslayer";
		tags = "[Patron Stat]";
		frequency = "EOT - Standard Action";
		effect = "You may attempt to shatter one of the targets Legendary Auras. The AC of this action is 10. If you successfully disabled the Aura, but rolled a 10-15, the feedback from the action gives you an Injury.";
		prereqs.put("Gm Permission", 0);
	}
	public Godslayer(){}
	@Override
	public boolean checkPrereqs(Trainer t) {
		return false;
	}
}