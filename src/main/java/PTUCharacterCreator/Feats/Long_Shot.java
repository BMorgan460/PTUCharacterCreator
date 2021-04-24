package PTUCharacterCreator.Feats;
import PTUCharacterCreator.Trainer;
import PTUCharacterCreator.Feature;
public class Long_Shot extends Feature {
	{
		name = "Long Shot";
		tags = "[Orders]";
		frequency = "Scene x2 - Standard Action";
		effect = "Target: Your Pokemon Effect: The targets damaging ranged attacks have their range doubled until the end of their next turn, and deal X additional damage. X is equal to the distance in meters that the attack traveled. Long Shot does not increase the size of area of effect attacks. If attacks altered by Long Shot are Critical Hits, add the value of the Damage Dice Roll an additional time to the total damage.";
		prereqs.put("Marksman Orders", -1);
	}
	public Long_Shot(){}
	@Override
	public boolean checkPrereqs(Trainer t) {
		return t.hasFeat("Marksman Orders");
	}
}