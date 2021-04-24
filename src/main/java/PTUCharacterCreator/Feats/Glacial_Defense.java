package PTUCharacterCreator.Feats;
import PTUCharacterCreator.Trainer;
import PTUCharacterCreator.Feature;
public class Glacial_Defense extends Feature {
	{
		name = "Glacial Defense";
		tags = "[+Attack or Special Attack]";
		frequency = "Static";
		effect = "Choose Ice Shield or Winter's Kiss. You gain the Chosen Ability.";
		prereqs.put("Frost Touched", -1);
	}
	public Glacial_Defense(){}
	@Override
	public boolean checkPrereqs(Trainer t) {
		return t.hasFeat("Frost Touched");
	}
}