package PTUCharacterCreator.Feats;
import PTUCharacterCreator.Trainer;
import PTUCharacterCreator.Feature;
public class Power_of_Rage extends Feature {
	{
		name = "Power of Rage";
		tags = "[+HP]";
		frequency = "Static";
		effect = "Choose Enduring Rage or White Flame. You gain the chosen Ability.";
		prereqs.put("Berserker", -1);
	}
	public Power_of_Rage(){}
	@Override
	public boolean checkPrereqs(Trainer t) {
		return t.hasFeat("Berserker");
	}
}