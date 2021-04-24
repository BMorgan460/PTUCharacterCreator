package PTUCharacterCreator.Feats;
import PTUCharacterCreator.Trainer;
import PTUCharacterCreator.Feature;
public class Mt_Moon_Blues extends Feature {
	{
		name = "Mt. Moon Blues";
		tags = "[+Special Attack]";
		frequency = "Static";
		effect = "You learn the Moves Sing and Supersonic";
		prereqs.put("Musician", -1);
	}
	public Mt_Moon_Blues(){}
	@Override
	public boolean checkPrereqs(Trainer t) {
		return t.hasFeat("Musician");
	}
}