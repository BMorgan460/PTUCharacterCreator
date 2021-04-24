package PTUCharacterCreator.Feats;
import PTUCharacterCreator.Trainer;
import PTUCharacterCreator.Feature;
public class Signature_Move extends Feature {
	{
		name = "Signature Move";
		tags = "[+Any]";
		frequency = "Static";
		effect = "Choose a Move you know. Increase the Moves Frequency one step, as if you had used a PP Up. This choice cannot be changed once made. This Feature may not select Moves known through temporary means, nor can these Moves be used to qualify for this Feature.";
		prereqs.put("Learned four Moves", 0);
	}
	public Signature_Move(){}
	@Override
	public boolean checkPrereqs(Trainer t) {
		return false;
	}
}