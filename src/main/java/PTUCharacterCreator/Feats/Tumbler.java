package PTUCharacterCreator.Feats;
import PTUCharacterCreator.Trainer;
import PTUCharacterCreator.Feature;
public class Tumbler extends Feature {
	{
		name = "Tumbler";
		tags = "[Class] [+Speed]";
		frequency = "Static";
		effect = "You gain the Run Away Ability.";
		prereqs.put("Acrobat", -3);
	}
	public Tumbler(){}
	@Override
	public boolean checkPrereqs(Trainer t) {
		return t.hasEdge("Acrobat");
	}
}