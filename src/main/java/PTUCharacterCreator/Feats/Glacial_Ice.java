package PTUCharacterCreator.Feats;
import PTUCharacterCreator.Trainer;
import PTUCharacterCreator.Feature;
public class Glacial_Ice extends Feature {
	{
		name = "Glacial Ice";
		tags = "";
		frequency = "Static";
		effect = "Your Ice-Type Pokemon gain Damage Reduction equal to your Type-Linked Skill Rank against Fighting, Fire, Rock, and Steel-Typed Attacks from which they would take Super-Effective Damage.";
		prereqs.put("Type Ace", -1);
		prereqs.put("Ice as Chosen Type", 0);
	}
	public Glacial_Ice(){}
	@Override
	public boolean checkPrereqs(Trainer t) {
		return t.hasFeat("Type Ace");
	}
}