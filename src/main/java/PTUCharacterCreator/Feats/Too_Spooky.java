package PTUCharacterCreator.Feats;
import PTUCharacterCreator.Trainer;
import PTUCharacterCreator.Feature;
public class Too_Spooky extends Feature {
	{
		name = "Too Spooky";
		tags = "[+Attack]";
		frequency = "Static";
		effect = "Choose Pressure or Frighten. You gain the chosen Ability.";
		prereqs.put("Apparition", -1);
	}
	public Too_Spooky(){}
	@Override
	public boolean checkPrereqs(Trainer t) {
		return t.hasFeat("Apparition");
	}
}