package PTUCharacterCreator.Feats;
import PTUCharacterCreator.Feature;
public class DeadEye_Shot extends Feature {
	{
		name = "Dead-Eye Shot";
		tags = "[+Attack][Weapon]";
		frequency = "Scene x2 - Standard, Priority";
		effect = "Use of Dead-Eye Shot must be declared at the start of the round. Nothings happens at this time. At the end of the round, the user may use their Shift Action, and then make a Ranged Weapon Attack and roll twice for Accuracy. You may resolve the attack using either result, but if you choose to use the lower result and the attack hits, it is automatically a Critical Hit.";
	}
	public DeadEye_Shot(){}
}