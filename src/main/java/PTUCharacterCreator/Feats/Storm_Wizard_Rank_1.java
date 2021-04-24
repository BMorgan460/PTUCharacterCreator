package PTUCharacterCreator.Feats;
import PTUCharacterCreator.Trainer;
import PTUCharacterCreator.Feature;
public class Storm_Wizard_Rank_1 extends Feature {
	{
		name = "Storm Wizard Rank 1";
		tags = "[+Speed]";
		frequency = "Static";
		effect = "You may learn two Moves from the list below. Rank 1 Moves: Charge Beam, Eerie Impulse, Shock Wave, Spark";
		prereqs.put("Spark Master", -1);
	}
	public Storm_Wizard_Rank_1(){}
	@Override
	public boolean checkPrereqs(Trainer t) {
		return t.hasFeat("Spark Master");
	}
}