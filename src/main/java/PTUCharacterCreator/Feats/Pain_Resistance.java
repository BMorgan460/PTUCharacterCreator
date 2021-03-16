package PTUCharacterCreator.Feats;
import PTUCharacterCreator.Feature;
public class Pain_Resistance extends Feature {
	{
		name = "Pain Resistance";
		tags = "";
		frequency = "1 AP - Free Action";
		effect = "Trigger: Your Pokemon with 1 or more injuries takes Damage Effect: Your Pokemon gains X Damage Reduction against the triggering attack, where X is its Tick Value multiplied by the number of Injuries it has. This may be triggered once per Scene per Pokemon.";
	}
	public Pain_Resistance(){}
}