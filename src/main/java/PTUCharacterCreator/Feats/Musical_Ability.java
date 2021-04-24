package PTUCharacterCreator.Feats;
import PTUCharacterCreator.Trainer;
import PTUCharacterCreator.Feature;
public class Musical_Ability extends Feature {
	{
		name = "Musical Ability";
		tags = "[+Special Attack]";
		frequency = "Static";
		effect = "Choose Drown Out or Soundproof. You gain the chosen Ability.";
		prereqs.put("Musician", -1);
	}
	public Musical_Ability(){}
	@Override
	public boolean checkPrereqs(Trainer t) {
		return t.hasFeat("Musician");
	}
}