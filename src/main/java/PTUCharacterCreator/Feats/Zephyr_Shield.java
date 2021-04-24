package PTUCharacterCreator.Feats;
import PTUCharacterCreator.Trainer;
import PTUCharacterCreator.Feature;
public class Zephyr_Shield extends Feature {
	{
		name = "Zephyr Shield";
		tags = "";
		frequency = "At-Will - Special";
		effect = "Your Flying-Type Pokemon may activate Zephyr Shield as a Standard Action Interrupt, or as a Shift Action during their turn. If they do, until the end of the users next turn, all ranged attacks targetting them take a -1 penalty to Accuracy and -10 penalty to damage, they become immune to the effects of Moves with the Powder keyword, and they do not lose Hit Points from Weather effects. Additionally, if Zephyr Shield is used as a Standard Action, that Pokemon may use the Resolution Effect of a Flying-Type Move with the Set- Up keyword on their next turn, skipping the Set-Up phase.";
		prereqs.put("Celerity", -1);
		prereqs.put("Type-Linked Skill at Expert", 0);
	}
	public Zephyr_Shield(){}
	@Override
	public boolean checkPrereqs(Trainer t) {
		return t.hasFeat("Celerity");
	}
}