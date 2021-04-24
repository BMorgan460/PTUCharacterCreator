package PTUCharacterCreator.Feats;
import PTUCharacterCreator.Trainer;
import PTUCharacterCreator.Feature;
public class Boo extends Feature {
	{
		name = "Boo!";
		tags = "";
		frequency = "Daily x3 - Free Action";
		effect = "Trigger: Your Pokemon reappears after using Ghost Step, or the set-up phase of Phantom Force or Shadow Force Effect: The next Ghost-Type attack the target makes that turn gains the Smite keyword and cant be Intercepted or avoided in any way (Dodge, Parry, Shield Moves, etc).";
		prereqs.put("Ghost Step", -1);
		prereqs.put("Type-Linked Skill at Master", 0);
	}
	public Boo(){}
	@Override
	public boolean checkPrereqs(Trainer t) {
		return t.hasFeat("Ghost Step");
	}
}