package PTUCharacterCreator.Feats;
import PTUCharacterCreator.Trainer;
import PTUCharacterCreator.Feature;
public class Double_Shot extends Feature {
	{
		name = "Double Shot";
		tags = "[+Attack][Weapon]";
		frequency = "1 AP - Standard Action";
		effect = "You may make two Struggle Attacks with a -2 penalty to Accuracy, each targeting the same foe. If the first attack gains the benefit of Aiming Down the Sights or Clear Shot, the second attack also gains the same benefits for free.";
		prereqs.put("Marksman", -1);
		prereqs.put("Combat", 4);
	}
	public Double_Shot(){}
	@Override
	public boolean checkPrereqs(Trainer t) {
		return t.hasFeat("Marksman") && t.checkSkillRank("Combat",4);
	}
}