package PTUCharacterCreator.Feats;
import PTUCharacterCreator.Trainer;
import PTUCharacterCreator.Feature;
public class Slow_or_Steady extends Feature {
	{
		name = "Slow or Steady";
		tags = "[+Defense]";
		frequency = "Static";
		effect = "Choose Analytic or Battle Armor. You gain the chosen ability.";
		prereqs.put("Fortress", -1);
	}
	public Slow_or_Steady(){}
	@Override
	public boolean checkPrereqs(Trainer t) {
		return t.hasFeat("Fortress");
	}
}