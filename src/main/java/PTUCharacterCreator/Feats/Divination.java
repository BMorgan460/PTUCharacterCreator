package PTUCharacterCreator.Feats;
import PTUCharacterCreator.Trainer;
import PTUCharacterCreator.Feature;
public class Divination extends Feature {
	{
		name = "Divination";
		tags = "[+Special Defense]";
		frequency = "Daily x3 - Extended Action ";
		effect = "You may perform an Augury or Scrying.";
		prereqs.put("Oracle", -1);
	}
	public Divination(){}
	@Override
	public boolean checkPrereqs(Trainer t) {
		return t.hasFeat("Oracle");
	}
}