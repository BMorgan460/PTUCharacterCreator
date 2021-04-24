package PTUCharacterCreator.Feats;
import PTUCharacterCreator.Trainer;
import PTUCharacterCreator.Feature;
public class Lets_Be_Friends extends Feature {
	{
		name = "Let's Be Friends!";
		tags = "";
		frequency = "Daily/5 - Free Action";
		effect = "Target: Your Pokemon: The target may attempt to improve the disposition of a Wild Pokemon as if making a Charm Check. They roll their Cute Dice from Poffins and add their number of Cute Dice from Stats as a modifier. For example, a Pokemon with 4d6 Cute from Poffins and 3d6 Cute from Speed rolls 4d6+3 in place of a Charm Check.";
		prereqs.put("Cute Cuddle Rank 1", -1);
	}
	public Lets_Be_Friends(){}
	@Override
	public boolean checkPrereqs(Trainer t) {
		return t.hasFeat("Cute Cuddle Rank 1");
	}
}