package PTUCharacterCreator.Feats;
import PTUCharacterCreator.Trainer;
import PTUCharacterCreator.Feature;
public class Highly_Responsive_to_Prayers extends Feature {
	{
		name = "Highly Responsive to Prayers";
		tags = "[+HP]";
		frequency = "Scene x3 - Free Action";
		effect = "Trigger: You use the Blessed Touch or Healer Ability on an ally, or an ally receives an Injury Effect: You may use the Sage Feature as a Free Action targeting the triggering ally. Multiple instances of Sages effect that you use may stack when used this way.";
		prereqs.put("Lay on Hands", -1);
	}
	public Highly_Responsive_to_Prayers(){}
	@Override
	public boolean checkPrereqs(Trainer t) {
		return t.hasFeat("Lay on Hands");
	}
}