package PTUCharacterCreator.Feats;
import PTUCharacterCreator.Trainer;
import PTUCharacterCreator.Feature;
public class PK_Alpha extends Feature {
	{
		name = "PK Alpha";
		tags = "[+Special Attack]";
		frequency = "Static";
		effect = "You learn the Moves Kinesis and Barrier.";
		prereqs.put("Telekinetic", -1);
	}
	public PK_Alpha(){}
	@Override
	public boolean checkPrereqs(Trainer t) {
		return t.hasFeat("Telekinetic");
	}
}