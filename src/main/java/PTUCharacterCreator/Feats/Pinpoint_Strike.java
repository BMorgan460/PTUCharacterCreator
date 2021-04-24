package PTUCharacterCreator.Feats;
import PTUCharacterCreator.Trainer;
import PTUCharacterCreator.Feature;
public class Pinpoint_Strike extends Feature {
	{
		name = "Pinpoint Strike";
		tags = "[Orders][Stratagem]";
		frequency = "Bind 2 AP - Standard Action";
		effect = "Target: Your Pokemon Effect: Increase the Accuracy and Effect Range of the targets damaging attacks by +2. These attacks deal 5 less damage, before applying weakness and resistance.";
		prereqs.put("Precision Orders", -1);
	}
	public Pinpoint_Strike(){}
	@Override
	public boolean checkPrereqs(Trainer t) {
		return t.hasFeat("Precision Orders");
	}
}