package PTUCharacterCreator.Feats;
import PTUCharacterCreator.Trainer;
import PTUCharacterCreator.Feature;
public class Twisted_Soul extends Feature {
	{
		name = "Twisted Soul";
		tags = "[+Attack or Special Attack]";
		frequency = "Static";
		effect = "You gain the Twisted Power Ability.";
		prereqs.put("Shade Caller", -1);
	}
	public Twisted_Soul(){}
	@Override
	public boolean checkPrereqs(Trainer t) {
		return t.hasFeat("Shade Caller");
	}
}