package PTUCharacterCreator.Feats;
import PTUCharacterCreator.Trainer;
import PTUCharacterCreator.Feature;
public class Flexible_Form extends Feature {
	{
		name = "Flexible Form";
		tags = "[+Defense]";
		frequency = "Static";
		effect = "Your body becomes more malleable, and even your bones are able to flex when required. You do not gain Wounds from taking Massive damage, and you gain a +2 Bonus to any Acrobatics or Athletics Check made to bend, squeeze, or otherwise contort your body - including those to avoid Trip or Grapple maneuvers.";
		prereqs.put("Miasmic", -1);
	}
	public Flexible_Form(){}
	@Override
	public boolean checkPrereqs(Trainer t) {
		return t.hasFeat("Miasmic");
	}
}