package PTUCharacterCreator.Feats;
import PTUCharacterCreator.Trainer;
import PTUCharacterCreator.Feature;
public class Enchanting_Gaze extends Feature {
	{
		name = "Enchanting Gaze";
		tags = "[+Speed]";
		frequency = "2 AP - Standard Action";
		effect = "Choose a Manipulate Maneuver effect, apply that Effect to all foes in a Cone 2. This ignores Frequency Limitations with that Maneuver and automatically succeeds against all targets without an opposed roll.";
		prereqs.put("Quick Wit", -1);
		prereqs.put("two Provocateur Skills at Expert Rank", 0);
	}
	public Enchanting_Gaze(){}
	@Override
	public boolean checkPrereqs(Trainer t) {
            String[] s = {"Charm", "Guile", "Intimidate"};
		return t.hasFeat("Quick Wit") && checkMultipleSkills(t,s,5,2);
	}
}