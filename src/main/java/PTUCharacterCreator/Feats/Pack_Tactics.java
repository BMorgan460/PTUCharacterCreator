package PTUCharacterCreator.Feats;
import PTUCharacterCreator.Trainer;
import PTUCharacterCreator.Feature;
public class Pack_Tactics extends Feature {
	{
		name = "Pack Tactics";
		tags = "[+Speed]";
		frequency = "At-Will - Extended Action";
		effect = "Target: Your Pokemon with at least 2 Tutor Points Effect: The target loses 2 Tutor Points and gains the Pack Hunt or Teamwork Ability. You may only target a Pokemon with Pack Tactics only once.";
		prereqs.put("Hunter", -1);
	}
	public Pack_Tactics(){}
	@Override
	public boolean checkPrereqs(Trainer t) {
		return t.hasFeat("Hunter");
	}
}