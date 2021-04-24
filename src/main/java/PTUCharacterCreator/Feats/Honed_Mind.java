package PTUCharacterCreator.Feats;
import PTUCharacterCreator.Trainer;
import PTUCharacterCreator.Feature;
public class Honed_Mind extends Feature {
	{
		name = "Honed Mind";
		tags = "[+Special Defense]";
		frequency = "Static";
		effect = "You learn the Moves Mind Reader and Calm Mind.";
		prereqs.put("Telepath", -1);
	}
	public Honed_Mind(){}
	@Override
	public boolean checkPrereqs(Trainer t) {
		return t.hasFeat("Telepath");
	}
}