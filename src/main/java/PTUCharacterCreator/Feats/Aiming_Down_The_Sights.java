package PTUCharacterCreator.Feats;
import PTUCharacterCreator.Trainer;
import PTUCharacterCreator.Feature;
public class Aiming_Down_The_Sights extends Feature {
	{
		name = "Aiming Down The Sights";
		tags = "[+Attack][Weapon]";
		frequency = "At Will - Shift Action";
		effect = "Your next Weapon Attack with a long-range Weapon gains +2 to its Accuracy Roll and Critical Hit Range. This effect lasts until used or until the start of your next turn.";
		prereqs.put("Marksman", -1);
	}
	public Aiming_Down_The_Sights(){}
	@Override
	public boolean checkPrereqs(Trainer t) {
		return t.hasFeat("Marksman");
	}
}