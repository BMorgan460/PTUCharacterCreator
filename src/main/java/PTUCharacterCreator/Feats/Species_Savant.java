package PTUCharacterCreator.Feats;
import PTUCharacterCreator.Trainer;
import PTUCharacterCreator.Feature;
public class Species_Savant extends Feature {
	{
		name = "Species Savant";
		tags = "";
		frequency = "Static";
		effect = "When you take Species Savant, choose a single Evolutionary Family. Your Pokemon of your Chosen Evolutionary Family have each of their Base Stats increased by +1.";
		prereqs.put("3 different individual Pokemon of the same evolutionary line", 0);
	}
	public Species_Savant(){}
	@Override
	public boolean checkPrereqs(Trainer t) {
		return true;
	}
}