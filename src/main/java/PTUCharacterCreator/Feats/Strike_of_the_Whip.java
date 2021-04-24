package PTUCharacterCreator.Feats;
import PTUCharacterCreator.Trainer;
import PTUCharacterCreator.Feature;
public class Strike_of_the_Whip extends Feature {
	{
		name = "Strike of the Whip";
		tags = "";
		frequency = "At-Will - Swift Action";
		effect = "Trigger: You use Press Effect: You may apply 1 or more of the following effects to the Pokemon hit by Press: »» Give the target 1 Injury and a Tick of Temporary Hit Points. »» Spend 1 AP and cure the target of Confusion, Infatuation, Rage, and Suppression. »» Use an [Orders] with targets you have on the target as a Free Action.";
		prereqs.put("Taskmaster", -1);
		prereqs.put("Press", -1);
	}
	public Strike_of_the_Whip(){}
	@Override
	public boolean checkPrereqs(Trainer t) {
		return t.hasFeat("Taskmaster") && t.hasFeat("Press");
	}
}