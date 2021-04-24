package PTUCharacterCreator.Feats;
import PTUCharacterCreator.Trainer;
import PTUCharacterCreator.Feature;
public class Hidden_Power extends Feature {
	{
		name = "Hidden Power";
		tags = "[+Attack or Special Attack]";
		frequency = "Static";
		effect = "You learn the Move Hidden Power. Whenever you use Hidden Power, it may be either Physical or Special, adding the appropriate Attack Stat.";
		prereqs.put("Rune Master", -1);
	}
	public Hidden_Power(){}
	@Override
	public boolean checkPrereqs(Trainer t) {
		return t.hasFeat("Rune Master");
	}
}