package PTUCharacterCreator.Feats;
import PTUCharacterCreator.Trainer;
import PTUCharacterCreator.Feature;
public class Strike_Again extends Feature {
	{
		name = "Strike Again!";
		tags = "[Orders]";
		frequency = "Scene - Standard Action";
		effect = "Target: Your Pokemon Effect: The target may immediately take an additional Standard Action to use an At-Will attack.";
		prereqs.put("Ravager Orders", -1);
	}
	public Strike_Again(){}
	@Override
	public boolean checkPrereqs(Trainer t) {
		return t.hasFeat("Ravager Orders");
	}
}