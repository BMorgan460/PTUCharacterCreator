package PTUCharacterCreator.Feats;
import PTUCharacterCreator.Trainer;
import PTUCharacterCreator.Feature;
public class Noblesse_Oblige extends Feature {
	{
		name = "Noblesse Oblige";
		tags = "[+Attack]";
		frequency = "Static";
		effect = "You gain the Regal Challenge Ability";
		prereqs.put("Herald of Pride", -1);
	}
	public Noblesse_Oblige(){}
	@Override
	public boolean checkPrereqs(Trainer t) {
		return t.hasFeat("Herald of Pride");
	}
}